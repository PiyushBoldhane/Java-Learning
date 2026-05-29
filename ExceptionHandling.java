import java.io.IOException;

public class ExceptionHandling {
    public static void main(String args[]){
        try{
               int c[]={1,2,3};
               c[42]=99;
            }
        catch(Exception e){
            System.out.println(e);
        }
        int b=5/10;
        System.out.println(b);
    }
}
