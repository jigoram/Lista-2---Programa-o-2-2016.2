package exercicio_1811;

import javax.swing.JOptionPane;

public class Teste {

	
	public static int mdc( int x, int y ){
        if(x == y){
            return x;
        }
        else if( y > x ){
            return mdc( x, y-x );
        }
        else if( x > y ){
            return mdc( x - y, y );
        }
        return 0;
    }
	
	
	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o 1 numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o 1 numero"));
		double result;
		result = mdc(numero1, numero2);
		
		JOptionPane.showMessageDialog(null, result);
		

	}

}
