//imports
import java.util.Scanner;


//created by Michael Hobden
//For red river
//26/07/23
public class main {
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

    private static final String[][] recipes =
            {{"Lemon Tea", "0,1,4,7"}, {"Coffee", "0,2,5,8"}, {"Chocolate", "0,3,6"}};


    //In here you select you drink and the function to call each of the steps is called
    public static void main(String[] args) {
        //initialize scanner
        Scanner sc = new Scanner(System.in);

        //printing out recipe names and numerical selector
        int count = 1;
        for (String[] recipe : recipes
        ) {
            System.out.println("" + count + ": " + recipe[0]);
            count++;
        }

        //using scanner to get the number of the selection
        System.out.println("Please enter the number for your selection");
        int selection = sc.nextInt();

        if(selection > recipes.length || selection <= 0){
            System.out.println("Unfortunately the number you have selected is invalid.  " +
                    "We hope to add more drinks in the future.  Have a nice day!");
        }else {
            //getting the recipe corresponding with the number
            printRecipe(recipes[selection - 1][1]);
        }

    }

    private static void printRecipe(String recipeCode) {
        for (String step: recipeCode.split(",")
             ) {
            System.out.println(actions[Integer.parseInt(step)]);
        }
    }
}
