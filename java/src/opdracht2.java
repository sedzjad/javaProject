import java.util.Scanner;


public class opdracht2 {
    public static void main(String[] args)
    {
        String voelen = "";
        String gedaan = "";
        String plannen = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you doing today?");
        voelen = scanner.nextLine();
//        System.out.println(voelen);

        System.out.println("What did you do today?");
        gedaan = scanner.nextLine();

        System.out.println("What are you planning on doing for the rest of the day?");
        plannen = scanner.nextLine();

        System.out.println("You are feeling "+ voelen);
        System.out.println("You have done this today: "+ gedaan);
        System.out.println("You are plan to do: " + plannen);

    }

}
