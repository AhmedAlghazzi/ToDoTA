import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ToDoList tlist=new ToDoList();
//		List<ToDo> TodoList=new ArrayList<ToDo>();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("How many task do you want to add?");
		int x=sc.nextInt();
		
		
		
		
		
		
		for (int i = 0; i < x+1; i++) 
		{
			
			tlist.addItem();
		}
		
		
		
		
	}

		
		



}
	
