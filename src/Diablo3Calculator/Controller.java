package Diablo3Calculator;

import javax.swing.JOptionPane;

public class Controller {

	private boolean loop = true;
	private int response = 0;
	private String[] choices = {"Gem Calculator", "Paragon Calculator", "Exit"};
	private String message;


	public void programLoop(){
		while (loop) {
			message = "Welcome to Diablo 3 Calculator!\n\n- Designed and created by Lars Quaade\n\nChoose a service:";
			response = JOptionPane.showOptionDialog(
					null                         // Center in window.
					, message			         // Message
					, "Diablo 3 Calculator"      // Title in titlebar
					, JOptionPane.YES_NO_OPTION  // Option type
					, JOptionPane.PLAIN_MESSAGE  // messageType
					, null                       // Icon (none)
					, choices                    // Button text as above.
					, ""    // Default button's label
					);
			if (response == 0){
				GemUpgrade GU = new GemUpgrade();
				GU.gemUpgrade();
			}
			if (response == 1){
				ParagonCalculator PC = new ParagonCalculator();
				PC.paragonCalculator();
			}
			if (response == 2){
				System.exit(0);
			}
		}
	}
}