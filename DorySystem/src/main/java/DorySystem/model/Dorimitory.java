package DorySystem.model;

public class Dorimitory {

    private String dname;
    private int dfloor;
    private int dnum;
    private String dstate;
    private String sname;
    private String sinstructor;
    private String sstate;
    private int id;

    public Dorimitory() {
    }

    public Dorimitory(String dname, int dfloor, int dnum, String dstate, String sname, String sinstructor, String sstate, int id) {
        this.dname = dname;
        this.dfloor = dfloor;
        this.dnum = dnum;
        this.dstate = dstate;
        this.sname = sname;
        this.sinstructor = sinstructor;
        this.sstate = sstate;
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDfloor() {
        return dfloor;
    }

    public void setDfloor(int dfloor) {
        this.dfloor = dfloor;
    }

    public int getDnum() {
        return dnum;
    }

    public void setDnum(int dnum) {
        this.dnum = dnum;
    }

    public String getDstate() {
        return dstate;
    }

    public void setDstate(String dstate) {
        this.dstate = dstate;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSinstructor() {
        return sinstructor;
    }

    public void setSinstructor(String sinstructor) {
        this.sinstructor = sinstructor;
    }

    public String getSstate() {
        return sstate;
    }

    public void setSstate(String sstate) {
        this.sstate = sstate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dorimitory{" +
                "dname='" + dname + '\'' +
                ", dfloor=" + dfloor +
                ", dnum=" + dnum +
                ", dstate='" + dstate + '\'' +
                ", sname='" + sname + '\'' +
                ", sinstructor='" + sinstructor + '\'' +
                ", sstate='" + sstate + '\'' +
                ", id=" + id +
                '}';
    }
}
