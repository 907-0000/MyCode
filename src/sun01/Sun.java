package sun01;
import java.util.Scanner;
public class Sun {
    public static void main(String[] args) {

        Demo1 em1 = new Demo1(Info2(), Info());
        System.out.println(em1.ShowInfo());

        Birs bi1 = new Birs(Info2(), Info());
        System.out.println(bi1.ShowInfo());

        Demo2 p1 = new Demo2(Info2(), Info());
        System.out.println(p1.ShowInfo());

    }
    public static int Info(){
        System.out.println("请输入您的年龄： ");
        //age
        Scanner sc = new Scanner(System.in); //从键盘输入
        int num = sc.nextInt();
//        System.out.println("您输入的年龄为：" + num);
        return num;
  }
    public static String Info2() {
        System.out.println("请输入您的姓名： ");
        //Name
        Scanner sc1 = new Scanner(System.in); //从键盘输入
        String name = sc1.next();
//        System.out.println("您输入的姓名为：" + name);
        return name;
    }
}
