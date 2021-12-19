package CarRentalSystem.com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class carFunction {
    carData car;

    public carFunction(int m) {
        car = new carData(m);
    }

    public void initBaseinfo() {
        car.name[0] = "小轿车";
        car.price[0] = "100/天";
        car.isLoan[0] = true;
        car.date[0] = "2021-12-12";
        car.loanSize[0] = 30;

        car.name[1] = "货车";
        car.price[1] = "200/天";
        car.isLoan[1] = false;
        car.loanSize[1] = 30;

        car.name[2] = "客车";
        car.price[2] = "150/天";
        car.isLoan[2] = false;
        car.loanSize[2] = 30;
    }

    public void returnMain() {
        Scanner cin = new Scanner(System.in);
        System.out.println("*********************");
        System.out.print("输入0返回：");
        if (cin.nextInt() == 0) {
            userConsole.Prompt();
        } else {
            System.out.println("出错了！");
            System.exit(0);
        }
    }

    public void returnMain2() {
        Scanner cin = new Scanner(System.in);
        System.out.println("*********************");
        System.out.print("输入0返回：");
        if (cin.nextInt() == 0) {
            rootConsole.Prompt();
        } else {
            System.out.println("出错了！");
            System.exit(0);
        }
    }


    public void car_Add(String name) {
        for (int i = 0; i < car.name.length; i++) {
            if (car.name[i] == null) {
                car.name[i] = name;
                car.date[i] = null;
                car.isLoan[i] = false;
                car.loanSize[i] = 0;
                System.out.println("新增车辆" + "\"" + name + "\"" + "成功!");
                break;
            }
        }
        returnMain2();
    }

    public void car_Delete(String name) {


        boolean isYes = false, flag = false;
        for (int i = 0, j = 0; i < car.name.length; i++) {
            if (car.name[i] == null) {
                break;
            } else if (isYes) {
                if (car.isLoan[j] && name.equals(car.name[j])) {
                    System.out.println("\"" + name + "\"" + "处于借出状态，不能删除!正在查找其他符合要求的车辆...");
                }
                car.name[i] = null;
                car.date[i] = null;
                car.isLoan[i] = false;
                car.loanSize[i] = 0;
            } else if (name.equals(car.name[i]) && !car.isLoan[i]) {
                j = j == 0 ? i + 1 : j + 1;
                flag = true;
                while (j < car.name.length && car.name[j] != null && name.equals(car.name[j]) && !car.isLoan[j])
                    j++;
                if (j < car.name.length && car.name[j] != null) {
                    car.name[i] = car.name[j];
                    car.date[i] = car.date[j];
                    car.loanSize[i] = car.loanSize[j];
                    car.isLoan[i] = car.isLoan[j];
                    System.out.println("删除" + "\"" + name + "\"" + "成功!");
                } else {
                    isYes = true;
                    i--;
                }
            } else if (car.isLoan[i] && name.equals(car.name[i])) {
                System.out.println("\"" + name + "\"" + "处于借出状态，不能删除!正在查找其他符合要求的车辆...");
            }
        }
        if (!flag) {
            System.out.println("库中没有您要删除的车辆信息!");
        }
        returnMain2();
    }

    public void car_book_Find() {
        System.out.println("-----------> 查看---------->\n");
        System.out.println("序号\t状 态\t名称\t\t借出日期");
        for (int i = 0; i < car.name.length; i++) {
            if (car.name[i] == null) {
                break;
            } else if (car.isLoan[i] == true) {
                System.out.println((i + 1) + "\t已借出\t" + car.name[i] + "\t\t"
                        + car.date[i]);
            } else if (car.isLoan[i] == false) {
                System.out.println((i + 1) + "\t可 借\t" + car.name[i]);
            }
        }
        returnMain();
    }

    public void car_book_Find2() {
        System.out.println("-----------> 查看---------->\n");
        System.out.println("序号\t状 态\t名称\t\t借出日期");
        for (int i = 0; i < car.name.length; i++) {
            if (car.name[i] == null) {
                break;
            } else if (car.isLoan[i] == true) {
                System.out.println((i + 1) + "\t已借出\t" + car.name[i] + "\t\t"
                        + car.date[i]);
            } else if (car.isLoan[i] == false) {
                System.out.println((i + 1) + "\t可 借\t" + car.name[i]);
            }
        }
        returnMain2();
    }


    public void car_print_Rank() {
        String[] Name = new String[car.name.length];
        long[] loanSize = new long[car.name.length];
        int i;

        for (i = 0; i < car.name.length; i++) {
            if (car.name[i] == null) {
                break;
            } else {
                Name[i] = car.name[i];
                loanSize[i] = car.loanSize[i];
            }
        }

        System.out.println("名次\t\t名称\t\t热度");
        for (int j = 0, flag; j < i; j++) {
            flag = j;
            for (int j2 = j + 1; j2 < i; j2++) {
                if (loanSize[flag] < loanSize[j2]) {
                    flag = j2;
                }
            }
            if (flag != j) { //swap
                String temps = Name[flag];
                long tempi = loanSize[flag];
                Name[flag] = Name[j];
                loanSize[flag] = loanSize[j];
                Name[j] = temps;
                loanSize[j] = tempi;
            }
            System.out.println((j + 1) + "\t\t" + Name[j] + "\t\t" + loanSize[j]);
        }
        returnMain();
    }


    public void car_print_Rank2() {
        String[] Name = new String[car.name.length];
        long[] loanSize = new long[car.name.length];
        int i;

        for (i = 0; i < car.name.length; i++) {
            if (car.name[i] == null) {
                break;
            } else {
                Name[i] = car.name[i];
                loanSize[i] = car.loanSize[i];
            }
        }

        System.out.println("名次\t\t名称\t\t热度");
        for (int j = 0, flag; j < i; j++) {
            flag = j;
            for (int j2 = j + 1; j2 < i; j2++) {
                if (loanSize[flag] < loanSize[j2]) {
                    flag = j2;
                }
            }
            if (flag != j) { //swap
                String temps = Name[flag];
                long tempi = loanSize[flag];
                Name[flag] = Name[j];
                loanSize[flag] = loanSize[j];
                Name[j] = temps;
                loanSize[j] = tempi;
            }
            System.out.println((j + 1) + "\t\t" + Name[j] + "\t\t" + loanSize[j]);
        }
        returnMain2();
    }


    public void car_lend(String name, String date) {
        boolean isYes = false, flag = false;
        for (int i = 0; i < car.name.length; i++) {
            if (car.name[i] == null) {
                break;
            } else if (name.equals(car.name[i])) {
                flag = true;
                if (car.isLoan[i]) {
                    System.out.println("对不起，" + "\"" + name + "\"" + "已外借,正在为您查询其他同类型车辆,请稍后...");
                } else {
                    car.isLoan[i] = true;
                    car.date[i] = date;
                    isYes = true;
                    System.out.println("恭喜您!" + "\"" + name + "\"" + "借出成功!");
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println("对不起,库中尚未有" + "\"" + name + "\"" + "的信息!");
        } else if (!isYes) {
            System.out.println("对不起,目前库中的所有" + "\"" + name + "\"" + "车辆都已外借!");
        }
        returnMain();
    }

    //计算营业额
    public void car_count() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        double A;
        A = a * d;
        double B;
        B = b * e;
        double C;
        C = c * f;
        System.out.println("总营业额：" + (100 * A + 200 * B + 10 * C));

        returnMain2();
    }

    public void car_return(String name, String date) {
        boolean isYes = false, flag = false;
        long Time = -1;
        for (int i = 0; i < car.name.length; i++) {
            if (car.name[i] == null) {
                break;
            } else if (name.equals(car.name[i]) && car.isLoan[i]) {
                isYes = true;
                flag = true;
                SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date d1 = sj.parse(car.date[i]);
                    Date d2 = sj.parse(date);
                    Time = (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000);
                } catch (Exception e) {
                    System.out.println("计算时间时发生异常");
                } finally {
                    if (Time != -1) {
                        System.out.println("您借出了" + Time + "天!");
                        car.isLoan[i] = false;
                        car.loanSize[i] += Time;
                        car.date[i] = null;
                    }
                }
                break;
            } else if (name.equals(car.name[i]) && !car.isLoan[i]) {
                isYes = true;
            }
        }
        if (isYes) {
            if (!flag) {
                System.out.println("本车库的所有" + "\"" + name + "\"" + "车辆均已归还,请您核对下输入的信息是否有误!");
            }
        } else {
            System.out.println("对不起,系统中尚未对" + "\"" + name + "\"" + "车辆的备案，请联系后台人员核实信息!");
        }
        returnMain();
    }

    public boolean exit() {
        return false;
    }
}


