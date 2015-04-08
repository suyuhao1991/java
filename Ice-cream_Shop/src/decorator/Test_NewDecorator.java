package decorator;

import org.junit.Assert;
import org.junit.Test;

public class Test_NewDecorator {

	@Test
	public void testNewDecorator() {
		NewDecorator decorator = new NewDecorator("Blueberry",4);
		Assert.assertEquals("[Blueberry, $4]", decorator.getText());
	}
	
	@Test
	public void testNewDecorator2() {
		NewDecorator decorator = new NewDecorator("Banana",3);
		Assert.assertEquals("[Banana, $3]", decorator.getText());
	}
   
}
