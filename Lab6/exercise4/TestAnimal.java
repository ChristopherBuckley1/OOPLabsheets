package Lab6.exercise4;

//TestAnimal.java
/*A driver (test) class that contains the main() method for 
testing the functionality of the Animal class. This version of the driver is
also to demonstrate the creation of an array of Animal objects*/


public class TestAnimal {
	public static void main( String args[]) {

		Animal allAnimals[] = new Animal[10];

	    System.out.println("Calling the no-argument constructor to create the first animal....");
		Animal animal1 = new Animal(); //tests no-arg constructor
		String anacondaContinents[] = {"Asia","America"};
		String lionContinents[] = {"Africa","Asia"}; //initialise an array of strings

		//tests 4-arg constructor and the 4 mutator methods
		System.out.println("\nCalling the 4-argument constructor to create a lion object....");
		Animal animal2  = new Animal("Lion",lionContinents,200,40);


		System.out.println("\nCalling the 4-argument constructor to create a rat object....");
		Animal animal3  = new Animal("Rat",new String[]{"Europe","America","Africa","Asia"},0.2,5);

		System.out.println("\nCalling the 4-argument constructor to create a polar bear object....");
		Animal animal4  = new Animal("Polar Bear",new String[]{"Antarctica"},450,15);
		Animal animal5 = new Animal("Anaconda",anacondaContinents,100,8);

		allAnimals[0] = animal1;
		allAnimals[1] = animal2;
		allAnimals[2] = animal3;
		allAnimals[3] = animal4;
		allAnimals[4] = animal5;

		animal1.setType("Gorilla");
		animal1.setWeight(250);

		System.out.println("\n\nThe details of all the animals in the Animal array are:\n\n");

		for(int i=0;i<allAnimals.length;i++)
			if(allAnimals[i]==null)
				break;
			else
			System.out.println(allAnimals[i]+"\n\n");

	}
}