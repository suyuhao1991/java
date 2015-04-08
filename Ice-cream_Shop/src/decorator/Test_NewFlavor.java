package decorator;

import org.junit.Assert;
import org.junit.Test;

public class Test_NewFlavor {

	@Test
	public void testNewFlavor() {
		NewFlavor flavor = new NewFlavor("Milk",15);
		Assert.assertEquals("[Milk, $15]", flavor.getText());
	}
	
	@Test
	public void testNewFlavor2() {
		NewFlavor flavor = new NewFlavor("Coffee",18);
		Assert.assertEquals("[Coffee, $18]", flavor.getText());
	}

}
