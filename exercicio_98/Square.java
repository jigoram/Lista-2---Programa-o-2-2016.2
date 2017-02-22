package exercicio_98;

public class Square extends Rectangle{

	int lado;
	public Square(int altura, int base1, int base2, int lado) {
		super(altura, base1, base2, lado);
	
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	int area = lado * lado;
	
	public int getArea() {
		return area;
	}
}
