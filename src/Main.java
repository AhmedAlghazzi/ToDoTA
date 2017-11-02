import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		List<ToDo> TodoList=new ArrayList<ToDo>();
		
		
		for (int i = 0; i < 10; i++) {
		System.out.println("Enter Your Task Name");
		Scanner sc= new Scanner(System.in);
		String task= sc.nextLine();
		System.out.println("Enter Your Task Time");
		String date= sc.next();
		LocalDate localDate = LocalDate.parse(date);
	
		
		ToDo t1=new ToDo(task,localDate);
		TodoList.add(i, t1);
		}
		
		
		
		
	}

		
		



}
	
