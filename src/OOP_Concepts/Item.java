package OOP_Concepts;


    public class Item {
        //private instance variables
        private String name;
        private int catalogNumber;
        private int quantity;
        private double price;

        /**
         * public constructor with:
         *
         * @param name
         * @param quantity
         * @param catalogNumber
         * @param price         assigns to values to instance variables
         */
        public Item(String name, int catalogNumber, int quantity, double price) {
            this.name = name;
            this.catalogNumber = catalogNumber;
            this.quantity = quantity;
            this.price = price;
        }
        /**
         * setter for name instance variable
         * @param name
         */

        /**
         * Override toString:
         *
         * @returns Object description in this format:
         * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
         */
        @Override
        public String toString() {
            return "RegularItem{name=" + this.name + ", catalogNumber=" + this.catalogNumber +
                    ", quantity=" + this.quantity + ", price=" + this.price + "}";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCatalogNumber() {
            return catalogNumber;
        }

        public void setCatalogNumber(int catalogNumber) {
            this.catalogNumber = catalogNumber;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
