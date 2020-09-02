package sun01;

public class Demo2 extends Birs{
    private String empName;
    private int age;

    public Demo2() {
        super();
    }

    public Demo2(String empName) {
        super(empName);
    }

    public Demo2(String empName, int age) {
        super(empName,age);
    }

    @Override
    public String ShowInfo(){
        return super.ShowInfo();
    }
}
