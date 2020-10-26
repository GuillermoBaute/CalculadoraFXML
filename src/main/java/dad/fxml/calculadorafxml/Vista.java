package dad.fxml.calculadorafxml;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class Vista extends BorderPane {

	private TextField tfPantalla;
	private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btPunto, btMAS, btMENOS, btMULTI, btDIVISION, btCE,
			btC, btIGUAL;

	public Vista() {
		super();

		BorderPane pantalla = new BorderPane();
		pantalla.setTop(tfPantalla);

		// GridPane para botones
	}

}
