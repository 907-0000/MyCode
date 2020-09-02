package sun05;

public interface InterfaceDefault {
    public default void say(String sa){
        System.out.println("say: " + sa );
        InterfaceDefault.code1();
    }
    public default void eat(String food){
        System.out.println("Eating " + food);
        InterfaceDefault.run(16);
    }
    public static void run(int speed){
        InterfaceDefault.code1();
        System.out.println("run's speed is " + speed);
    }
    public static void code1(){
        System.out.println("============================" );
        System.out.println("============================" );
        System.out.println("============================" );
        System.out.println("============================" );
        System.out.println("============================" );
    }
}
