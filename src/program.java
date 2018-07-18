import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class program {
	static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args){
		boolean exit = false;
		do {
			showMenu();
			int input = readInput();
			if (input==9) exit=true;
		} while (!exit);
	}
	
	public static void showMenu(){
		System.out.println("Welcome to To Do List Application");
		showCurrentList();
		System.out.println("Menu: ");
		System.out.println("1. List all to do list");
		System.out.println("2. Add new item");
		System.out.println("3. Delete an item");
		System.out.println("4. Mark an item as complete");
		System.out.println("9. Quit");
		System.out.print("Enter your choice: ");
	}
	
	public static int readInput(){
		Scanner scanner = new Scanner(System.in);
		int input=0;
		try{
			input = scanner.nextInt();
		}catch (InputMismatchException e){
			System.out.println("Please enter integer");
			scanner.next();
		}
		
		switch(input){
		case 1:
			System.out.println("1");
			showCurrentList();
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;
			
		case 9:
			break;
		default:
			System.out.println("Invalid choice");
		}
		return input;
	}
	
	public static int showCurrentList(){	
		for (String s : list){
			System.out.println(s);
		}
		return list.size();
	}
}
