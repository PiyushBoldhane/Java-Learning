// 

public class inheritance{
    public static void main(String args[]){
        Cube c1=new Cubevol(10, 10, 10);
        System.out.print(c1.vol());
      
    }
}

class Cube{
    double l,b,h;
    Cube(){
        System.out.println("Super class");
    }
    public double vol(){
        return l*b*h;
    }
}

class Cubevol extends Cube{
    Cubevol(double l,double b,double h){
        System.out.println("Child class");
        this.l=l;
        this.b=b;
        this.h=h;
        System.out.println(super.l);
    }
  
}