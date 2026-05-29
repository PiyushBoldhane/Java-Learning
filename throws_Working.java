public class throws_Working {
    public static void main(String args[]){
        try{
            abc b=new abc();
            b.sum();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.print(e);
        }
    }
}

class abc{
    void sum() throws Exception{
        int a=10/0;
        System.out.println(a);
    }
}
