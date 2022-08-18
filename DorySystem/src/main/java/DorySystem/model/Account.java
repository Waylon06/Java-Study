package DorySystem.model;

public class Account {

    private int id;
    private String name;
    private String password;
    private int identfy;

    public Account() {
    }

    public Account(int id, String name, String password, int identfy) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.identfy = identfy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getIdentfy() {
        return identfy;
    }

    public void setIdentfy(int identfy) {
        this.identfy = identfy;
    }

    //    toString


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", identfy=" + identfy +
                '}';
    }
}
