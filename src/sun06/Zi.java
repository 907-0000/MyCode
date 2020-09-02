package sun06;

public class Zi extends Fu{
    int num = 20;
    @Override
    public void methodA(){
        System.out.println("子类方法！！！");
    }

    public void methodZi(){
        System.out.println("子类覆盖重写！！");
    }
}
