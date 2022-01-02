import java.util.TreeMap;

public class treeMapClass {
    public static void main(String[] args){
        TreeMap<String, Integer> treeMapOne = new TreeMap<>();
        treeMapOne.put("One",1);
        treeMapOne.put("Two",2);
        treeMapOne.put("Three",3);
        treeMapOne.put("Five",5);
        treeMapOne.putIfAbsent("Four",4);

        //access the Tree Map.
        System.out.println("Numbers are: "+ treeMapOne);
        System.out.println("Sub Map is: "+ treeMapOne.subMap("Five","One"));
        int a = treeMapOne.get("Five");
        System.out.println("Get number is: "+ a);
        System.out.println("Get all keys: "+ treeMapOne.keySet());
        System.out.println("Get all values: "+ treeMapOne.values());
        System.out.println("Get both keys and values: "+ treeMapOne.entrySet());
        //remove the key values.
        int removeOf = treeMapOne.remove("Three");
        System.out.println("Remove the key: "+ removeOf);
        //replace the keys value.
        System.out.println("Change the values: "+ treeMapOne.replace("Five",6));
        // first and last keys ana values.
        System.out.println("First key values: "+treeMapOne.firstKey());
        System.out.println("First key and value: "+treeMapOne.firstEntry());
        System.out.println("Last key values: "+treeMapOne.lastKey());
        System.out.println("Last key and value: "+treeMapOne.lastEntry());
        //Poll first and last entry
        System.out.println("First Entry is: " + treeMapOne.firstEntry());
        System.out.println("Last Entry is: " + treeMapOne.lastKey());
        //normal
        System.out.println(treeMapOne.size());
    }
}
