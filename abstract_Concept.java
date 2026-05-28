public class abstract_Concept {
    public static void main(String args[]){
        Swift c=new Swift();
        System.out.print(c.avg());
    }
}

abstract class Car{
    public abstract double avg();
}

class Swift extends Car{
    public double avg(){
        return 22.5;
    }
}