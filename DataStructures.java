import java.util.*;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class DataStructures{
    public static void main(String args[]){


        //List-ArrayList and LinkedList
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Honda");
        cars.add("BMW");
        cars.add(0,"Mazda");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(0));

        Collections.sort(cars);
        for(int i=0;i<cars.size();i++){
            System.out.print(cars.get(i)+",");
        }

        int index=Collections.binarySearch(cars,"BMW");
        System.out.println("\nBMW is at index : "+index);

        System.out.println();
        Collections.sort(cars,Collections.reverseOrder());
        for (String i:cars){
            System.out.print(i+",");
        }
        
        cars.set(1,"Piyush");
        System.out.println("\n"+cars);
        cars.remove(1);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        
        
        LinkedList<String> toy=new LinkedList<>();
        toy.add("Car");
        toy.addFirst("Transformer");
        System.out.println(toy);
        

        //Set-HashSet , TreeSet and LinkedHashSet
        HashSet<Integer> rollno=new HashSet<Integer>();
        rollno.add(1);
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        System.out.println(rollno);
        System.out.println(rollno.contains(2));
        rollno.remove(3);
        System.out.println(rollno);
        rollno.add(4);
        System.out.println(rollno.size());
        for (int i:rollno){
            System.out.print(i+" ");
        }
        System.out.println();
        rollno.clear();        
        System.out.println(rollno);

        // Set<String> car=new HashSet<>();
        // car.add("Piyush");

        Set<Integer> empid=new TreeSet<>();
        empid.add(001);
        empid.add(003);
        empid.add(002);
        empid.add(002);

        System.out.println(empid);


        Set<Integer> id=new LinkedHashSet<>();
        id.add(101);
        id.add(101);
        id.add(102);
        id.add(103);
        System.out.println(id);


        //Map- HashMap , TreeMap and LinkedHashMap
        Map<String,Integer> emp = new HashMap<>();
        emp.put("Piyush",001);
        emp.put("Yash",001);
        emp.put("Sanika",002);
        emp.put("Piyush",001);
        // emp.put("Yash",002);

        System.out.println(emp);
        System.out.println(emp.get("Piyush"));
        emp.remove("Piyush");
        System.out.println(emp);
        for (String i : emp.keySet()){
            System.out.println("Key :"+i+" Value : "+emp.get(i)); 
        }
        
        Iterator<Integer> t=id.iterator();
        while(t.hasNext()){
        System.out.println(t.next());
        }
    }
}