import java.util.*;
public class referencetypes
{
    public static void main(String[] args){

        int[] getallen = new int[5];

        getallen[0] = 1337;
        getallen[1] = 5;
        getallen[2] = 62;
        getallen[3] = 4877;
        getallen[4] = 44;

        int[] lijstjeGetallen = {123, 534, 99, 8642, 0};

        System.out.println(Arrays.toString(lijstjeGetallen));

        lijstjeGetallen = Arrays.copyOf(lijstjeGetallen, lijstjeGetallen.length +1 );

        Scanner input = new Scanner(System.in);

        lijstjeGetallen[lijstjeGetallen.length - 1] = input.nextInt();

        System.out.println(Arrays.toString(lijstjeGetallen));

        System.out.println("-------------------------------------------------");


    }
}
