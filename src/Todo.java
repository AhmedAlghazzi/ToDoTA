import java.time.LocalDate;

public class Todo {
	
	String task;
	LocalDate date;
	public Todo(String task, LocalDate date) {
		super();
		this.task = task;
		this.date = date;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}