import java.io.IOException;
import java.util.ArrayList;



public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib.write("Welcome to the animals executable programing application");
		boolean notfail = true;
		ArrayList<Animal> animals = new ArrayList<Animal>();
		//Lib.write(Lib.getLatestDate("dog"));
		//Lib.addThing("Sleep much", "TB", "dog");
		Lib.write("- Username -");
		String userName = Lib.input();
		Lib.write("- Animals name -");
		String animalName = Lib.input();
		
		Screen s = new Screen();
		animals.add(new Animal(animalName));
		Lib.write(animals.get(0).getFullStats());
		animals.get(0).setHowHappy(45);
		s.drawWorld(animals);
		while(notfail)
		{
			animals.get(0).checkLife();
			s.drawWorld(animals);
			Lib.write("Write command");
			String Command = Lib.input();
			
			if(Command.equalsIgnoreCase("exit"))
			{
				notfail = false;
			}
			else if(Command.equalsIgnoreCase("feed"))
			{
				animals.get(0).decreaseHunger(20);
			}
			else if(Command.equalsIgnoreCase("kill"))
			{
				animals.get(0).kill();
			}
			else if(Command.equalsIgnoreCase("info"))
			{
				Lib.write(animals.get(0).getFullStats());
			}
			else if(Command.equalsIgnoreCase("play"))
			{
				animals.get(0).play();
			}
			else if(Command.equalsIgnoreCase("sleep"))
			{
				animals.get(0).sleep();
			}
			else if(Command.equalsIgnoreCase("help"))
			{
				Lib.write("Commands: exit, info, play, feed, sleep, kill, help");
			}
		}
		Lib.write("Program shuting down");
	}

}
