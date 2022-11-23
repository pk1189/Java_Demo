package org.example;

/**
 * For Loop Programs!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        int i, j,number, n=5;
        for(i=0; i<n; i++)
        {
            number=1;
            for(j=0; j<=i; j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        int x, num = 5, sum = 0;
        for(x = 1; x <= num; x++)
        {

            sum = sum + x;
        }

        System.out.println();
        System.out.println("Sum of First 5 Natural Numbers is = " + sum);

        int number1=10, a, evenSum = 0;
        for(a = 1; a <= number1; a++)
        {
            if(a % 2 == 0)
            {
                evenSum = evenSum + a;
            }
        }
        System.out.println();
        System.out.println("The Sum of Even Numbers upto " + number1 + "  =  " + evenSum);


    }
}
