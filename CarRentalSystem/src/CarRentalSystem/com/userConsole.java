package CarRentalSystem.com;

import java.util.Scanner;

public class userConsole {
    private Scanner cin = new Scanner(System.in);
    private carFunction p;
    private boolean isBase = false;

    public static void Prompt() { //声明静态方法，之后其他类调用也不用先new
        System.out.println("欢迎使用自助租车系统");
        System.out.println("-------------------------------------");
        System.out.println("1.查 询 车 辆");
        System.out.println("2.借 用 车 辆");
        System.out.println("3.归 还 车 辆");
        System.out.println("4.查 看 排 名（新增功能）");
        System.out.println("5.退  出 ");
        System.out.print("--------------------------------------\n");
    }

    public void setP(int maxSize) {
        if (maxSize > 0) {
            this.p = new carFunction(maxSize);
            this.isBase = true;
        } else {
            System.out.println("出错了!");
        }
    }

    public carFunction getP() {
        return p;
    }

    public void getInfo() {
        if (isBase) {
            Prompt();
            boolean isStart = true;
            while (isStart) {
                System.out.println("请选择:");
                int choice = cin.nextInt();
                switch (choice) {
                    case 1:
                        p.car_book_Find();
                        break;
                    case 2:
                        System.out.println("请输入要借出的车辆名称:");
                        String name = cin.next();
                        System.out.println("请输入借出的日期:");
                        String date = cin.next();
                        p.car_lend(name, date);
                        break;
                    case 3:
                        System.out.println("请输入要归还的车辆:");
                        String name1 = cin.next();
                        System.out.println("请输入归还的日期:");
                        String date1 = cin.next();
                        p.car_return(name1, date1);
                        break;
                    case 4:
                        p.car_print_Rank();
                        break;
                    case 5:
                        isStart = p.exit();
                        System.out.println("退出成功!");
                        break;
                    default:
                        System.out.println("输入有误!");
                        Prompt();
                        break;
                }
            }
        } else
            System.out.println("出错了！");
    }
}

