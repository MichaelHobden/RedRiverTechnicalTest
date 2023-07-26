public class Main {
    public static void main(String[] args) {
        //the coffee machine is run from here,  this allows me to run it infinitely.

        CoffeeMachine cm = new CoffeeMachine();
        while(true) {
            cm.run();
        }
    }
}
