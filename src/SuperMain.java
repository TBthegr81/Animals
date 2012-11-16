import java.util.Scanner;


public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib.write("Welcome to the animals executable programing application");
		boolean notfail = true;
		Animal animals[] = new Animal[2];
		
		Screen s = new Screen();
		
		//Lib.write(Lib.getLatestDate("dog"));
		//Lib.addThing("Sleep much", "TB", "dog");
		Lib.write("- Username -");
		String userName = Lib.input();
		Lib.write("- Animals name -");
		String animalName = Lib.input();
	
		animals[0] = new Animal(animalName);
		Lib.write(animals[0].getFullStats());
		while(notfail)
		{
			animals[0].checkLife();
			Lib.write("Write command");
			String Command = Lib.input();
			
			if(Command.equalsIgnoreCase("exit"))
			{
				notfail = false;
			}
			else if(Command.equalsIgnoreCase("Feed"))
			{
				animals[0].decreaseHunger(20);
			}
			else if(Command.equalsIgnoreCase("kill"))
			{
				animals[0].kill();
			}
			else if(Command.equalsIgnoreCase("info"))
			{
				Lib.write(animals[0].getFullStats());
			}
			else if(Command.equalsIgnoreCase("play"))
			{
				animals[0].play();
			}
		}
		Lib.write("Program shuting down");
	}

}
