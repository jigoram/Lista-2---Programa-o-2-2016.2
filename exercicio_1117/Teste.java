package exercicio_1117;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
	
		 try{
			   if(args[0] == null)
			    throw new ExceptionB();
			   String numero = JOptionPane.showInputDialog("Digite um numero entre 0 e 10");
			   Integer inteiro = Integer.parseInt(numero);
			   if(inteiro > 10 || inteiro < 0)
			    throw new Exception();
			   }catch(Exception me){
			     System.err.println(me.getMessage());
			   }
			  }

	}


