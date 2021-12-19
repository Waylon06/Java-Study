package CarRentalSystem.com;

import java.util.Scanner;

public class userConsole {
    private Scanner cin = new Scanner(System.in);
    private carFunction p;
    private boolean isBase = false;

    public static void Prompt() { //������̬������֮�����������Ҳ������new
        System.out.println("��ӭʹ�������⳵ϵͳ");
        System.out.println("-------------------------------------");
        System.out.println("1.�� ѯ �� ��");
        System.out.println("2.�� �� �� ��");
        System.out.println("3.�� �� �� ��");
        System.out.println("4.�� �� �� �����������ܣ�");
        System.out.println("5.��  �� ");
        System.out.print("--------------------------------------\n");
    }

    public void setP(int maxSize) {
        if (maxSize > 0) {
            this.p = new carFunction(maxSize);
            this.isBase = true;
        } else {
            System.out.println("������!");
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
                System.out.println("��ѡ��:");
                int choice = cin.nextInt();
                switch (choice) {
                    case 1:
                        p.car_book_Find();
                        break;
                    case 2:
                        System.out.println("������Ҫ����ĳ�������:");
                        String name = cin.next();
                        System.out.println("��������������:");
                        String date = cin.next();
                        p.car_lend(name, date);
                        break;
                    case 3:
                        System.out.println("������Ҫ�黹�ĳ���:");
                        String name1 = cin.next();
                        System.out.println("������黹������:");
                        String date1 = cin.next();
                        p.car_return(name1, date1);
                        break;
                    case 4:
                        p.car_print_Rank();
                        break;
                    case 5:
                        isStart = p.exit();
                        System.out.println("�˳��ɹ�!");
                        break;
                    default:
                        System.out.println("��������!");
                        Prompt();
                        break;
                }
            }
        } else
            System.out.println("�����ˣ�");
    }
}

