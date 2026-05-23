import java.util.*;
public class constructor {
    public static void main(String args[]){
       box bx=new box();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter length : ");
       bx.l=sc.nextDouble();
       System.out.print("Enter breadth : ");
       bx.b=sc.nextDouble();
       System.out.print("Enter height : ");
       bx.h=sc.nextDouble();
       bx.volume();
    }
}

class box{
    double l;
    double b;
    double h;
    void volume(){
        System.out.print("Volume is : "+(l*b*h));
    }
}
