import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoList  {
	
	List<ToDo> TodoList=new ArrayList<ToDo>();

	
	
	
	public void addItem(ToDo t1) {
		
		TodoList.add(t1);
		
	}
	
	




	public List<ToDo> getTodoList() {
		return TodoList;
	}




	public void setTodoList(List<ToDo> todoList) {
		TodoList = todoList;
	}
	

}
