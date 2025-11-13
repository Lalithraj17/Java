import java.util.*;
public class Hasmap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        map.put("Lalith","22bme044");
        map.put("Lena","22bme045");
        map.put("Faizal","22bme052");
        map.put("Gowis","22bme022");
        map.put("Prem","22bme064");
        map.put("Midhun","22bme051");
        System.out.print("RollNo of the Student to print : ");
        String a=sc.nextLine();
        System.out.println(map.get(a));
        System.out.print("RollNo of the Student to remove : ");
        String b=sc.nextLine();
        map.remove(b);
        // System.out.println("all student name : ");
        // for (String name : map.keySet()) {
        //     System.out.println(name);
        // }
        // System.out.println("All student marks: ");
        // for ( String RollNo : map.values()) {
        //     System.out.println(RollNo);
        // }
        System.out.println("x: all the name and roll no");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}