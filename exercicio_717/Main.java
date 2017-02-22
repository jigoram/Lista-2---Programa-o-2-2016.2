package exercicio_717;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int [] somas = new int[36];
		int dado1;
		int dado2;
		int aux;
		
		for(int i = 0; i <36000;i++){
		
		dado1 = r.nextInt(7);
		dado2 = r.nextInt(7);
		
		aux = dado1 + dado2;	
		
			if(dado1 ==1 && dado2 == 1){
				somas[0]++;
			}
			
			if(dado1 ==1 && dado2 == 2){
				somas[1]++;
			}
			
			if(dado1 ==1 && dado2 == 3){
				somas[2]++;
			}
			
			if(dado1 ==1 && dado2 == 4){
				somas[3]++;
			}
			
			if(dado1 ==1 && dado2 == 5){
				somas[4]++;
			}
			
			if(dado1 ==1 && dado2 == 6){
				somas[5]++;
			}
			
			if(dado1 ==2 && dado2 == 1){
				somas[6]++;
			}
			
			if(dado1 ==2 && dado2 == 2){
				somas[7]++;
			}
			
			if(dado1 ==2 && dado2 == 3){
				somas[8]++;
			}
			
			if(dado1 ==2 && dado2 == 4){
				somas[9]++;
			}
			
			if(dado1 ==2 && dado2 == 5){
				somas[10]++;
			}
			
			if(dado1 ==2 && dado2 == 6){
				somas[11]++;
			}
			
			if(dado1 ==3 && dado2 == 1){
				somas[12]++;
			}
			
			if(dado1 ==3 && dado2 == 2){
				somas[13]++;
			}
			
			if(dado1 ==3 && dado2 == 3){
				somas[14]++;
			}
			
			if(dado1 ==3 && dado2 == 4){
				somas[15]++;
			}
			
			if(dado1 ==3 && dado2 == 5){
				somas[16]++;
			}
			
			if(dado1 ==3 && dado2 == 6){
				somas[17]++;
			}
			
			if(dado1 ==4 && dado2 == 1){
				somas[18]++;
			}
			
			if(dado1 ==4 && dado2 == 2){
				somas[19]++;
			}
			
			if(dado1 ==4 && dado2 == 3){
				somas[20]++;
			}
			
			if(dado1 ==4 && dado2 == 4){
				somas[21]++;
			}
			
			if(dado1 ==4 && dado2 == 5){
				somas[22]++;
			}
			
			if(dado1 ==4 && dado2 == 6){
				somas[23]++;
			}
			if(dado1 ==5 && dado2 == 1){
				somas[24]++;
			}
			
			if(dado1 ==5 && dado2 == 2){
				somas[25]++;
			}
			
			if(dado1 ==5 && dado2 == 3){
				somas[26]++;
			}
			
			if(dado1 ==5 && dado2 == 4){
				somas[27]++;
			}
			
			if(dado1 ==5 && dado2 == 5){
				somas[28]++;
			}
			
			if(dado1 ==5 && dado2 == 6){
				somas[29]++;
			}
			if(dado1 ==6 && dado2 == 1){
				somas[30]++;
			}
			
			if(dado1 ==6 && dado2 == 2){
				somas[31]++;
			}
			
			if(dado1 ==6 && dado2 == 3){
				somas[32]++;
			}
			
			if(dado1 ==6 && dado2 == 4){
				somas[33]++;
			}
			
			if(dado1 ==6 && dado2 == 5){
				somas[34]++;
			}
			
			if(dado1 ==6 && dado2 == 6){
				somas[35]++;
			}
			
			
		}

		String exibe = "    1  -    2    -    3    -    4    -    5    -    6 \n1: ";
		
		for(int j = 0; j < somas.length; j++){
			exibe+= somas[j] + " - ";
			if(j == 5){
				exibe += "\n2:";
				
			}
			
			if(j == 11){
				exibe += "\n3: ";
				
			}
			if(j == 17){
				exibe += "\n4: ";
				
			}
			if(j == 23){
				exibe += "\n5: ";
				
			}
			if(j == 29){
				exibe += "\n6: ";
				
			}
		}
		
		JOptionPane.showMessageDialog(null, exibe);
	}

}
