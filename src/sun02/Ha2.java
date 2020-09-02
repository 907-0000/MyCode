package sun02;

public class Ha2 extends Dog {
    @Override
    public void eat() {
        System.out.println("吃屎！！！");
    }

    @Override
    public void say() {
        super.say();
    }
}
