package CarRentalSystem.com;

import java.util.Scanner;

public class rootConsole {
    private Scanner cin = new Scanner(System.in);
    private carFunction p;
    private boolean isBase = false;

    public static void Prompt() { //������̬������֮�����������Ҳ������new
        System.out.println("��ӭ����������������ϵͳ");
        System.out.println("-------------------------------------");
        System.out.println("1.�� �� �� ��");
        System.out.println("2.�� ѯ �� ��");
        System.out.println("3.ɾ �� �� ��");
        System.out.println("4.�� �� �� Ϣ");
        System.out.println("5.�� Ӫ ҵ ��");
        System.out.println("6.�鿴����(��������)");
        System.out.println("7.��  �� ");
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
                        System.out.println("��������������������:");
                        p.car_Add(cin.next());
                        break;
                    case 2:
                        p.car_book_Find2();
                        break;
                    case 3:
                        System.out.println("������Ҫɾ������������:");
                        p.car_Delete(cin.next());
                        break;
                    case 4:
                        System.out.println("������Ҫ���ĳ���������:");
                        p.car_Delete(cin.next());
                        System.out.println("�������޸ĳ�����ȫ����Ϣ:");
                        p.car_Add(cin.next());
                        break;
                    case 5:
                        System.out.println("�������С�γ��ö���:");
                        System.out.println("������˻����ö���:");
                        System.out.println("������˿ͳ��ö���:");
                        System.out.println("�������С�γ��ö���:");
                        System.out.println("������˻����ö���:");
                        System.out.println("������˿ͳ��ö���:");
                        p.car_count();
                        System.out.println("Ӫҵ��Ϊ:");
                        break;
                    case 6:
                        p.car_print_Rank2();
                        break;
                    case 7:
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
