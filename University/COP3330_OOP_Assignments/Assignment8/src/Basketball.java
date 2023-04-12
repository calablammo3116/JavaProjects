// Caleb Gibson
// COP3330
// Assignment 7: Interfaces
// due 11/21/2022

public class Basketball implements Sports {

	private int score = 0;
	private int id;
	
	public Basketball(int id) {
		this.id = id;
	}
	
	@Override
	public void score_large() {
		this.score += 3;
	}

	@Override
	public void score_med() {
		this.score += 2;
	}

	@Override
	public void score_small() {
		this.score++;
	}

	@Override
	public int get_score() {
		return this.score;
	}
	
	@Override
	public int get_id() {
		return this.id;
	}

	@Override
	public int compareTo(Sports other) {
		// Naturally sorts in ascending order. For example, for "Basketball.compareTo(other)" the return result 
		// being negative would indicate that "Basketball" is smaller than "other," and as a result should be  
		// put above "other" in the list of sorted elements (assuming "sorted" means "sorted-in-ascending-order").
		if (this.get_score() < other.get_score()) {
			return 1;
		} else if (this.get_score() == 0) {
			return 0;
		} else {
			return -1;
		}
	}

}
