package sun08;

public class Demo1 {
    public static void main(String[] args) {
        Body.Inner in1= new Body().new Inner();
        Body body = new Body();
        body.method();
    }
}
