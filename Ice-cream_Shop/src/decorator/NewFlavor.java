package decorator;

import javax.swing.JButton;

public class NewFlavor extends JButton{
	
	public NewFlavor(String name, int price){  
    	super("["+ name + ", $" + price + "]");
    }
	
}
