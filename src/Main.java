import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     // Variable declaration
       int operator;
       double n1, n2;

       //Operation assignment
        System.out.println("To perform any operation or calculation, Please choose among the Opeators listed below \n");
        System.out.println("OPERATORS: \n 1 - Add(+) \n 2 - Subtract(-) \n 3 - Divide(/) \n 4 - Multiply(*) \n 5 - Remainder(%)");
        System.out.println("Choose Operator");
        Scanner input = new Scanner(System.in);
        operator = input.nextInt();
        System.out.println("Enter First Numbrt: ");
        n1 = input.nextDouble();
        System.out.println("Enter Second Numbrt: ");
        n2 = input.nextDouble();


        double Result = 0;
        switch(operator){
            case 1:
            Result = n1 + n2;
            break;

            case 2:
                Result = n1 - n2;
                break;

            case 3:
                Result = n1 / n2;
                break;

            case 4:
                Result = n1 * n2;
                break;

            case 5:
                Result = n1 % n2;
                break;

            default:
                System.out.println("Enter valid operator number");
        }

        System.out.println("The Answer is "  + Result);
    }

 
}