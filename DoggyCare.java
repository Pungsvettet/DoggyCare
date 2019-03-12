import java.util.Scanner;
import java.util.ArrayList;

/**
 * Pablo Ahava Pizarro paah4127
 */

public class DoggyCare {
	
	private Scanner userInput = new Scanner(System.in);
	private ArrayList<Dog> dogs = new ArrayList<>();
	
	public static void main(String[] args) {
		new DoggyCare().runProgram();

	}
	
	public void runProgram() {
		startUp();
		commandLoop();
		closeDown();
	}
	
	public void startUp() {
		System.out.print("Welcome!");
	}
	
	public void closeDown() {
		System.out.println("Bye!");
	}
	
	public String readCommand() {
		System.out.print("\ncommand> ");
		String command = userInput.nextLine();
		return command;
	}
	
	public void registerNewDog() {
		System.out.print("Name: ");
		String name = userInput.nextLine();
		System.out.print("Breed: ");
		String breed = userInput.nextLine();
		System.out.print("Age: ");
		int age = userInput.nextInt();
		System.out.print("Weight: ");
		double weight = userInput.nextDouble();
		userInput.nextLine();
		
		System.out.print("Dog has been registered!");
		Dog newDog = new Dog(name, breed, age, weight);
		dogs.add(newDog);
	}
	
	public void listDogs() {
		System.out.print("Shortest taillenght: ");
		double tailLength = userInput.nextDouble();
		userInput.nextLine();
		for(Dog theDog : dogs) {
			if (theDog.getTailLength() >= tailLength) {
				System.out.print(dogs.toString());
			}
			return;}
		
	}
	
	public void increaseAge() {
		System.out.print("Name of dog whom you wish to increase age: ");
		String name = userInput.nextLine();
		for (Dog theDog : dogs) {
			if(theDog.getName().equals(name)) {
			theDog.increaseAge();
			System.out.print(name + "'s age has been increased by 1.");			
			return;}
		}
		System.out.print("Error: " + name + " could not be found.");
	}
	
	public void removeDog() {
		System.out.print("Name of dog you wish to remove: ");
		String name = userInput.nextLine();
		for(Dog theDog : dogs) {
			if(theDog.getName().equals(name)) {
				dogs.remove(theDog);
				System.out.print("Dog " + name + " has been removed.");
				return;
			}
		}
		System.out.print("Error: " + name + " could not be found.");
	}
	
	public void inputInfo(String command) {
		System.out.println("You've chosen: " + command);		
	}
	
	public void commandLoop() {	
		boolean programRunning = true;
		do {
			String command = readCommand();
			programRunning = handleCommand(command);
		} while (programRunning);
	}
	
	public boolean handleCommand(String command) {
		command = command.toLowerCase();
		switch (command) {
		case ("register new dog"):
			inputInfo(command);
			registerNewDog();
			break;
		case("increase age"):
			inputInfo(command);
			increaseAge();
			break;
		case("list dogs"):
			inputInfo(command);
			listDogs();
			break;
		case("remove dog"):
			inputInfo(command);
			removeDog();
			break;
		case("exit"):			
			return false;
		default:
			System.out.println("Error: Invalid command.");
			return true;
		}	
		return true;
	}
}
