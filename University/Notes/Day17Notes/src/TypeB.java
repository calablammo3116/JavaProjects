
public class TypeB implements Sample, Comparable<Sample>{

	private int value;
	
	public TypeB(int v) {
		this.value = v;
	}
	
	@Override
	public int compareTo(Sample o) {
		// TODO Auto-generated method stub
		return this.value - o.getX();
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public void addX(int x) {
		// TODO Auto-generated method stub
		this.value += x;
	}

}
