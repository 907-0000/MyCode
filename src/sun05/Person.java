package sun05;

public class Person implements MyNoOneInterface {

    @Override
    public void firstmethod() {
        System.out.println("First override method！");
    }

    @Override
    public void secondmethod() {
        System.out.println("Second override method!");
    }
}
