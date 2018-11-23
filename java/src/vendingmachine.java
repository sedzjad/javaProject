import java.util.*;
public class vendingmachine {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Cola = 90;
        int Fanta = 90;
        int Sprite = 90;
        int choice = 0;
        int money = 0;
        int amount = 0;
        int user = 500;

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Cola -.90");
        alist.add("Fanta -.90");
        alist.add("Sprite -.90");

        ArrayList<String> endlist = new ArrayList<String>();

        System.out.println("We have the following drinks");
        System.out.println(alist);

         while (user > 90){
             System.out.println("Please enter your selection, you have: " + user + " cent left");
             choice = scanner.nextInt();

             if (choice < 1){
                 System.out.println("Please choose again");
                 choice = scanner.nextInt();
             }
             else if (choice> 3){
                 System.out.println("Please choose again");
                 choice = scanner.nextInt();
             }

            switch (choice) {
                case 1:
                    alist.get(0);
                    System.out.println("That will be -.90");
                    endlist.add("Cola");
                    break;

                case 2:
                    alist.get(1);
                    System.out.println("That will be -.90");
                    endlist.add("Fanta");
                    break;

                case 3:
                    alist.get(2);
                    System.out.println("That will be -.90");
                    endlist.add("Sprite");
                    break;
            }

            {
                System.out.println("Enter your amount in cents");
                money = scanner.nextInt();
                if (money > 200) {
                    System.out.println("Please insert an amount lower than that!");
                    money = scanner.nextInt();
                } else if (money < 90) {
                    System.out.println("Please make sure to insert at least 90 cent");
                    money = scanner.nextInt();
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("You have chosen Cola!");
                    amount = money - Cola;
                    System.out.println("Your change is:" + amount + " cents");
                    System.out.println("     ..  *    o\n" +
                            "   o   *  .    *\n" +
                            "     ________\n" +
                            "    (________)\n" +
                            "    |    o   |\n" +
                            "    | o    o |\n" +
                            "    |   o    |\n" +
                            "    | o    o |\n" +
                            "    | o  o   |\n" +
                            "    |      o |\n" +
                            "    ( o      )\n" +
                            "     \\   o  /\n" +
                            "      \\    /\n" +
                            "       \\  /\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "     ___||___\n" +
                            "    /   ||   \\\n" +
                            "    \\________/");
                    break;

                case 2:
                    System.out.println("You have chosen Fanta!");
                    amount = money - Fanta;
                    System.out.println("Your change is:" + amount + " cent");
                    System.out.println("     ..  *    o\n" +
                            "   o   *  .    *\n" +
                            "     ________\n" +
                            "    (________)\n" +
                            "    |    o   |\n" +
                            "    | o    o |\n" +
                            "    |   o    |\n" +
                            "    | o    o |\n" +
                            "    | o  o   |\n" +
                            "    |      o |\n" +
                            "    ( o      )\n" +
                            "     \\   o  /\n" +
                            "      \\    /\n" +
                            "       \\  /\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "     ___||___\n" +
                            "    /   ||   \\\n" +
                            "    \\________/");
                    break;
                case 3:
                    System.out.println("You have chosen Sprite!");
                    amount = money - Sprite;
                    System.out.println("Your change is:" + amount + " cent");
                    System.out.println("     ..  *    o\n" +
                            "   o   *  .    *\n" +
                            "     ________\n" +
                            "    (________)\n" +
                            "    |    o   |\n" +
                            "    | o    o |\n" +
                            "    |   o    |\n" +
                            "    | o    o |\n" +
                            "    | o  o   |\n" +
                            "    |      o |\n" +
                            "    ( o      )\n" +
                            "     \\   o  /\n" +
                            "      \\    /\n" +
                            "       \\  /\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "        ||\n" +
                            "     ___||___\n" +
                            "    /   ||   \\\n" +
                            "    \\________/");
                    break;
            }
            user = user - (money - amount);
        }
         System.out.println("You do not have enough money." + money);
         System.out.println("Je hebt het volgende aangeschaft: " +endlist);


    }
}