package com.slinky.yueat;

import android.content.res.Resources;

import java.util.Arrays;
import java.util.List;
// TODO descriptions
public class Database {
    private static String chosenCategory = ""; // the category that the user has chosen
    private static String chosenFoodName = ""; // the food that the user has chosen

    public static boolean detailFinished = false; // whether the detail page has finish()
    public static int cart = 0; // the number of food in the cart (OBSELEtE)


    ///////////////////////////////////////////////////////////////////////////
    // getter and setters
    ///////////////////////////////////////////////////////////////////////////

    /**
     * get the category that the user has chosen
     * @return the category that the user has chosen
     */
    public static String getChoosenCategoryName() {
        return chosenCategory;
    }

    /**
     *  set the category that the user has chosen
     * @param foodName the food that the user has chosen
     */
    public static void setChosenCategoryName(String foodName) {
        Database.chosenCategory = foodName;
    }

    /**
     *
     * @return the food that the user has chosen
     */
    public static String getChosenFoodName() {
        return chosenFoodName;
    }

    /**
     *  set the food that the user has chosen
     * @param actualFoodName the food that the user has chosen
     */
    public static void setChosenFoodName(String actualFoodName) {
        Database.chosenFoodName = actualFoodName;
    }


    ///////////////////////////////////////////////////////////////////////////
    // food database categories
    ///////////////////////////////////////////////////////////////////////////
    private static final Food food1 = new Food("Burgers", R.drawable.burger_beef );
    private static final Food food2 = new Food("Drinks", R.drawable.cute_drink );
    private static final Food food3 = new Food("Fish", R.drawable.fried_fish_cake_herbs );
    private static final Food food4 = new Food("Jerky", R.drawable.jeffs_famous_jerky_jamaican_jerk_close );
    private static final Food food5 = new Food("Steak", R.drawable.jamaican_ribeye_steak );
    private static final Food food6 = new Food("Chicken", R.drawable.fried_chicken );

    public static List<Food> foodData = Arrays.asList(food1, food2, food3, food4, food5, food6);


    ///////////////////////////////////////////////////////////////////////////
    // food database | burgers
    ///////////////////////////////////////////////////////////////////////////
    // private static final variables for Food: burger-beef, burger-chicken, burger-fried-chicken, sanwich-beef;

    private static final Food burger_beef = new Food(
            "Burger Beef",
            R.drawable.burger_beef,
            "this is a good beef burger", 16.69);
    private static final Food burger_chicken = new Food(
            "Burger Chicken",
            R.drawable.burger_chicken,
    "this is a good chicken burger", 12.69);
    private static final Food burger_fried_chicken = new Food(
            "Burger Fried Chicken",
            R.drawable.burger_frie_chicken,
    "this is a dgood fried chicken", 9.69);
    private static final Food sanwich_beef = new Food(
            "Sanwich Beef",
            R.drawable.sandwich_beef,
    "this is a good sandwich", 6.69);

    public static List<Food> burgerData = Arrays.asList(burger_beef, burger_chicken, burger_fried_chicken, sanwich_beef);


    ///////////////////////////////////////////////////////////////////////////
    // food database | drinks
    ///////////////////////////////////////////////////////////////////////////
    //drinks: banks-beer, corona, cute-drink, esspresso;

    private static final Food banks_beer = new Food(
            "Banks Beer",
            R.drawable.banks_beer,
    "this is a corona", 3.69);
    private static final Food corona = new Food(
            "Corona",
            R.drawable.corona,
    "this is a description of the food", 2.69);
    private static final Food cute_drink = new Food(
            "Cute Drink",
            R.drawable.cute_drink,
    "this is a cute drink. idk. buy it. ", 5.69);
    private static final Food espresso = new Food(
            "Espresso",
            R.drawable.espresso,
    "this is a OBVIOUSLY an espresso. Get one to party more on the beach after", 4.69);

    public static List<Food> drinkData = Arrays.asList(banks_beer, corona, cute_drink, espresso);


    ///////////////////////////////////////////////////////////////////////////
    // food database | seafood
    ///////////////////////////////////////////////////////////////////////////
    //fish: fish-cake-chef-special, fish-cake-on-stick, fish-cake, fried-fish-cake-herbs, salmon;

    private static final Food fish_cake_chef_special = new Food(
            "Fish Cake Chef Special",
            R.drawable.fish_cake_chef_special,
    "this is a fish cake", 36.69);
    private static final Food fish_cake_on_stick = new Food(
            "Fish Cake On Stick",
            R.drawable.fish_cake_on_stick,
    "this is a fish cake on a stick", 6.69);
    private static final Food fish_cake = new Food(
            "Fish Cake",
            R.drawable.fishcake,
    "this is a description of the food", 7.69);
    private static final Food fried_fish_cake_herbs = new Food(
            "Fried Fish Cake Herbs",
            R.drawable.fried_fish_cake_herbs,
    "this is a description of the food", 16.69);
    private static final Food salmon = new Food(
            "Salmon",
            R.drawable.salmon,
    "this is a salmon feesh from the sea", 12.69);

    public static List<Food> fishData = Arrays.asList(fish_cake_chef_special, fish_cake_on_stick, fish_cake, fried_fish_cake_herbs, salmon);


    ///////////////////////////////////////////////////////////////////////////
    // food database | jerky
    ///////////////////////////////////////////////////////////////////////////
    //jerky: jerky-chicken, jerky-beef, jamaican-jerky-steak, jerky-ribs, jerk,jeffs-famous-jerky-jamaican-jerk-close ;

    private static final Food jerky_chicken = new Food(
            "Jerky Chicken",
            R.drawable.chicken_jerky,
    "this is a description of the jerky", 6.69);
    private static final Food jerky_beef = new Food(
            "Jerky Beef",
            R.drawable.beef_jerky,
    "this is a description of the jerky", 7.69);
    private static final Food jamaican_jerky_steak = new Food(
            "Jamaican Jerky Steak",
            R.drawable.jamaican_jerk_steak,
    "this is a description of the jerky", 8.69);
    private static final Food jerky_ribs = new Food(
            "Jerky Ribs",
            R.drawable.jerk_ribs,
    "this is a description of the jerky", 12.69);
    private static final Food jerk = new Food("" +
            "Jerk",
            R.drawable.jerk,
    "this is a description of the jrek", 61.69);
    private static final Food jeffs_famous_jerky_jamaican_jerk_close = new Food(
            "Jeff's Famous Jerky Jamaican Jerk Close",
            R.drawable.jeffs_famous_jerky_jamaican_jerk_close,
    "this is a description of the jerky", 36.69);

    public static List<Food> jerkyData = Arrays.asList(jerky_chicken, jerky_beef, jamaican_jerky_steak, jerky_ribs, jerk, jeffs_famous_jerky_jamaican_jerk_close);


    ///////////////////////////////////////////////////////////////////////////
    //   // food database | steaks
    ///////////////////////////////////////////////////////////////////////////
    //steak: pepper-steak, grilled-ribeye, jamaican-jerk-steak,jamaican-ribeye-steak , pepper-steak;

    private static final Food pepper_steak = new Food(
            "Pepper Steak",
            R.drawable.pepper_steak,
    "this is a description of the steak", 16.69);
    private static final Food grilled_ribeye = new Food(
            "Grilled Ribeye",
            R.drawable.grilled_ribeye,
    "this is a description of the steak", 20.69);
    private static final Food jamaican_jerk_steak = new Food(
            "Jamaican Jerk Steak",
            R.drawable.jamaican_jerk_steak_steak,
    "this is a description of the steak", 30.69);
    private static final Food jamaican_ribeye_steak = new Food(
            "Jamaican Ribeye Steak",
            R.drawable.jamaican_ribeye_steak,
    "this is a description of the steak", 60.69);

    public static List<Food> steakData = Arrays.asList(pepper_steak, grilled_ribeye, jamaican_jerk_steak, jamaican_ribeye_steak);


    ///////////////////////////////////////////////////////////////////////////
    // food database | chicken
    ///////////////////////////////////////////////////////////////////////////
    //chicken: fried-chicken, grilled-prawn, jamaican-chicken-curry, kebab-jamaica, whole-chicken;

    private static final Food fried_chicken = new Food(
            "Fried Chicken",
            R.drawable.fried_chicken,
    "this is a description of the chicked that is fried", 11.69);
    private static final Food grilled_prawn = new Food(
            "Grilled Prawn",
            R.drawable.grilled_chicken,
    "this is a description of the food", 16.69);
    private static final Food jamaican_chicken_curry = new Food(
            "Jamaican Chicken Curry",
            R.drawable.jamaican_chicken_curry,
    "i am so hungry", 8.69);
    private static final Food kebab_jamaica = new Food(
            "Kebab Jamaica",
            R.drawable.kebab_jamaica,
    "this is a description of the kebab", 10.69);
    private static final Food whole_chicken = new Food(
            "Whole Chicken",
            R.drawable.whole_chicken,
    "this is a description of the whole chicken", 50.69);

    public static List<Food> chickenData = Arrays.asList(fried_chicken, grilled_prawn, jamaican_chicken_curry, kebab_jamaica, whole_chicken);


    ///////////////////////////////////////////////////////////////////////////
    // methods to access the food database
    ///////////////////////////////////////////////////////////////////////////

    public static Food getChosenFood() {
        switch (getChosenFoodName()) {
            case "Burger Beef":
                return burger_beef;
            case "Burger Chicken":
                return burger_chicken;
            case "Burger Fried Chicken":
                return burger_fried_chicken;
            case "Sanwich Beef":
                return sanwich_beef;
            case "Banks Beer":
                return banks_beer;
            case "Corona":
                return corona;
            case "Cute Drink":
                return cute_drink;
            case "Espresso":
                return espresso;
            case "Fish Cake Chef Special":
                return fish_cake_chef_special;
            case "Fish Cake On Stick":
                return fish_cake_on_stick;
            case "Fish Cake":
                return fish_cake;
            case "Fried Fish Cake Herbs":
                return fried_fish_cake_herbs;
            case "Salmon":
                return salmon;
            case "Jerky Chicken":
                return jerky_chicken;
            case "Jerky Beef":
                return jerky_beef;
            case "Jamaican Jerky Steak":
                return jamaican_jerky_steak;
            case "Jerky Ribs":
                return jerky_ribs;
            case "Jerk":
                return jerk;
            case "Jeff's Famous Jerky Jamaican Jerk Close":
                return jeffs_famous_jerky_jamaican_jerk_close;
            case "Pepper Steak":
                return pepper_steak;
            case "Grilled Ribeye":
                return grilled_ribeye;
            case "Jamaican Jerk Steak":
                return jamaican_jerk_steak;
            case "Jamaican Ribeye Steak":
                return jamaican_ribeye_steak;
            case "Fried Chicken":
                return fried_chicken;
            case "Grilled Prawn":
                return grilled_prawn;
            case "Jamaican Chicken Curry":
                return jamaican_chicken_curry;
            case "Kebab Jamaica":
                return kebab_jamaica;
            case "Whole Chicken":
                return whole_chicken;
            default:
                return null;
        }
    }

}