package OOP_Concepts;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set sinan = new HashSet<>();
        sinan.add("Trabzon");
        sinan.add("Erzurum");
        sinan.add("İzmir");
        sinan.add("Eskişehir");
        sinan.add("İstanbul");
        sinan.add("Antalya");
        sinan.add("Londra");

        Set ertu = new HashSet<>();
        ertu.add("Trabzon");
        ertu.add("Erzurum");
        ertu.add("İzmir");
        ertu.add("Eskişehir");
        ertu.add("İstanbul");
        ertu.add("Antalya");
        ertu.add("Londra");

        Integer ab = 78;


        System.out.println("sinan = " + sinan);
        System.out.println("ertu = " + ertu);
        System.out.println("ertu.retainAll(sinan) = " + ertu.retainAll(sinan));
        System.out.println("ertu = " + ertu);

        Set linkedSinan = new LinkedHashSet();

        linkedSinan.add("NewYork");
        linkedSinan.add("Trabzon");
        linkedSinan.add("İzmir");
        linkedSinan.add("Uşak");
        linkedSinan.add("İstanbul");
        linkedSinan.add("Atina");
        linkedSinan.add("Ankara");

        System.out.println("linkedSinan = " + linkedSinan);

        TreeSet treErtu = new TreeSet<>();
        treErtu.add("Naber");
        treErtu.add("Lan!");
        treErtu.add("NewYork");
        treErtu.add("Trabzon");
        treErtu.add("Izmir");
        treErtu.add("Uşak");
        treErtu.add("Istanbul");
        treErtu.add("Atina");
        treErtu.add("Ankara");

        System.out.println("treErtu = " + treErtu);

        List ex = new ArrayList<>();
        ex.add("naber");
        ex.add(5);

        System.out.println("ex = " + ex);

        System.out.println("ertu.equals(sinan) = " + ertu.equals(sinan));
        System.out.println( ertu.hashCode() == sinan.hashCode());
    }
}
