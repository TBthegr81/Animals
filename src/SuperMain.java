import java.util.Scanner;


public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib.write("Welcome to the animals executable programing application");
		boolean notfail = true;
		int duckskilled = 0;
		
		Screen s = new Screen();
		
		Lib.write(Lib.getLatestDate("dog"));
		Lib.addThing("Sleep much", "TB", "dog");
		while(notfail)
		{
			Lib.write("Write command:");
			System.out.print(">");
			Scanner sc = new Scanner(System.in);
			String Command = sc.nextLine();
			
			if(Command.equalsIgnoreCase("exit"))
			{
				notfail = false;
			}
			else if(Command.equalsIgnoreCase("fight"))
			{
				Lib.write("The duck died");
				duckskilled++;
				Lib.write("Ducks killed: " + duckskilled);
			}
			if(duckskilled >= 5)
			{
				Lib.write("Motherduck got rly pissed at you and killed you.\nGame Over!");
				notfail = false;
			}
		}
		Lib.write("Program shuting down");
	}

}
