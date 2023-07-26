//imports
import java.util.Scanner;

//created by Michael Hobden
//For red river
//26/07/23
public class main {
    //recipes
    private static final String LEMON_RECIPE = "1111";
    private static final String COFFEE_RECIPE = "1222";
    private static final String CHOCOLATE_RECIPE = "1330";

    //In here you select you drink and the function to call each of the steps is called
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Lemon Tea");
        System.out.println("2: Coffee");
        System.out.println("3: Chocolate");
        System.out.println("Please enter the number corresponding to your selection.");
        int selection = sc.nextInt();
        //once selection is received
        if(selection == 1){
            System.out.println("You have selected Lemon Tea:");
            printRecipe(LEMON_RECIPE);
        }else
        if(selection == 2){
            System.out.println("You have selected Coffee:");
            printRecipe(COFFEE_RECIPE);
        }else
        if(selection == 3){
            System.out.println("You have selected Chocolate:");
            printRecipe(CHOCOLATE_RECIPE);
        }
        else{
            //incase invalid input is received.  Scanner is only taking integers so all bases are covered
            System.out.println("Unfortunately the number you have selected is not currently available.  We hope to offer more drinks in the future.  Have a nice day.");
        }
    }
    //reduce code by calling all recipes here mulitple times
    private static void printRecipe(String recipe){
        step1(recipe);
        step2(recipe);
        step3(recipe);
        step4(recipe);
    }

    private static void step1(String recipe){
        switch(recipe.charAt(0)){
            case '0':
                //no process at this step
                break;
            case '1':
                //boil water
                System.out.println("Boil some water");
                break;
        }
    }
    private static void step2(String recipe){
        switch(recipe.charAt(1)){
            case '0':
                //no process at this step
                break;
            case '1':
                //steep water in tea
                System.out.println("Steep the water in tea");
                break;
            case '2':
                //Brew some coffee grounds
                System.out.println("Brew some coffee grounds");
                break;
            case '3':
                //add drinking chocolate
                System.out.println("Add drinking chocolate power to the water");
                break;
        }
    }
    private static void step3(String recipe){
        switch(recipe.charAt(2)){
            case '0':
                //no process at this step
                break;
            case '1':
                //pour tea in cup
                System.out.println("Pour tea in the cup");
                break;
            case '2':
                //pour coffee in cup
                System.out.println("Pour coffee in the cup");
                break;
            case '3':
                //pour chocolate in cup
                System.out.println("Pour chocolate in the cup");
                break;
        }
    }
    private static void step4(String recipe){
        switch(recipe.charAt(3)){
            case '0':
                //no process at this step
                break;
            case '1':
                //add lemon
                System.out.println("Add Lemon");
                break;
            case '2':
                //add sugar and milk
                System.out.println("Add sugar and milk");
                break;
        }
    }
}
