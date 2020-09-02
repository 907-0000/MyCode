package sun07;

public class Demo1 {
    public static void main(String[] args) {
        Dog ha = new HaShiQi();
        ha.say();
        Dog go = new Golen();
        go.say();
        if (ha instanceof HaShiQi) {
            HaShiQi hashi = (HaShiQi) ha;
            hashi.show();
        }
        if (ha instanceof Golen) {
            //java.lang.ClassCastException
            Golen gol = (Golen) ha;
            ((Golen) ha).watchHa();
        }
    }
}
