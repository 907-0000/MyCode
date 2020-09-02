package sun01;

import java.util.Scanner;

public class Demo1 {
    private String empName;
    private int age;

    public Demo1() {
        this("Don't have anything!!");//调用本类有参构造（单参构造）
    }

    public Demo1(String empName) {
        this.empName = empName;
    }
    public Demo1(String empName, int age) {
        this(empName);
        this.age = age;
    }
    public String ShowInfo(){
        return "员工姓名：" + this.empName + "; 员工年龄：" + this.age;
    }

}

