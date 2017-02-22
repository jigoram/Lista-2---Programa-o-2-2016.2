package exercicio_98;

public class Rectangle extends Parallelogram{

	int lado;
	public Rectangle(int altura, int base1, int base2, int lado) {
		super(altura, base1, base2);
		this.lado = lado;
		
	}
	
	int area = base1 * lado;
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int getArea() {
		return area;
	}
}
