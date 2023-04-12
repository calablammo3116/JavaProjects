import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Sample> sampleList = new ArrayList<Sample>();
		
		sampleList.add(new TypeA(5));
		sampleList.add(new TypeB(10));
		sampleList.add(new TypeA(7));
		sampleList.add(new TypeB(2));
		
		for(Sample s: sampleList) {
			System.out.println(s.getX());
		}

		boolean swap = true;
		System.out.println("Sorting...");
		while(swap) {	// this is a bubble sort O_O woah.
			swap = false;
			for(int i = 0; i < sampleList.size()-1; i++) {
				if(sampleList.get(i).getX() < sampleList.get(i+1).getX()) {
					swap = true;
					Sample temp = sampleList.get(i);
					sampleList.set(i, sampleList.get(i+1));
					sampleList.set(i+1, temp);
				}
			}
		}
		
		for(Sample s: sampleList) {
			System.out.println(s.getX());
		}
	}

}
