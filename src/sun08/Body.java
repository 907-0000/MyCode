package sun08;
import java.util.Scanner;
public class Body {
    public class Inner{
        String name;
        public void Inner(){
            System.out.println("nothing");
        }
        public void Inner(String name){
            this.name = name;
        }
        public void showIn(String name){
            System.out.println("我的名字是：" + name);
        }
    }

    public void method(){
       Inner in = new Inner();
       Scanner sc = new Scanner(System.in);

       in.showIn(sc.next());

    }

}
