package exercicio_109;

public class Circulo extends FormaBidimensional{

	int raio;
	
	
	public int getRaio() {
		return raio;
	}


	public void setRaio(int raio) {
		this.raio = raio;
	}


	@Override
	public double obterArea() {
		double area = 3.14 * (raio * raio);

		return area;
	}
	
	
}
