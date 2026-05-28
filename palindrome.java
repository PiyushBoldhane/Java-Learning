import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the string : ");
        String c=s.next();
        
        StringBuffer str=new StringBuffer(c);
        str.reverse();

        if (c.equalsIgnoreCase(str.toString())){
            System.out.println("Strings is palindrome");
        }
        else{
            System.out.println("Strings is not palindrome");
        }
    }
}
