package exercicio_109;

public class Cubo extends FormaTridimensional{

	double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	@Override
	public double obterArea() {
		double area = 0;
		area  = 6* (lado * lado);
		return area;
	}
	
	
	@Override
	public double obterVolume() {
		double volume = 0;
		volume = (lado * lado) * (lado * lado) * (lado * lado);
		
		return volume;
	}
}
