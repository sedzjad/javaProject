import java.util.*;
public class gambling {

    public static void main(String[] args) {

        boolean runGame = true;

        Scanner scan = new Scanner(System.in);
        String input = "";

        String[] commandos = {"hoger","lager","exit"};

        double getalstart = 0;
        double getaleind = 0;

        int geld = 1;

        int winst = 1;
        while (runGame){
            if(geld > 0){
                getalstart = Math.ceil(Math.random() * 10);
                System.out.println("je hebt minimaal 1 euro nodig om te spelen");
                System.out.println();

                System.out.println("je momenteel heb je " + geld + " euro");
                System.out.println();

                System.out.println("als je wint verdien je 1 euro");
                System.out.println();

                System.out.println("Antwoord met hoger ,lager");
                System.out.println();

                System.out.println("Het start getal is " + getalstart);
                System.out.println();

                System.out.println("als je wil stoppen zeg exit");
//            input conroleren:


                boolean geldigeinput = false;
                //als dit dan doe dat
                while (geldigeinput == false) {

                    input = scan.nextLine();
                    input = input.toLowerCase();

                    for (int i = 0; i < commandos.length; i++){
                        if (input.equals(commandos[i])){
                            geldigeinput = true;
                            break;
                        }
                    }
                }

                //input is geldig check resultaat:

                getaleind = Math.ceil(Math.random() * 10);
                boolean win = false;
                if (input.equals(commandos[0])){
                    if (getaleind > getalstart){
                        //won
                        win = true;
                    }
                }
                else if (input.equals(commandos[1])){
                    if (getaleind < getalstart){
                        win = true;
                    }


                    if (input.equals(commandos[0])){
                        if (getaleind > getalstart){

                        }
                    }

                }

                else{

                    //exitgame
                    runGame = false;
                    continue;//begint opnieuw
                }

                //eindresultaat tonen:
                System.out.println("Het start getal is " + getalstart);
                System.out.println();

                System.out.println("Het eind getal is " + getaleind);

                if (win == true){
                    System.out.println("je hebt gewonnen oude gokverslaafde");
                    geld = winst + geld;
                }
                else{
                    System.out.println();
                    System.out.println("je hebt verloren oude gokverslaafde");
                    geld--;
                    if (geld > 0){
                        System.out.println("nu heb je nog maar " + geld);}
                    else{
                        System.out.println("#################################################");
                        System.out.println("nu mag je niet meer spelen");

                        System.out.println("##################################################");

                    }

                }





            }
        }
    }}
