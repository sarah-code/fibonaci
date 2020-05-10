import static java.lang.Math.*;

public class Fibonaci {

    private static int LIMIT = 100;

    public void run()
    {
        int seq = 0;
        int sum = 1;
        int i = 0;
        while (seq <= LIMIT)
        {
            System.out.printf("%d    %d \n", i++, seq);
            int result = seq +sum;
            seq = sum;
            sum = result;


        }

    }
}