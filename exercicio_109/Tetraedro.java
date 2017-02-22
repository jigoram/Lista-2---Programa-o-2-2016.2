package exercicio_109;

public class Tetraedro extends FormaTridimensional {

	double aresta;

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	
	

	@Override
	public double obterArea() {

		double area;

		area = (aresta * aresta) * 1.73205;

		return area;
	}
	
	@Override
	public double obterVolume() {
		double volume=0;
		
		volume = ((aresta * aresta * aresta) * 1.41421356) / 12;
		return volume;
	}

}
