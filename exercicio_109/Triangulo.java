package exercicio_109;

public class Triangulo extends FormaBidimensional {

	double altura;
	double base;

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;

	}

	public double getBase() {
		return base;
	}

	public void setBase(int lado) {
		this.base = base;
	}

	@Override
	public double obterArea() {
		double area = 0;
		
		area  = base * (altura /2);
		
		return area;
	}
}
