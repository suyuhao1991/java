package decorator;

import javax.swing.JButton;

public class NewDecorator extends JButton{
	
	public NewDecorator(String name, int price){  
		super("["+ name + ", $" + price + "]");
    }
	
}
