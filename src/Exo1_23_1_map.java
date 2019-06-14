import java.util.HashMap;

public class Exo1_23_1_map {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String arg : args) {
            if (map.get(arg) == null) {
                map.put(arg, 1);
            } else {
                map.put(arg, (map.get(arg) + 1));
            }
            /*System.out.println(map);*/
        }
        System.out.println(map);
    }
}