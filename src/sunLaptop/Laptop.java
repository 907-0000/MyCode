package sunLaptop;

public class Laptop {
    public void laopen(){
        System.out.println("笔记本开机");
    }
    public void laclose(){
        System.out.println("笔记本关闭");
    }
    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse){//先判断
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();
        } else if (usb instanceof Keybord){
            Keybord keybord = (Keybord) usb;//向下转型
            keybord.type();
        }
        usb.close();
    }
}
