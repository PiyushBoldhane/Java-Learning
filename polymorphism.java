public class polymorphism {
    public static void main(String args[]){
        Overloading obj=new Overriding();
        Overriding obj1=new Overriding();
        obj.display(10,10);
        obj1.show();
        obj1.display();
    }   
}

class Overloading{
    // Overloading(){
    //     System.out.println("Defalut Constructor");
    // }

    // Overloading(int a){
    //     System.out.println(a);
    // }

    // Overloading(int a,int b){
    //     System.out.println(a+" "+b);
    // }

    void display(){
        System.out.println("Defalut Constructor");
    }

    void display(int a){
        System.out.println(a);
    }

    void display(int a,int b){
        System.out.println(a+" "+b);
    }

}

class Overriding extends Overloading{
    void display(int a,int b){
        System.out.println(a+b);
    }
    void show(){
        System.out.println("Cant Access");

    }
}
