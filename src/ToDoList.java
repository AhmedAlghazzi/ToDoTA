import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ToDoList  {
	
	
	List<ToDo> TodoList=new ArrayList<ToDo>();
	private ToDo t;
	Scanner sc= new Scanner(System.in);
	private static int nTask=0;
	
	
	public void addItem() 
	{
		System.out.println("Enter Your Task Name");
		String task= sc.nextLine();
		
		System.out.println("Enter Your Task Time");
		String date= sc.next();
		LocalDate localDate = LocalDate.parse(date);
		
		t=new ToDo(task,localDate);
		TodoList.add(t);
		System.out.println("Item Added");		
	
		nTask++;
		
	}
	public void deletetItem() 
	{
		System.out.println("Enter item task number you want to delete");
		int x=sc.nextInt();
		TodoList.remove(x-1);
		System.out.println("Item deleated");
		nTask--;
		
			}
	public void editItem() 
	{
		
		System.out.println("Enter the new title:");
		String task= sc.nextLine();
		
		System.out.println("Enter the new date of the task:");
		String date= sc.next();
		LocalDate localDate = LocalDate.parse(date);
		t.setTask(task);
		t.setDate(localDate);
		
	}
	public void deadLineDate(ToDoList tList) 
	{
		
//		System.out.println("Enter item task number you want cha");
//		int x=sc.nextInt();
				LocalDate today=LocalDate.now();
				
		if(today < TodoList.get(t)){
			
		    System.out.println("SAME");
		}
		
		
		
	}
	public void printTodoList() {
		
	Iterator<ToDo> it1=TodoList.iterator();
		while (it1.hasNext())
		{
			ToDo t2=it1.next();
			System.out.println("Number of the task    |     Description");
			System.out.println(+nTask+"                    "+t2.toString());
		}
	}

}
