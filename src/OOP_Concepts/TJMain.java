package OOP_Concepts;

import java.util.ArrayList;
import java.util.List;

public class TJMain  {
    public static void main(String[] args) {
        Item i1 = new Item("Zhra", 100, 3, 10);
        Item i2 = new Item("Nurgul", 200, 6, 20);
        Item i3 = new Item("Tuba", 50, 2, 5);
        List<Item> item = new ArrayList<>();
        List<OnSaleItem> item2 = new ArrayList<>();


        TJMaxx tj = new TJMaxx(item , item2 );
        tj.buyItem(50);
        System.out.println(item.get(1).getPrice());
    }
}
