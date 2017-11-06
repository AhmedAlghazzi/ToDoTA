import java.time.LocalDate;
import java.util.ArrayList;

public class ToDo implements Comparable<ToDo> {

	String task;
	LocalDate date;
	public ToDo(String task, LocalDate date) {
		super();
		this.task = task;
		this.date = date;
	}

	@Override
	public String toString() {
		return "ToDo [task=" + task + ", date=" + date + "]";
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

	public LocalDate checkdeadline() {
		return date;
	}

	@Override
	public int compareTo(ToDo o) {

		int result= this.date.compareTo(o.getDate());
		if (result==0) {
			return(this.task.compareTo(o.getTask()));
		} else {
			return result;
		}
	}



}
