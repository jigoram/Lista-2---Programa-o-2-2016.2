package exercicio_109;

public class Quadrado extends FormaBidimensional{
	
	int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double obterArea() {
		double area = 0;
		area = lado*lado;
		
		return area;
	}
}
