package Try;

import java.util.*;

public class SetwithIterator {
    public static void main(String[] args) {
        Set<Integer> den = new HashSet<>();

        den.add(23);
        den.add(34);den.add(45);den.add(78);den.add(25);
        Iterator<Integer> a = den.iterator();


        List<String> denList = new ArrayList<>();
        denList.add("naber");
        denList.add("karete");
        denList.add("kamil ");

        ListIterator<String> aa = denList.listIterator();
        int b = aa.previousIndex();

        System.out.println("b = " + b);
        while (aa.hasPrevious()){
            System.out.println(aa.previous());
        }


        while (a.hasNext()) {
            Integer tvShow = a.next();
            System.out.println(tvShow);
        }
    }
}
