public class inteface {
    public static void main(String args[]){
        box c=new Car();
        c.left();
    }
}

interface box{
    int a =10;
    public void left();
    public void right();
}

class Car implements box{
    public void left(){
        System.out.print("Turn Left");
    }
       public void right(){
        System.out.print("Turn Right");
    }
}