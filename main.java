
import java.util.Scanner;

class Main{
    public static void main(String[] args){

       
        int num1 = 74;
        int num2 = 36;

        adder sum = new adder();
        float result = sum.Addition(num1, num2);

        
        // Scanner input = new Scanner(System.in);

        // System.out.println("Input your first name");
        // String fname = input.next();

        System.out.println(result);

        //Calculate the division of two ints
        result = sum.Divider(num1,num2);

        System.out.println(result);

        //Testing equation 1
        int x1 = -5;
        int y1 = 8;
        int z1 = 6;
        result = sum.equation1(x1,y1,z1);

        System.out.println(result);

        //Testing equation 2
        int x2 = 55;
        int y2 = 9;
        int z2 = 9;
        result = sum.equation2(x2,y2,z2);

        System.out.println(result);

         //Testing equation 3
         int w3 = 20;
         int x3 = -3;
         int y3 = 5;
         int z3 = 8;
         result = sum.equation3(w3,x3,y3,z3);
 
         System.out.println(result);
         
           //Testing equation 4
           int u4 = 5;
           int v4 = 15;
           int w4 = 3;
           int x4 = 2;
           int y4 = 8;
           int z4 = 3;
           result = sum.equation4(u4, v4, w4, x4, y4, z4);
   
           System.out.println(result);

           //Testing the multiplaction of 2 user inputs

        //    Scanner input = new Scanner(System.in);
        //    System.out.println("Enter first number to multiply: ");
        //    int firstnum = input.nextInt();
        //    System.out.println("Enter second number to multiply");
        //    int secondnum = input.nextInt();

        //    result = sum.multiply2(firstnum, secondnum);

        //    System.out.println(result);

        //Add, multiply, subtract, then divide inputs from the user

        // Scanner input = new Scanner(System.in);
        // System.out.println("Add two numbers, then multiply, then divide, also printing remainder");
        // System.out.println("Enter number 1: ");
        // int firstnum = input.nextInt();
        // System.out.println("Enter a second number: ");
        // int secondnum = input.nextInt();

        // result=sum.Addition(firstnum,secondnum);
        // System.out.println(result);
        // result=sum.Subtraction(firstnum, secondnum);
        // System.out.println(result);
        // result=sum.multiply2(firstnum, secondnum);
        // System.out.println(result);
        // result=sum.Divider(firstnum, secondnum);
        // System.out.println(result);
        // result=sum.remainder(firstnum, secondnum);
        // System.out.println(result);

        // input.close();


        //Print a multiplication table of a number

        Scanner input = new Scanner(System.in);
        System.out.println("Displaying the multiplication table of a number...");
        System.out.println("Enter number to multiply:");
        int firstnum = input.nextInt();

        sum.multiplicationTable(firstnum);
       


    }
}
