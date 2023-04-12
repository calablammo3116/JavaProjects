
public class TypeA implements Sample, Comparable<Sample>{

	private int value;
	
	public TypeA(int v) {
		this.value = v;
	}

	@Override
	public int getX() {
		return this.value;
	}

	@Override
	public void addX(int x) {
		this.value+=x;
	}

	@Override
	public int compareTo(Sample o) {
		return this.value - o.getX();
	}

}
