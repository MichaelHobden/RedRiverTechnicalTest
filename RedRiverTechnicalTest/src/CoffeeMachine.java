//imports
import java.util.Scanner;


//created by Michael Hobden
//For red river
//26/07/23
public class CoffeeMachine {
    /*to add new recipes simply fill in the data about the recipes in the two blocks below,
    * firstly add the additional required steps to the 2 blocks below and then add the recipes name and code below that*/
    //steps
    private static final String[] actions = {
            "Boil some water", //0
            "Steep the water in the tea", //1
            "Brew the coffee grounds", //2
            "Add drinking chocolate powder to the water", //3
            "Pour the tea in the cup", //4
            "Pour coffee in the cup", //5
            "Pour chocolate in the cup", //6
            "Add lemon", //7
            "Add sugar and milk", //8

            };
    //recipes
    private static final String[][] recipes =
            {{"Lemon Tea", "0,1,4,7"}, {"Coffee", "0,2,5,8"}, {"Chocolate", "0,3,6"}};


    //In here you select you drink and the function to call each of the steps is called
    public static void run() {

        //initialize scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("____________________________________________");
        System.out.println("Welcome to Michael's Coffee Machine");

        //printing out recipe names and numerical selector
        int count = 1;
        for (String[] recipe : recipes
        ) {
            System.out.println("" + count + ": " + recipe[0]);
            count++;
        }

        //using scanner to get the number of the selection
        //this section also includes validation that the entered data is a number and that it is within the range of available drinks
        System.out.println("Please enter the number for your selection:");
        System.out.println("____________________________________________");
        int selection = 0;
        boolean validInput = false;
        while(!validInput){
            String input = getInput();
            try{
                selection = Integer.parseInt(input);
                if(selection <= recipes.length && selection > 0){
                    validInput = true;
                }else {
                    System.out.println("The number you selected does not match a drink we have on offer,  please try again.");
                }
            }catch (Exception ignored){
                System.out.println("Your input was invalid,  please try again");
            }
        }

        System.out.println("You have selected " + recipes[selection-1][0]);
        printRecipe(recipes[selection - 1][1]);


    }
    //input is taken in, in a separate function.  This allows me to take it in a multiple times until the correct input is entered.
    private static String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    //takes the recipe code and prints out the recipe from the steps
    private static void printRecipe(String recipeCode) {
        int count = 1;
        for (String step: recipeCode.split(",")
             ) {
            System.out.println(""+ count + ": " +actions[Integer.parseInt(step)]);
            count++;
        }
    }
}
