/* CS586 Project GasPUmpSystem
 *      by Xiao Li A20370639
 *      
 *     Use  Driver.java to implement all the classes involved
*/

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		//print gas pump system selection menu
		Scanner in = new Scanner(System.in);
		System.out.println("              Welcome to the GAS PUMP system!");
		int choice = 0;
		do {
			System.out.println("-------------------------------------------------------");
			System.out.println("Please select GasPump_1 or GasPump_2: ");
			System.out.println("1. GasPump_1 ");
			System.out.println("2. GasPump_2 ");
			System.out.print("Please select GP: ");
			while (!in.hasNextInt()) {
				in.nextLine();
				System.out.print("Please select GP: ");
			}
			choice = in.nextInt();
		} while (choice < 1 || choice > 2 );	
		System.out.println("-------------------------------------------------------");
		System.out.println(" ");
		
		//Gas pump memu display		
		if(choice == 1){// Gas Pump 1 operations
			GasPump_1 gp1 = new GasPump_1();

			
			System.out.println("GasPump_1. Menu of Operations");
			System.out.println("---------------------------------------");
			System.out.println("0. Activate(float, float)");
			System.out.println("1. Start()");
			System.out.println("2. PayCredit()");
			System.out.println("3. Reject()");
			System.out.println("4. Cancel()");
			System.out.println("5. Approved()");
			System.out.println("6. Super()");
			System.out.println("7. Regular()");
			System.out.println("8. StartPump()");
			System.out.println("9. PumpGallon()");
			System.out.println("a. StopPump()");
			System.out.println("q. Quit the demo");
			System.out.println("---------------------------------------");
			
			in.nextLine();
			String op = "1";
			char operation = '1';
			while(!op.equals("q")){	        	
		        do{
		        System.out.println();
				System.out.print("Select Operation(0-Activate, 1-Start, 2-PayCredit, 3-Reject,\n "
						+ "4-Cancel, 5-Approved, 6-Super, 7-Regular, 8-StartPump, 9-PumpGallon,\n "
						+ "a-StopPump, q-Quit) :");
				op = in.nextLine();
		        }while(op.equals(""));
				operation = op.charAt(0);
				switch(operation){
					case '0': System.out.println("Operation: Activate(float a, float b)");
							  System.out.println();
					          float a, b;					         
					          System.out.print("Enter value a :");
					          a = in.nextFloat();
					          System.out.print("Enter value b :");
					          b = in.nextFloat();
					          in.nextLine();
					          gp1.Activate(a, b);
				       		  break;
					case '1': System.out.println("Operation: Start()");
							  System.out.println();
							  gp1.Start();
							  break;
					case '2': System.out.println("Operation: PayCredit()");
							  System.out.println();
							  gp1.PayCredit();
		       		          break;
					case '3': System.out.println("Operation: Reject()");
							  System.out.println();
						 	  gp1.Reject();
		       		          break;
					case '4': System.out.println("Operation: Cancel()");
							  System.out.println();
							  gp1.Cancel();
		       		          break;
					case '5': System.out.println("Operation: Approved()");
							  System.out.println();
							  gp1.Approved();
		       		          break;
					case '6': System.out.println("Operation: Super()");
							  System.out.println();
							  gp1.Super();
		       		          break;
					case '7': System.out.println("Operation: Regular()");
							  System.out.println();
							  gp1.Regular();
		       		          break;
					case '8': System.out.println("Operation: StartPump()");
							  System.out.println();
							  gp1.StartPump();
		       		          break;
					case '9': System.out.println("Operation: PumpGallon()");
							  System.out.println();
							  gp1.PumpGallon();
		       		          break;
					case 'a': System.out.println("Operation: StopPump()");
							  System.out.println();
							  gp1.StopPump();
							  break;
					default:  System.out.println("Operation: Quit");
							  System.out.println();
						      break;		       		  		 	       		  		       		  
				}
				
			}
			System.out.println();
			System.out.println("Exit the demo! Thank you!");

		}else if(choice == 2){// Gas Pump 2 operations
			GasPump_2 gp2 = new GasPump_2();
			
			System.out.println("GasPump_2. Menu of Operations");
			System.out.println("---------------------------------------");
			System.out.println("0. Activate(int, int, int)");
			System.out.println("1. Start()");
			System.out.println("2. PayCash(int)");
			System.out.println("3. Cancel()");
			System.out.println("4. Premium()");
			System.out.println("5. Regular()");
			System.out.println("6. Super()");
			System.out.println("7. StartPump()");
			System.out.println("8. PumpLiter()");
			System.out.println("9. Stop()");
			System.out.println("a. Receipt()");
			System.out.println("b. NoReceipt()");
			System.out.println("q. Quit the demo");
			System.out.println("---------------------------------------");
			
			in.nextLine();
			String op = "1";
			char operation = '1';
			while(!op.equals("q")){
				do{
				System.out.println();
				System.out.print("Select Operation(0-Activate, 1-Start, 2-PayCash, 3-Cancel,\n "
						+ "4-Premium, 5-Regular, 6-Super, 7-StartPump, 8-PumpLiter, 9-Stop,\n "
						+ "a-Receipt, b-NoReceipt, q-Quit) :");
				op = in.nextLine();
				}while(op.equals(""));
				operation = op.charAt(0);
				switch(operation){
					case '0': System.out.println("Operation: Activate(int a, int b, int c)");
							  System.out.println();
							  int a, b, c;					         
							  System.out.print("Enter value a :");
							  a = in.nextInt();
							  System.out.print("Enter value b :");
							  b = in.nextInt();
							  System.out.print("Enter value c :");
							  c = in.nextInt();
							  in.nextLine();
							  gp2.Activate(a, b, c);
				       		  break;
					case '1': System.out.println("Operation: Start()");
							  gp2.Start();
							  break;
					case '2': System.out.println("Operation: PayCash(int c)");
							  System.out.println();
					          int ca;					         
					          System.out.print("Enter cash value :");
					          ca = in.nextInt();
					          in.nextLine();
					          gp2.PayCash(ca);
		       		          break;
					case '3': System.out.println("Operation: Cancel()");
							  System.out.println();
							  gp2.Cancel();
		       		          break;
					case '4': System.out.println("Operation: Premium()");
							  System.out.println();
							  gp2.Premium();
		       		          break;
					case '5': System.out.println("Operation: Regular()");
							  System.out.println();
							  gp2.Regular();
		       		          break;
					case '6': System.out.println("Operation: Super()");
							  System.out.println();
							  gp2.Super();
		       		          break;
					case '7': System.out.println("Operation: StartPump()");
							  System.out.println();
							  gp2.StartPump();
		       		          break;
					case '8': System.out.println("Operation: PumpLiter()");
							  System.out.println();
							  gp2.PumpLiter();
		       		          break;
					case '9': System.out.println("Operation: Stop()");
							  System.out.println();
							  gp2.Stop();
		       		          break;
					case 'a': System.out.println("Operation: Receipt()");
							  System.out.println();
							  gp2.Receipt();
							  break;
					case 'b': System.out.println("Operation: NoReceipt()");
							  System.out.println();
							  gp2.NoReceipt();
					          break;
					default:  System.out.println("Operation: Quit");
						      break;		       		  		 	       		  		       		  
				}
				
			}
			System.out.println();
			System.out.println("Exit the demo! Thank you!");	
			
		}


	}//end of main

}
