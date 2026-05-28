public class string {
    public static void main(String args[]){
        char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String s1="abc";
        String s3="abc";
        String s2="efg";
        String s = new String(chars);
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        char c[] = new char[4];
        s.getChars(0,4,chars,0);
        System.out.println(chars);
        
        System.out.println("\nCompare");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        
        
        System.out.println("\nStart and end");
        System.out.println("ABCD".startsWith("AB"));
        System.out.println("ABCD".startsWith("CD"));
        System.out.println("ABCD".endsWith("CD"));
        System.out.println("ABCD".endsWith("AB"));
        
        
        System.out.println("\nEqual and ==");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        
        System.out.println("\nUsing CompareTo");
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s2));
        
        System.out.println("\nSearching String");
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("c"));
        System.out.println(s1.indexOf("a",1));
        System.out.println(s1.lastIndexOf("c",2));
        
        System.out.println(s1.indexOf("abc"));
        
    }
}
