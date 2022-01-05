package CarRentalSystem.com;

import java.util.Scanner;

public class rootConsole {
    private Scanner cin = new Scanner(System.in);
    private carFunction p;
    private boolean isBase = false;

    public static void Prompt() { //声明静态方法，之后其他类调用也不用先new
        System.out.println("欢迎进入自助车辆管理系统");
        System.out.println("-------------------------------------");
        System.out.println("1.新 增 车 辆");
        System.out.println("2.查 询 车 辆");
        System.out.println("3.删 除 车 辆");
        System.out.println("4.更 改 信 息");
        System.out.println("5.算 营 业 额");
        System.out.println("6.查看排名(新增功能)");
        System.out.println("7.退  出 ");
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
                        System.out.println("请输入新增车辆的名称:");
                        p.car_Add(cin.next());
                        break;
                    case 2:
                        p.car_book_Find2();
                        break;
                    case 3:
                        System.out.println("请输入要删除车辆的名字:");
                        p.car_Delete(cin.next());
                        break;
                    case 4:
                        System.out.println("请输入要更改车辆的名字:");
                        p.car_Delete(cin.next());
                        System.out.println("请输入修改车辆的全部信息:");
                        p.car_Add(cin.next());
                        break;
                    case 5:
                        System.out.println("输入借了小轿车好多辆:");
                        System.out.println("输入借了货车好多辆:");
                        System.out.println("输入借了客车好多辆:");
                        System.out.println("输入借了小轿车好多天:");
                        System.out.println("输入借了货车好多天:");
                        System.out.println("输入借了客车好多天:");
                        p.car_count();
                        System.out.println("营业额为:");
                        break;
                    case 6:
                        p.car_print_Rank2();
                        break;
                    case 7:
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
