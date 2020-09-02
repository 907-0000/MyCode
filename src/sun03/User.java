package sun03;

public class User {
    private String name;
    private int money;
    public User(){

    }
    public User(String name){
        this();
        this.name = name;
    }
    public User(String name,int money){
        this.name = name;
        this.money =money;
    }
    public void setName(){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMoney(){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    public String show(){
        return "我的名字是：" + name + ", 我的余额：" + money;
    }
}
