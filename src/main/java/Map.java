import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<String, String> map = new HashMap<>();
        map.put("Koala","bamboo");
        map.put("lion","meat");
        map.put("tiger","meat");
        map.put("giraffe","leaf");

        String food = map.get("Koala");
        for (String key : map.keySet())
        System.out.println(key+ "");
        System.out.println();


    }
}
