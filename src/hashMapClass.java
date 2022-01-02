import java.util.HashMap;
import java.util.Map;

public class hashMapClass {
    public static void main(String[] args){
        HashMap<String,Integer> Marks = new HashMap<>();
        Marks.put("C",56);
        Marks.put("C++",67);
        Marks.put("Python",88);
        Marks.put("Java",92);
        System.out.println("HashMap is: "+Marks);
        System.out.println("get C marks: "+Marks.get("C ") );
        System.out.println("Marks key set is: "+ Marks.keySet());
        System.out.println("marks Value Set of: "+ Marks.values());
        //Replace the Values.
        System.out.println("Replace the marks: "+Marks.replace("C ",65));
        //Remove the Keys.
        System.out.println("Remove the keys: "+ Marks.remove("C++ "));
        System.out.println("Final Map is: "+ Marks);
        HashMap<Integer, Integer> numbersOf = new HashMap<>();
        for(int i=1; i<=5; i++){
            numbersOf.put(i,i+5);
        }

        for(int j=1; j<=7; j++){
            System.out.println(numbersOf.get(j));
        }
        System.out.print("Keys: ");
        for(String key: Marks.keySet()){
            System.out.print(key);
            System.out.print(", ");
        }
        System.out.println();
        System.out.print("Values: ");
        for(Integer value: Marks.values()){
            System.out.print(value);
            System.out.print(", ");
        }
        System.out.println();
        System.out.print("Key and Values: ");
        for(Map.Entry<String,Integer> entry: Marks.entrySet()){
            System.out.print(entry);
            System.out.print(", ");
        }
    }
}
