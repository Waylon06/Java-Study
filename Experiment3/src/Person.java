public class Person {
    public String  aName(String name){
        System.out.println(name);
        return name;
    }

    public String nameAndAge(String name,int age){
        System.out.println(name+age);
        return name;
    }

    public void kong(){
        aName("小丽");
        nameAndAge("小花",18);
    }

    public static void main(String[] args) {
        Person person = new Person();
        String name ;
        int age;
        person.kong();
    }
}
