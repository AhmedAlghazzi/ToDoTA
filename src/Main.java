import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i=0;

		ToDoList tlist=new ToDoList();
		//		List<ToDo> TodoList=new ArrayList<ToDo>();



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
				

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;

			default:System.out.println(" please enter a number between 1 and 8");
				break;
			}
			i++;

		} while(i<8);




		//		for (int i = 0; i < x+1; i++) 
		//		{
		//			System.out.println("Enter Your Task Name");
		//			String task= sc.nextLine();
		//			
		//			System.out.println("Enter Your Task Time");
		//			String date= sc.next();
		//			LocalDate localDate = LocalDate.parse(date);
		//	
		//			ToDo t1=new ToDo(task,localDate);
		////			TodoList.add(i, t1);
		//			tlist.addItem(t1);
		//		}

	}	
}	

