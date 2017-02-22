package exercicio_98;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
	Trapezoid t = new Trapezoid(10, 10, 10);
	Parallelogram p = new Parallelogram(10, 10, 0);
	Rectangle r = new Rectangle(10, 0, 0, 5);
	Square s = new Square(0, 0, 0, 10);
	
	
	JOptionPane.showMessageDialog(null, t.getArea() +" " + p.getArea() + " " + r.getArea() + " "+ s.getArea());
	}

}
