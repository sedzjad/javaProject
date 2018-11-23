import java.lang.reflect.Array;

public class functies {
    public static void main(String[] args){


    killMe();
    testing();
    killMe2("Trein.exe was found");
    tekst(5,8);


    System.out.println("Resultaat van functie is: "+ YoN("ja"));
    }

    public static void killMe(){
        System.out.println("Dit kut");
    }
    private static void testing(){
        System.out.println("Dit is nog kutter");
    }

    public static void killMe2(String tekst){
        System.out.println("Stukje tekst is: " + tekst);
    }

    public static void tekst(int getal, int konijn){
        System.out.println(getal);
        System.out.println(konijn);
    }

    public static boolean YoN(String input){
        if(input.equals("ja")){
            return true;
        }
        else{
            return false;
        }
    }

    public static int lijst(int array){
        int[]newArray;
        newArray = new int [4];
        newArray[0]=2;
        newArray[1]=3;
        newArray[2]=4;
        newArray[3]=5;

        return newArray.length(int);

    }

}
