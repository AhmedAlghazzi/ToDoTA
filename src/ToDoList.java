import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ToDoList  {

	ArrayList<ToDo> tlist=new ArrayList<ToDo>();
	private ToDo t;
	Scanner sc= new Scanner(System.in);
	private static int nTask=0;


	public void addItem() 
	{
		System.out.println("Enter Your Task Name");
		String task= sc.next();
				System.out.println("Enter Your Task Time");
		String date= sc.next();
		LocalDate localDate = LocalDate.parse(date);

		ToDo t=new ToDo(task,localDate);
		tlist.add(t);
		System.out.println("Item Added");		

		nTask++;

	}
	public void deletetItem() 
	{
		System.out.println("Enter item task number you want to delete");
		int x=sc.nextInt();
		tlist.remove(x-1);
		System.out.println("Item deleated");
		nTask--;

	}
	public void editItem() 
	{

		System.out.println("choos the item number you want to edit");
		int x=sc.nextInt();
		tlist.get(x-1);


		String task= sc.next();
		 t.setTask(task);
		System.out.println("Enter the new date of the task:");
		String date= sc.next();
		LocalDate localDate = LocalDate.parse(date);
		t.setDate(localDate);

		System.out.println("Item edited");

	}
	
	public void deadLineDate(ToDoList tlist) 
	{

		//		System.out.println("Enter item task number you want cha");
		//		int x=sc.nextInt();
		LocalDate today=LocalDate.now();
		
//		System.out.println("Enter item task number you want cha");
//		int x=sc.nextInt();
				
				
					
		   
		}

		

		

	public void printTodoList() {

		Iterator<ToDo> it1=tlist.iterator();
		while (it1.hasNext())
		{
			ToDo t2=it1.next();
			System.out.println("Number of the task    |     Description");
			System.out.println(+tlist.lastIndexOf(it1)+"                    "+t2.toString());
		}
	}
	public ToDoList() {
		super();
	}

}
