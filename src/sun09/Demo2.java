package sun09;

public class Demo2 {
    public static void main(String[] args) {
        AbstractDemo abs = new AbstractDemo() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法的覆盖重写！！");
            }
        };
        abs.method();
        MyInterfaceDemo obj = new MyInterfaceDemo() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了接口方法的覆盖重写！！");
            }
        };
        obj.method1();
    }
}
