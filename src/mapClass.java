import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapClass {
    public static void main(String[] args){
        Map<String,String> mapOne = new HashMap<>();
        mapOne.put("Name", "Azeer");
        mapOne.put("Id","11805521");
        mapOne.put("Ph.no","9381587797");
        System.out.println("Map: "+mapOne);
        System.out.println("Keys: "+mapOne.keySet());
        System.out.println("Values: "+mapOne.values());
        System.out.println("Key contains: "+mapOne.containsKey("Name"));
        System.out.println("Value contains: "+mapOne.containsValue("11805521"));
        System.out.println("Get value: "+ mapOne.get("Ph.no"));
        System.out.println("Entry value: "+mapOne.entrySet());
        System.out.println("Remove key: "+mapOne.remove("Name"));
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One",1);
        numbers.put("two",22);
        numbers.put("three",3);
        numbers.put("four",4);
        System.out.println("Value replacing: "+numbers.replace("two",22,2));
        System.out.println(numbers);
    }
}
