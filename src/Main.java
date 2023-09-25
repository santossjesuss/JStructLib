import java.util.Scanner;

public class Main {

	private enum ChosenStruct {LINEAR_STRUCTURES, TREE_STRUCTURES, GRAPH_STRUCTURES};
	private enum LinearOptions {STACK};
	private enum TreeOptions {};
	private enum GraphOptions {};

	public static void main(String[] args) {
		boolean mustContinue = true;
		System.out.println("Welcome to StructLib");
		while (mustContinue) {
			printMenu();
			readData();
			createStructure();
			
			System.out.print("\nDo you want to continue? (y/n): ");
			mustContinue = checkContinue();
			System.out.println();
		}
		System.out.println("Goodbye!!");
	}
	
	private static void printMenu() {
		System.out.println("Which Structure do you want to use?");

		int i = 1;
		for (ChosenStruct e : ChosenStruct.values()) {
			String invariant = "("+i+")";
			
			if (e == ChosenStruct.LINEAR_STRUCTURES) 
				System.out.println(invariant + " Linear Structures");
			else if (e == ChosenStruct.TREE_STRUCTURES)
				System.out.println(invariant + " Tree Structures");
			else if (e == ChosenStruct.GRAPH_STRUCTURES)
				System.out.println(invariant + " Graph Structures");
			
			i++;
		}
	}
	
	private static void readData() {
		
	}
	
	private static void createStructure() {
		
	}
	
	private static boolean checkContinue() {
		try (Scanner in = new Scanner(System.in)) {
			String consoleInput = in.next().toString();
			if (consoleInput.equals("y") || consoleInput.equals("yes")) {
				return true;
			} else if (consoleInput.equals("n") || consoleInput.equals("no")) {
				return false;
			} else {
				System.out.println("Oops");
				return true;
			}				
		}
	}
	
}
