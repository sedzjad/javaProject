public class ifstatements {
    public static void main(String[]args)
    {
        int willekeurig = (int) Math.ceil(Math.random() * 10);
        System.out.println(willekeurig);

        switch (willekeurig)
        {
            case 3:
                System.out.println("Switch3");
                break;
            case 6:
                System.out.println("Switch 6");
                break;
            case 1: case 2:
            case 4: case 8:
                System.out.println("Switch is 1,2,4 of8!");
                break;
        }

        if (willekeurig >= 8)
        {
            System.out.println("Getal is 8 of hoger");
        }
        else if (willekeurig == 7)
        {
            System.out.println("OH MAI GAWD, IT'S 7");
        }
        else if (willekeurig >3 && willekeurig < 7)
        {
            System.out.println("Het is een getal tussen 3 en 7");
        }
        else
        {
            System.out.println("Het is een ander getal.. :C");
        }

        if (willekeurig == 1 || willekeurig == 3)
        {
            System.out.println("Het is of 1 of 3...,.,.,");
        }
        if ( (willekeurig != 3 && willekeurig != 6) || willekeurig == 8)
        {
            System.out.println("testing nestle");
        }

        System.out.println("Einde van het programma");
    }
}
