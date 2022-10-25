import java.util.Scanner;

public class Student {
    private String name ;
    private String sex ;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        System.out.println("请输入姓名：");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        this.name = name;
    }

    public String getSex() {
        System.out.println(sex);
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("请输入性别：");
        Scanner sc = new Scanner(System.in);
        sex = sc.next();
        if (sex.equals("男")){
            sex = "男";
        }
        else if (sex.equals("女")){
            sex = "女";
        }
        else{
            sex ="男";
        }
        this.sex = sex;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.setName(null);
        st.setSex(null);
        st.getName();
        st.getSex();
    }
}
