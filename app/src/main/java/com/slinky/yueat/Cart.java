package com.slinky.yueat;

import java.text.DecimalFormat;
import java.util.ArrayList;

public  class Cart {

    /**
     * Cart class creates node for all information of each item in the cart. It includes the Food object and its getters.
     * static to ensure great encapsulation.
     */
        public static class CartItem {
            Food food;
            int quantity;
            double total;

            /**
             * CartItem constructor/ even if class static, you can still create multiple instance of it.
             * @param food is the Food object
             * @param quantity is the quantity of the food
             * @param total is the total price of the food
             */
            public CartItem(Food food, int quantity, double total) {
                this.food = food;
                this.quantity = quantity;
                this.total = total;
            }

            public String getName(){
                return food.getName();
            }

            public double getPrice(){
                return food.getPrice();
            }

            public int getQuantity(){
                return quantity;
            }

            public double getTotal(){
                return total;
            }
        }

    private static volatile Cart instance; // volatile to ensure thread safety

    private double totalPrice = 0.00;

    ArrayList<CartItem> cart = new ArrayList<>();

    private boolean isDuplicate;

    DecimalFormat decimalFormat = new DecimalFormat("#.00"); //formatting the price to 2 decimal places

    private Cart() {
    }

    /**
     * getInstance method to ensure only one instance of the cart is created.
     * @return instance of the cart
     */
    public static Cart getInstance() {
        if (instance == null) {
            synchronized (Cart.class) {
                if (instance == null) {
                    instance = new Cart();
                }
            }
        }
        return instance;
    }

    /**
     *
     * not needed for this project
     */
    public static void setInstance(Cart instance) {
        Cart.instance = instance;
    }

    /**
     * getTotalPrice method to get the total price of the cart.
     * @return total price of the cart
     */
    public String getTotalPrice() {
        /// check if cart is empty or null
        if (cart==null || cart.size()==0) {
            return "0.00";
        }

        return decimalFormat.format(totalPrice); //formatting the price to 2 decimal places
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * getCart method to get the cart.
     * @return
     */
    public ArrayList<CartItem> getCart() {
        return cart;
    }

    public void setCart(ArrayList<CartItem> cart) {
        this.cart = cart;
    }

    /**
     * Add food to cart
     * @param food food to be added
     */
    public void addToCart(Food food, int quantity) {
        isDuplicate = false;
        // loop to checkDuplicate
        for (CartItem item : cart) {
            if (checkDuplicate(food, item)) {

                item.quantity += quantity;
                item.total = item.quantity * item.food.getPrice();
                isDuplicate = true;
                return;
            }
        }
        if (!isDuplicate) {
            cart.add(new CartItem(food, quantity, food.getPrice() * quantity));
        }
        // calculate total price
        totalPrice += quantity * food.getPrice();
    }

    /**
     * checkDuplicate method to check if the food is already in the cart.
     * @param food food to be checked
     * @param item item in the cart
     * @return true if duplicate
     */
    public boolean checkDuplicate(Food food, CartItem item){
       return item.food.getName().equals(food.getName());
    }

    /**
     * removeFood method to remove food from the cart.
     */
    public void clearCart() {
        cart.clear();
        totalPrice = 0.00;
    }

    //format double to two decimals


}
