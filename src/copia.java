import javax.swing.JOptionPane;

public class copia {

	public static void main(String[] args) {
		
		
		String[] opciones = {"Conversor de moneda", "Conversor de temperatura"} ;
		
		String opcionSeleccionada = (String) JOptionPane.showInputDialog
				(null, "Seleccione el tipo de conversor", "Menú", 
						JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
	}
	
}
