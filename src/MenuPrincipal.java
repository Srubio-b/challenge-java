import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {

		String[] opciones = { "Conversor de moneda", "Conversor de temperatura" };

        // Mostrar el cuadro de diálogo
        String opcionSeleccionada = (String) JOptionPane.showInputDialog
        		(null, "Seleccione una opción de conversión", 
        				"Menú", JOptionPane.PLAIN_MESSAGE, null, 
        				opciones, opciones[0]);

        // Comprobar la opción seleccionada
        if (opcionSeleccionada != null) {
            if (opcionSeleccionada.equals(opciones[0])) {
                // Lógica del conversor de moneda
                System.out.println("Has seleccionado el conversor de moneda");
            } else if (opcionSeleccionada.equals(opciones[1])) {
                // Lógica del conversor de temperatura
                System.out.println("Has seleccionado el conversor de temperatura");
            }
        }
		
	}

}
