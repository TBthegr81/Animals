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
		while(notfail)
		{
			animals.get(0).checkLife();
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
		}
		Lib.write("Program shuting down");
	}

}
