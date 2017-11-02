import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		List<Todo> TodoList=new ArrayList<Todo>();
		System.out.println("Enter Your Task Name");
		Scanner sc= new Scanner(System.in);
		String task=sc.nextLine();
		System.out.println("Enter Your Task Time in year-month-day format");
		String date =sc.nextLine();
		System.out.println(task +" "+ date);
		Todo T1=new Todo(task, date);
		TodoList.add(T1);
		

	}

		
		

}

