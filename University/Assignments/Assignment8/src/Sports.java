// Caleb Gibson
// COP3330
// Assignment 7 Interfaces
// due Monday 11/21/2022

// the "extends Comparable<InterfaceName>" part is essential in order to do Collections.sort(List<T>) with a  
// list of classes that all each implement a certain interface. 

public interface Sports extends Comparable<Sports> {	
	public void score_large();
	public void score_med();
	public void score_small();
	public int get_score();
	public int get_id();
}
