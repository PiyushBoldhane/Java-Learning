public class Mutable_String {
    public static void main(String args[]){
        String a="Hello my name is Piyush";


        System.out.println("\nSubstring Function");
        String b=a.substring(4);
        System.out.println(b);
        String c=a.substring(4,15);
        System.out.println(c);
        
        System.out.println("\nModifying Strings");
        System.out.println("\n Concatenate");
        String s="   abc    ";
        System.out.println(s);
        System.out.println(s.hashCode());
        String s1=s.concat("def");
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(s1);
        System.out.println(s1.hashCode());
    
        System.out.println("\nReplace");
        System.out.println(s.replace('b','f'));
        System.out.println(s.trim());
       
        
    }
}
