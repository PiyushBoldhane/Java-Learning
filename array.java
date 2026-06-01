import java.util.*;
public class array {
    public static void main (String args[]){
        String[] car={"String","BMW"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter Elements : ");

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for (Integer i:a){
            System.out.print(i+" ");
        }
        System.out.println(car[0]);
        System.out.println(car.length);
        car[0]="YAHAMA";
        for (String i:car){
            System.out.println(i);
        }

    }

}
