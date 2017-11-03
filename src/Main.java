import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ToDoList t1=new ToDoList ();
		int i=0;
		Scanner sc= new Scanner(System.in);


		do {
			System.out.println("Enter 1 add an item\n"
					+ "Enter 2 to delete a specific item\n"
					+ "Enter 3 to check deadline\n"
					+ "Enter 4 to remove expired items\n"
					+ "Enter 5 to get description for each items\n"
					+ "Enter 6 to search for a specific item\n"
					+ "Enter 7 to edit properties of an item\n"
					+ "Enter 8 to return to the main menu\n ");
			int x=sc.nextInt();
			switch (x) {
			case 1:

				t1.addItem();

				break;
			case 2:
				t1.deletetItem();
				break;
			case 3:
				t1.deadLineDate(t1);
				break;
			case 4:

				break;

			case 5:

				break;
			case 6:

				break;
			case 7:
				t1.editItem();
				break;
			case 8:

				t1.printTodoList();
				break;

			default:System.out.println(" please enter a number between 1 and 8");
			break;
			}
			i++;

		} while(i<8);

	}	
}	

