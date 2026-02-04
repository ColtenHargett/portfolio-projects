import java.util.Scanner;

public class GreyhoundGrocers {
    public static void main(String[] args) {
        // initialize variables
        double cost = 0;
        int items = 0;
        Scanner input = new Scanner(System.in);

        // print menu
        System.out.print("Welcome to Greyhound Grocers!\n" +
                "Here is what we have in store:\n" +
                "------------------------------\n" +
                "Cheerios             $3.49\n" +
                "Peanut Butter        $3.75\n" +
                "Jelly                $2.99\n" +
                "Spaghetti            $0.99\n" +
                "Spaghetti Sauce      $3.69\n" +
                "Canned Soup          $1.99\n" +
                "Macaroni and Cheese  $1.00\n" +
                "Reusable Bag         $1.00\n" +
                "------------------------------");

        // get budget from user
        System.out.println("What is your budget?");
        int budget = input.nextInt();

        // get number of cheerios from user
        System.out.println("How many cheerios boxes do you want?");
        int cheerios = input.nextInt();
        // add to total cost and total items
        cost += cheerios * 3.49;
        items += cheerios;

        // get number of cheerios from user
        System.out.println("How many peanut butter jars do you want?");
        int peanutButter = input.nextInt();
        // add to total cost and total items
        cost += peanutButter * 3.75;
        items += peanutButter;

        // get number of jellies from user
        System.out.println("How many jelly jars do you want?");
        int jelly = input.nextInt();
        // add to total cost and total items
        cost += jelly * 2.99;
        items += jelly;

        // get number of spaghetti from user
        System.out.println("How many spaghetti boxes do you want?");
        int spaghetti = input.nextInt();
        // add to total cost and total items
        cost += spaghetti * 0.99;
        items += spaghetti;

        // get number of spaghetti sauces from user
        System.out.println("How many spaghetti sauce jars do you want?");
        int spaghettiSauce = input.nextInt();
        // add to total cost and total items
        cost += spaghettiSauce * 3.69;
        items += spaghettiSauce;

        // get number of soups from user
        System.out.println("How many soup cans do you want?");
        int cannedSoup = input.nextInt();
        // add to total cost and total items
        cost += cannedSoup * 1.99;
        items += cannedSoup;

        // get number of macaroni and cheese from user
        System.out.println("How many macaroni and cheese boxes do you want?");
        int macaroniAndCheese = input.nextInt();
        // add to total cost and total items
        cost += macaroniAndCheese * 1.00;
        items += macaroniAndCheese;

        // determine cost with bags
        int bags = (items + 4) / 5;
        cost += bags;

        // print outcome to the user
        System.out.println("Your total cost is $" + cost);
        if (cost > budget) {
            System.out.println("Sorry you do not have enough money");
        }
        else {
            System.out.println("Thank you for shopping with Greyhound Grocers");
        }


      
    }
}
