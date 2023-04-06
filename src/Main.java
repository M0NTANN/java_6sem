import javax.swing.*;
import java.util.BitSet;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {



    public static void main(String[] args) {
        UserView userView = new UserView();
        SwingUtilities.invokeLater(()->{
            userView.init();
        });



        Scanner scan = new Scanner(System.in);


        int xInt, yInt, t = 0, x = 0, y =0;
        SmallInteger xSmall, ySmall;
        //System.out.println("Select an action: \n\"+\" - summation \n\"-\" - subtraction \n\"/\" - division");
      int check = 0;
        while(check != 1){

            System.out.println("Select an action: \n\"+\" - summation \n\"-\" - subtraction \n\"/\" - division \n\"exit\" - exit");
            String cases = scan.nextLine();
         switch (cases) {
             case "+":
                System.out.println("Enter first number: ");
                //x = Integer.valueOf(scan.nextLine());
                try {
                   // x = Integer.valueOf(scan.nextLine());
                    x = Integer.parseInt(scan.nextLine());
                }catch (NumberFormatException ex){

                    System.out.print("Invalid input " + x + " is not a number");
                    break;
                }
                xInt = parseInt(String.valueOf(x), 10);
                xSmall = new SmallInteger(xInt);
                System.out.println("Enter second number: ");
                 try {
                     // x = Integer.valueOf(scan.nextLine());
                     y = Integer.parseInt(scan.nextLine());
                 }catch (NumberFormatException ex){

                     System.out.print("Invalid input " + y + " is not a number\n");
                     break;
                 }
                yInt = parseInt(String.valueOf(y), 10);
                ySmall = new SmallInteger(yInt);
                System.out.println("Result: "+ SmallInteger.Sum(xSmall, ySmall).getVal());
                break;
            case "-":
                System.out.println("Enter first number: ");
                //x = Integer.valueOf(scan.nextLine());
                try {
                    // x = Integer.valueOf(scan.nextLine());
                    x = Integer.parseInt(scan.nextLine());
                }catch (NumberFormatException ex){

                    System.out.print("Invalid input " + x + " is not a number");
                    break;
                }
                xInt = parseInt(String.valueOf(x), 10);
                xSmall = new SmallInteger(xInt);
                System.out.println("Enter second number: ");
                try {
                    // x = Integer.valueOf(scan.nextLine());
                    y = Integer.parseInt(scan.nextLine());
                }catch (NumberFormatException ex){

                    System.out.print("Invalid input " + y + " is not a number\n");
                    break;
                }
                yInt = parseInt(String.valueOf(y), 10);
                ySmall = new SmallInteger(yInt);
                System.out.println("Result: "+ SmallInteger.sub(xSmall, ySmall).getVal());
                break;
            case "/":
                System.out.println("Enter first number: ");
                //x = Integer.valueOf(scan.nextLine());
                try {
                    // x = Integer.valueOf(scan.nextLine());
                    x = Integer.parseInt(scan.nextLine());
                }catch (NumberFormatException ex){

                    System.out.print("Invalid input " + x + " is not a number");
                    break;
                }
                xInt = parseInt(String.valueOf(x), 10);
                xSmall = new SmallInteger(xInt);
                System.out.println("Enter second number: ");
                try {
                    // x = Integer.valueOf(scan.nextLine());
                    y = Integer.parseInt(scan.nextLine());
                }catch (NumberFormatException ex){

                    System.out.print("Invalid input " + y + " is not a number\n");
                    break;
                }
                yInt = parseInt(String.valueOf(y), 10);
                ySmall = new SmallInteger(yInt);
                if(y == 0){
                    System.out.println("You can't divide by zero");
                    break;
                } else if (y != 0) {

                    System.out.println("if you want to find the remainder of the division, then enter \"1\", otherwise press \"0\"");
                    try {
                        // x = Integer.valueOf(scan.nextLine());
                        t = Integer.parseInt(scan.nextLine());
                    }catch (NumberFormatException ex){

                        System.out.print("Invalid input " + t + " is not a number\n");
                        break;
                    }
                    if (t == 1){
                        // System.out.println("Result: "+ SmallInteger.del((float)x, (float)y));
                        System.out.println("Result: "+ SmallInteger.mod(xSmall, ySmall).getVal());}
                    else if(t == 0) System.out.println("Result: "+ SmallInteger.div(xSmall, ySmall).getVal());
                    break;

                }else {
                    System.out.println("You can use only \"0\" or \"1\"");
                    break;
                }
             case "exit":
                 check++;
                 break;

                 default:
                     System.out.println("Read one more time:\n");
         }

        }
    }
}