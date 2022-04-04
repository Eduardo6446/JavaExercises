import javax.swing.JOptionPane;

public class Ejercicio8 {
	public static void main(String[]args) {
		
		double km;
		double gasolina = 0;
		double result = 0;
		int ban = 2; 
		int ban2 = 9;
	
		while (ban != 0){ // Abre while

			
			
			km = Double.parseDouble(JOptionPane.showInputDialog("Kilometros conducidos: "));
			gasolina = Double.parseDouble(JOptionPane.showInputDialog("Litros:"));
			
			result += km/gasolina;
			
			ban2 = Integer.parseInt(JOptionPane.showInputDialog("Desea realizar otro calculo? \n1 = S\n0 = n"));
			
			if(ban2 == 0) {
				result += km/gasolina;
				JOptionPane.showMessageDialog(null, "los kilimoetros por litros fueron "+result);
				ban = 0;
			}

		}

	}    
}
