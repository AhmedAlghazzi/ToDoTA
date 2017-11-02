import java.time.LocalDate;

public class ToDo {
	
	String task;
	LocalDate date;
	public ToDo(String task, LocalDate date) {
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


	@Override
	public String toString() {
		return "ToDo [task=" + task + ", date=" + date + "]";
	}
	
	
	

}
