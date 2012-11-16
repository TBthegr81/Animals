import java.util.Scanner;


public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib.Write("Welcome to the animals executable programing application");
		boolean notfail = true;
		Animal animals[] = new Animal[2];
		
		//Screen s = new Screen();
		
		//Lib.write(Lib.getLatestDate("dog"));
		//Lib.addThing("Sleep much", "TB", "dog");
		Lib.Write("- Username -");
		String userName = Lib.Input();
		Lib.Write("- Animals name -");
		String animalName = Lib.Input();
		
		while(notfail)
		{
			String Command = Lib.Input();
			
			if(Command.equalsIgnoreCase("exit"))
			{
				notfail = false;
			}
			else if(Command.equalsIgnoreCase("Feed"))
			{
				animals[0].DecreaseHunger(20);
			}
		}
		Lib.Write("Program shuting down");
	}

}
