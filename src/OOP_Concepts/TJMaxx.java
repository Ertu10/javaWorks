package OOP_Concepts;

import java.util.List;
import java.util.ArrayList;

public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;
    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {

    }
    public TJMaxx(List<Item> regularItems, List<OnSaleItem> onSaleItems) {
        super();
        this.regularItems = regularItems;
        this.onSaleItems = onSaleItems;
    }
    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {

        this.regularItems.add(item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {

        this.onSaleItems.add(item);
    }
    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }
    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }
    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }
    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }
    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {

        ArrayList<String> allItem = new ArrayList<>();
        for(Item a : regularItems) {
            allItem.add(a.getName());
        }
        for(OnSaleItem a : onSaleItems) {
            allItem.add(a.getName());
        }

        return allItem;
    }
    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
        for(Item a : regularItems) {
            if(  a.getCatalogNumber()==catalogNumber) {
                return a.getPrice();
            }
        }
        for(OnSaleItem a : onSaleItems) {
            if(a.getCatalogNumber()==catalogNumber) {
                return a.getPrice();
            }
        }


        return 0.0;
    }
    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        for(OnSaleItem a : onSaleItems) {
            if(a.getName().equals(name)) {
                return a;
            }}



        return null;
    }
    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {

        for(Item a : regularItems) {
            if(  a.getCatalogNumber()==catalogNumber) {
                regularItems.remove(a);
            }
        }
        for(OnSaleItem a : onSaleItems) {
            if(a.getCatalogNumber()==catalogNumber) {
                onSaleItems.remove(a);
            }
        }

    }
    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call
     removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

        for(Item a : regularItems) {
            if(  a.getCatalogNumber()==catalogNumber) {

                if(a.getQuantity()>0) {
                    a.setQuantity(a.getQuantity()-1);
                }else {
                    removeItem(catalogNumber);
                }
            }
        }
        for(OnSaleItem a : onSaleItems) {
            if(a.getCatalogNumber()==catalogNumber) {
                if(a.getQuantity()>0) {
                    a.setQuantity(a.getQuantity()-1);
                }else {
                    removeItem(catalogNumber);
                }
            }
        }



    }}