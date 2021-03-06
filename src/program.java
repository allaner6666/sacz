import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class program {
	public ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args){
		boolean exit = false;
		do {
			program prog = new program();
			prog.showMenu();
			int input = prog.readInput();
			if (input==9) exit=true;
		} while (!exit);
	}
	
	public void showMenu(){
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
	
	public int readInput(){
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
			System.out.println("Pls key in new to-do string:");
			String inputstring = scanner.next();
			addNewItem(inputstring);
			break;
			
		case 3:
			//System.out.println("3");
			Scanner del_scan = new Scanner(System.in);
			String item_name = del_scan.nextLine();
			deleteItem(item_name);
			break;
			
		case 4:
			System.out.println("4. Mark an item as complete");
			System.out.println("----------------------------");
			
			System.out.println("Enter item to check: ");
			Scanner tscan = new Scanner(System.in);
			String s = tscan.nextLine();
			showItemAsComplete(s);
			break;
			
		case 9:
			break;
		default:
			System.out.println("Invalid choice");
		}
		return input;
	}
	public void showItemAsComplete(String args)
	{
		findITemInTheList(args);
	}
	
	public void findITemInTheList(String itemtoFind)
	{
		if (list.contains(itemtoFind))
		{
			System.out.println(itemtoFind + " was found in the list");
			System.out.println(itemtoFind + " was marked complete");
        } else {
            System.out.println(itemtoFind + " was not found in the list");
		}
	}
	
	public int showCurrentList(){	
		for (String s : list){
			System.out.println(s);
		}
		return list.size();
	}

	public boolean addNewItem(String string) {
		if(list.contains(string))   return false;
		if(list.add(string))   return true;
		return false;
	}
	public boolean deleteItem(String item)
	{
		System.out.println(item);
		if(list.isEmpty())
		{
			System.out.println("Item do not exist");
			return false;
		}else
		{
			return list.remove(item);
		}

	}
}
