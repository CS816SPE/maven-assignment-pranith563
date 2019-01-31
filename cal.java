import java.util.Scanner;

public class cal {

    public static void main(String[] args) {

    	float a, b, res;
    	char choice, ch;
    	Scanner scan = new Scanner(System.in);
  
    		System.out.println("1. Add Two Numbers");
    		System.out.println("2. Exit");
    		System.out.println("3. Subtract Two Numbers");
    		System.out.println("4. Multiply Two Numbers");

    		System.out.println(" Enter your choice");
			choice = scan.next().charAt(0);
			switch(choice)
			{
				case '1' :  System.out.println(" Enter Two Numbers: ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a + b;
							System.out.println(" result = " + res);
							break;

				case '2' :  System.exit(0);
							break;

				case '3' :  System.out.println(" Enter Two Numbers: ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a - b;
							System.out.println(" result = " + res);
							break;

				case '4' :  System.out.println(" Enter Two Numbers: ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a*b;
							System.out.println(" result = " + res);
							break;
							
				default  :  System.out.println("Invalid choice");
							break;

			}

    	

    }
} 