
// Name : Mostafa Sayed Ahmed Taha Ahmed
// ID   : 19016660
import java.util.*;

interface ICalculator {
    /**
     * Adds given two numbers
     * @param x first number
     * @param y second number
     * @return the sum of the two numbers
     */
    int add(int x, int y);

    /**
     * Divides two numbers
     * @param x first number
     * @param y second number
     * @return the division result
     */
    float divide(int x, int y) throws RuntimeException;
}


public class Calculator implements ICalculator{
    /* Implement your calculator class here*/
    public int add(int x, int y)
    {
        int result = x + y;
        return result;
    }

    public float divide(int x, int y) throws  RuntimeException
    {
       if(y == 0)
        throw new RuntimeException("Error");     // Setting Runtime Error message at y = 0 to "Error"

        float result = ((float)x) /((float)y) ;  
            return result;

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);   // Input object to receive input from user
        Calculator cal = new Calculator() ;       // cal object to perform add and divide operations

        int  a =   input.nextInt();         // input integer value and store it in a variable
        char op =  input.next().charAt(0);  // charAt used to receive first character of string of one character and store it in op
        int  b =   input.nextInt();         // input integer value and store it in b variable
        float result = 0f;
        switch (op)
        {
            case '+' : System.out.println(cal.add(a,b)) ;
            break;
            case '/' :
                try {
                    result = cal.divide(a, b);
                }
                catch (RuntimeException e){
                    System.out.println(e.getMessage());     // Printing "Error" in case of b = zero (Runtime Error)
                    break;
                }
                    System.out.println(result);
            break;
            default:
                System.out.println("Error");
        }
    }
}
