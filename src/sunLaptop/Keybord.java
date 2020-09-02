package sunLaptop;

public class Keybord implements USB {
    @Override
    public void open() {
        System.out.println("键盘启动");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }
    public void type(){
        System.out.println("键盘输入事件");
    }
}
