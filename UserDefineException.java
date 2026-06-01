class MyException extends Exception{
    public MyException(String m){
        super(m);
    }
}

public class UserDefineException {
    public static void divide(int a,int b){
        if (b==0){
            throw new Divide("Dividing by Zero is not possible");
        }
        System.out.println("Result : "+(a/b));
    }
    public static void main(String args[]){
        try{
            divide(10, 0);
            throw new MyException("This is custom exception");
        }
        catch(MyException e){
            System.out.print(e);
        }
        catch(Divide d){
            System.out.print(d);
        }

    }
}

class Divide extends RuntimeException{
    public Divide(String m){
        super(m);
    }
}