
public class GoodStudent implements Student {

	private int hours;
	private double rate;
	
	public GoodStudent() {
		this.hours = 0;
		this.rate = .75;
		//values would be in prompt
	}
	
	public void work(int time) {
		this.hours += time;
	}
	
	public int calcGrade() {
		return (int)(this.hours * this.rate); //"this" bit is optional if have local variables defined with that name
	}

	public int compareTo(Student o) {
		return this.calcGrade() - o.calcGrade();	//returns grades in ascending order;
													//if want descending, need to do 
													//o.calcGrade() - this.calcGrade()
	}
}
