class String_Buffer{
    public static void main(String args[]){
        StringBuffer s= new StringBuffer("Piyush");
        System.out.println("Length And Capacity");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
        
        System.out.println("\nSome Methods");
        System.out.println(s.charAt(2));
        s.setCharAt(2,'A');
        System.out.println(s);
        
        System.out.println(s.append(" Boldhane"));
        System.out.println(s.insert(0,"My "));
        System.out.println(s.replace(6,6,"y"));
        System.out.println(s.delete(0,3));
        System.out.println(s.reverse());
        
    }
}