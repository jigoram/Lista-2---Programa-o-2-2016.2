package exercicio_98;

public class Trapezoid extends Quadrilateral{
	
	
	int altura;
	int base1;
	int base2;
	
	public Trapezoid(int altura, int base1, int base2){
		this.altura = altura;
		this.base1 = base1;
		this.base2 = base2;
	}
	
	
	public void setAlgura(int altura){
		this.altura = altura;
	}
	
	
	public int getAltura(){
		return this.altura;
	}


	public int getBase1() {
		return base1;
	}


	public void setBase1(int base1) {
		this.base1 = base1;
	}


	public int getBase2() {
		return base2;
	}


	public void setBase2(int base2) {
		this.base2 = base2;
	}
	
	int basemedia = (base1+ base2)/2;
	
	int area = basemedia * altura;
	

	public int getArea() {
		return area;
	}
}
