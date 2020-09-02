package sunLaptop;

public class Test {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.laopen();

        USB usb = new Mouse();//多态写法
        laptop.useDevice(usb);

//        Keybord keybord = new Keybord();
//        laptop.useDevice(keybord);
        laptop.useDevice(new Keybord());
        laptop.laclose();
    }
}
