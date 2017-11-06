import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ToDoList t1=new ToDoList ();
		boolean i=false;
		Scanner sc= new Scanner(System.in);


		do {
			System.out.println("Enter 1 add an item\n"
					+ "Enter 2 to delete a specific item\n"
					+ "Enter 3 Edit the status and other properties of an Item\n"
					+ "Enter 4 Check if deadline has been exceeded\n"
					+ "Enter 5 Remove done/expired items\n"
					+ "Enter 6 Get the description for each item\n"
					+ "Enter 7 Search for a specific Item\n"
					+ "Enter 8 To sort items by date/alphabetic order\n"
					+ "Enter 9 Exit from the Todolist\n ");
			int x=sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("Enter your task name");
				String task= sc.next();
				System.out.println("Enter your task date as this formal yyyy-mm-dd");
				String date= sc.next();
				LocalDate localDate = LocalDate.parse(date);

				ToDo tadd=new ToDo(task,localDate);
				boolean result= t1.addItem(tadd);
				if (result == true) {
					System.out.println("Item added");
				}else {
					System.out.println("the hasn't been added ");
				}
				break;
				
			case 2:
				System.out.println("Enter index task number that you wanted to deleted");
				int x1=sc.nextInt();
				t1.deletetItem(x1);
				System.out.println("Item deleted");
				break;

			case 3:
				t1.editItem();
				break;
				
			case 4:
				t1.checkdeadline();
				break;

			case 5:
				t1.removedoneItems();
				break;

			case 6:
				t1.printTodoList();
				break;

			case 7:
				t1.searchSpecificItem();
				break;

			case 8:
				
				break;
			case 9:
				i=false;
				break;

			default:System.out.println(" please enter a number between 1 and 9");
			break;
			}

		} while(i=true);

	}	
}	

