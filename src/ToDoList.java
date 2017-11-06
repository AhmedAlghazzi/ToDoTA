import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ToDoList  {

	private ArrayList<ToDo> tlist=new ArrayList<ToDo>();
	private ToDo t;
	Scanner sc= new Scanner(System.in);
	private static int nTask = 0;


	public boolean addItem(ToDo tAdd) 
	{
		tlist.add(nTask,tAdd);

		nTask++;
		return true;

	}
	public void deletetItem(int x) 
	{
		tlist.remove(x);
		nTask--;

	}
	public void editItem() 
	{

		System.out.println("choos the index number of the task you want to edit");
		int x2=sc.nextInt();
		System.out.println("Enter the new name of the task:");
		String taske= sc.next();
		System.out.println("Enter the new date of the task:");
		String datee= sc.next();
		LocalDate localDatee = LocalDate.parse(datee);
		tlist.set(x2, new ToDo(taske,localDatee));

		System.out.println("Item edited");

	}
	
	

	public void checkdeadline() 
	{
		LocalDate today=LocalDate.now();
		Iterator<ToDo> it= tlist.iterator();
		while (it.hasNext()) {
			ToDo td = it.next();
			if (td.getDate().isBefore(today)) {
				System.out.println(it.toString());
			}

		}

	}



	public void removedoneItems()
	{
		LocalDate today=LocalDate.now();
		Iterator<ToDo> it= tlist.iterator();
		while (it.hasNext()) {
			ToDo td = it.next();
			if (td.getDate().isBefore(today)) {
				it.remove();
			}
		}
		System.out.println("");
	}
	
	
	
	
	
	public ToDo searchSpecificItem() 
	{

		System.out.println("Input the task name");
		String f=sc.next();
		Iterator<ToDo> it= tlist.iterator();
		while (it.hasNext()) {
			ToDo td = it.next();
			if (td.getTask().equals(f)) {
				return td;
			}
		}
		System.out.println("We didn't found item");
		return null;
	}


	public void sortToDoList() {
		
		
		
	}




	public void printTodoList() {

		Iterator<ToDo> it1=tlist.iterator();
		System.out.println("Number of the task    |     Description");
		while (it1.hasNext())
		{
			ToDo t2=it1.next();

			System.out.println(tlist.indexOf(t2)+"                                    "+t2.toString());
		}
	}








	public ToDoList() {
		super();
	}
	public ArrayList<ToDo> getTlist() {
		return tlist;
	}
	public void setTlist(ArrayList<ToDo> tlist) {
		this.tlist = tlist;
	}
}
