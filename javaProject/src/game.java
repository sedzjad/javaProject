import java.util.*;
public class game {
    public static void main(String[]args){
        boolean runGame = true;

        Scanner scan = new Scanner(System.in);
        String input = "";

        String[] commandos ={"hoger","lager","exit"};

        double getalStart = 0;
        double getalEind = 0;


        while(runGame)//rungame = true
        {
            getalStart = Math.ceil(Math.random() * 10);

            System.out.println("Het startgetal is:" + getalStart);

            //input controleren:
            boolean geldigeInput = false;
            while (geldigeInput == false) {
                input = scan.nextLine();
                input = input.toLowerCase();

                for (int i = 0; i < commandos.length; i++)
                {
                    if(input.equals(commandos[i]))
                    {
                        geldigeInput = true;
                        break;//breekt je loopdieloop
                    }
                }
            }
        //input is geldig, check resultaat:
            getalStart = Math.ceil(Math.random() * 10); // Hoger
            boolean win = false;
            if (input.equals(commandos[0])){
                if(getalEind > getalStart){
                    //Gewonnen
                    win = true;
                }
            }
            else if (input.equals(commandos[1])){ //Lager
                if (getalStart < getalEind){
                    //Verloren
                    win = true;
                }
            }
            else {
                //Exit Game:
                runGame = false;
                continue; //stopt de rest van de loopcode en begint opnieuw met de loop iteratie
            }
            //Eindresultaten tonen:
            System.out.println("Het startgetal is:" + getalStart);
            System.out.println("Het Eindgetal is:" + getalEind);

            if (win){
                System.out.println("Je hebt gewonnen");
            }
            else {
                System.out.println("Je hebt verloren");
            }

        }


    }
}
