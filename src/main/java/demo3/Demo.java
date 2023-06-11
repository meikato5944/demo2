package demo3;

public class Demo {

	public int absAdd(int a, int b) {
		if(a < 0) {
			a = a * -1;
		}
		if(b < 0) {
			b = b * -1;
		}
		return a+ b;
	}
}
