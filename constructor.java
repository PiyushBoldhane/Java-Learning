
public class constructor {
    public static void main(String args[]){
    //    box bx=new box(10,10,10);
    //    box bx1=new box(bx);
    // //    Scanner sc = new Scanner(System.in);
    // //    System.out.print("Enter length : ");
    // //    bx.l=sc.nextDouble();
    // //    System.out.print("Enter breadth : ");
    // //    bx.b=sc.nextDouble();
    // //    System.out.print("Enter height : ");
    // //    bx.h=sc.nextDouble();
    //     double vol=bx.volume();
    //     System.out.print("Volume  : "+vol);
    //     bx.display();
    //     bx1.display();
    box.show();
    }
}

class box{
    double l;
    double b;
    double h;
    box(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    box(box b){
        System.out.println("Copy constructor");
        this.l=b.l;
        this.b=b.b;
        this.h=b.h;
    }
    double volume(){
        return (l*b*h);
    }
    
    void display(){
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }

    static void show(){
        System.out.println("Hello ");
    }
    static{
        System.out.println("Hello Static");
    }
}
