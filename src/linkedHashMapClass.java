import java.util.LinkedHashMap;

public class linkedHashMapClass {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> Animals = new LinkedHashMap<>();
        Animals.put("Dog",5);
        Animals.put("Cat",7);
        Animals.put("Loin",4);
        Animals.put("Tiger",3);
        LinkedHashMap<String,Integer> animalDetails = new LinkedHashMap<>(Animals);
        animalDetails.put("Zebra",9);
        animalDetails.put("Chita",20);
        System.out.println("Animal Details: "+ animalDetails);
        System.out.println("Replace Dog: "+ animalDetails.replace("Dog",23));
        System.out.println("Remove Cat: "+ animalDetails.remove("Cat"));
        System.out.println("Final Result: "+ animalDetails);
        System.out.println("count of tigers: "+ animalDetails.get("Tiger"));
        animalDetails.clear();
        System.out.println("Check the, is Animal Details map empty: "+ animalDetails.isEmpty());

    }
}
