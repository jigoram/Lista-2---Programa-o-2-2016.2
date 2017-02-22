package exercicio_98;

public class Parallelogram extends Trapezoid{

	public Parallelogram(int altura, int base1, int base2) {

		
		super(altura, base1, base2);
	}

	int area = altura * base1;

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	
	
	
}
