import java.util.Scanner;

public class opdracht1
{
    public static void main(String[]args)
    {
        String naam = "";
        String achternaam ="";
        String leeftijd ="";
        String kleur ="";
        String postcode ="";
        String woonplaats="";

        Scanner Charname = new Scanner (System.in);

        System.out.print ("Wat is je voornaam?");
        naam = Charname.nextLine();
        System.out.println(naam);

        System.out.println("Wat is je achternaam");
        achternaam = Charname.nextLine();
        System.out.println(achternaam);

        System.out.println("Hoe oud ben je?");
        leeftijd = Charname.nextLine();
        System.out.println(leeftijd);

        System.out.println("Wat is je oogkleur?");
        kleur = Charname.nextLine();
        System.out.println(kleur);

        System.out.println("Wat is je postcode?");
        postcode = Charname.nextLine();
        System.out.println(postcode);

        System.out.println("Waar woon je");
        woonplaats = Charname.nextLine();
        System.out.println(woonplaats);

        System.out.println("Beste" +" "+naam +" " + achternaam);
        System.out.println("Je bent nu" + " "+ leeftijd + " jaar oud, hebt "+kleur+"e"+ " ogen " + " en woont in" +" "+  woonplaats + " " + postcode);
    }
}
