package sun11;

public class Demo2{
    private String text;

    public void Demo2(){

    }
    public void Demo2(String text){
        this.text = text;
    }

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }

    public void say(){

        System.out.println(text);
    }
}