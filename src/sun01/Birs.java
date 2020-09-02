package sun01;

public class Birs extends Demo1 {

    private String empName;
    private int age;

    public Birs() {
        super();
    }

    public Birs(String empName) {
        super(empName);
    }

    public Birs(String empName, int age) {
        super(empName,age);
    }

    @Override
    public String ShowInfo(){
        return super.ShowInfo();
    }
}
