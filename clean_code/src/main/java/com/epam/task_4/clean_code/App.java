package com.epam.task_4.clean_code;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PROGRAM TO FIND SIMPLE AND COMPOUND INTEREST");
        System.out.println("ENTER PRINCIPLE AMOUNT");
        double principle=sc.nextDouble();
        System.out.println("ENTER RATE OF INTEREST");
        double rate=sc.nextDouble();
        System.out.println("ENTER TIME PERIOD");
        double time=sc.nextDouble();
        operation o=new operation();
        int findSIorCI;
        do
        {
        System.out.println("1.SIMPLE INTEREST\n2.COMPOUND INTEREST\n3.EXIT");
        findSIorCI=sc.nextInt();
        switch(findSIorCI)
        {
        case 1:
        	System.out.printf("SIMPLE INTEREST IS: %.4f\n",o.simpleInterest(principle,rate,time));
        	break;
        case 2:
        	System.out.printf("COMPOUND INTEREST IS: %.4f\n",+o.compoundInterest(principle,rate,time));
        	break;
        case 3:
        	System.out.println("Successfully Exited");
        	System.exit(0);
        default:
        	System.out.println("SELECT EITHER 1.SIMPLE INTEREST or 2.COMPOUND INTEREST");
        }
        }while(findSIorCI<=3);
    }
}
