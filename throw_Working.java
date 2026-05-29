import java.util.*;
public class throw_Working {
    public static void main(String args[]){
        int balance=1000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount : ");
        int withdraw = sc.nextInt();
        try{
            if (balance-withdraw<500){
                throw new Exception("Balance cant be less than 500");
            }
            else{
                balance =balance-withdraw;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }  
}
