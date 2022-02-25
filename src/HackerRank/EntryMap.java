package HackerRank;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntryMap {
    public static void main(String[] args) {
        Map<String , Integer> realMap = new HashMap<>();
        realMap.put("Sinan",89);
        realMap.put("Hakkı",40);
        realMap.put("irem",25);
        realMap.put("Ertu",89);
        realMap.put("harry",84);

        Set<Map.Entry<String, Integer>> setMap = realMap.entrySet();
        System.out.println("setMap = " + setMap);




        Iterator i = setMap.iterator();


        while(i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }
}
