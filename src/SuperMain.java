import java.util.Scanner;


public class SuperMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the animals executable programing application");
		boolean notfail = true;
		
		while(notfail)
		{
			System.out.println("Write command:");
			System.out.print(">");
			Scanner sc = new Scanner(System.in);
			String Command = sc.nextLine();
			
			if(Command.equals("exit"))
			{
				notfail = false;
			}
		}
		System.out.println("Program shuting down");
	}

}
