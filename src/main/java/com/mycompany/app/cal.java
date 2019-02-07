package com.mycompany.app;
import java.util.Scanner;

public class cal {

    public static void main(String[] args) {

    	float a=9, b=8, res;
    	char choice=1, ch=1;
  	do{
    		
			switch(choice)
			{
				case '1' :  System.out.println(" Adding Two Numbers: ");
							System.out.println("a = "+a);
					
							System.out.println("b = "+b);
							res = a + b;
							System.out.println(" result = " + res);
							break;

				case '2' :  System.exit(0);
							break;

				case '3' :  System.out.println(" Enter Two Numbers: ");

							res = a - b;
							System.out.println(" result = " + res);
							break;

				case '4' :  System.out.println(" Enter Two Numbers: ");
							
							res = a*b;
							System.out.println(" result = " + res);
							break;
							
				default  :  System.out.println("Invalid choice");
							break;

			}
	}while(choice!=2);

    	

    }
} 
