

import java.util.Date;
public class EjercicioFecha {
	private int mes;
	private int dia;
	private int año;
	
	
	public EjercicioFecha() {
		
	}
	
	public EjercicioFecha (int mes, int dia, int año) {
		this.mes = mes;
		this.dia = dia;
		this.año = año;
		
	}

	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	public int getAño() {
		return año;
	}
	
	public void setAño(int año) {
		this.año = año;
	}
	
	
	public void mostrarFecha() {
		
		System.out.print( "\nFecha seleccionada: " );
        System.out.print(getDia() + "/" + getMes() + "/" + getAño());
        
		
	}
	
	@Override
	public String toString() {
		return dia + "\n" + mes + "\n" + año + "\n";
	}
}
