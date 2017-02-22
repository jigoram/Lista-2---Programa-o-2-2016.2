package exercicio_109;

public class Esfera extends FormaTridimensional{
	
	double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double obterVolume() {
		double volume = 0;
		volume = (4 * 3.14 * (raio * raio * raio))/3;
		
		return volume;
	}
	
	@Override
	public double obterArea() {
		double area = 0;
		
		area = 4 * 3.14 * (raio * raio);
		return area;
	}
}
