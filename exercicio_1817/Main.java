package exercicio_1817;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Main {

		public static void stringReverse(char[] array){
			char[] novoArray = new char[array.length];
			String exibe = " ";
			for(int i=array.length; i<=0; i--){
				
				
				novoArray[array.length - i] = array[i];
				exibe += novoArray[array.length - i];
				
			}
			
			System.out.println(novoArray);
			
		}
		
	public static void main(String[] args) {
		
		
		String palavra = JOptionPane.showInputDialog("digite a palavra");	
		stringReverse(palavra.toCharArray());

		
		
	}

}
