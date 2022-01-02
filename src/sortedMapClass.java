import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMapClass {
    public static void main(String[] args){
        SortedMap<String, Integer> sortedOne = new TreeMap<>();
        sortedOne.put("One",1);
        sortedOne.put("Two",2);
        sortedOne.put("Three",3);
        sortedOne.put("Four",4);
        sortedOne.put("Five",5);

        System.out.println("Sorted Map is: "+ sortedOne);
        System.out.println("First key in Map: "+ sortedOne.firstKey());
        System.out.println("Last key in Map: "+ sortedOne.lastKey());
        System.out.println("Sub Map is: "+ sortedOne.subMap("One","Two"));

        System.out.println(sortedOne.comparator());
        System.out.println(sortedOne.size());
        System.out.println(sortedOne.entrySet());

    }
}
