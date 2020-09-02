package sun04;

public class Demo01Array {
    public static void main(String[] args) {
        /*创建*/
        Person[] Array = new Person[3];

        Person per1 = new Person("张三",18);
        Person per2 = new Person("李四",20);
        Person per3 = new Person("王五",21);

         Array[0] = per1;
         Array[1] = per2;
         Array[2] = per3;

        System.out.println(Array[0]);
        System.out.println(Array[1]);
        System.out.println(Array[2]);

        System.out.println(Array[0].getName());
        System.out.println(Array[1].getName());
        System.out.println(Array[2].getName());
        System.out.println(Array[0].getAge());
        System.out.println(Array[1].getAge());
        System.out.println(Array[2].getAge());

    }
}
