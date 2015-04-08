package menu;

import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JLabelFixture;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.InitializationError;

public class Ice_cream_menuTest {

	private FrameFixture frame;
	private JLabelFixture lblprice;
	
	@Before
	public void setup() throws InitializationError{ 
	    frame = new FrameFixture(new Ice_cream_menu());
	    frame.show();
	}
   
	@Test
	//Testing the total price could be changed according to the ice-cream flavor price.
	public void test1(){
		lblprice = frame.label("price");
	    frame.button("[Chocolate,$20]").click();
	    Assert.assertEquals("20", lblprice.text());    
	}
	
	@Test
	//Testing the total price could be changed according to the ice-cream decorator price.
	public void test2(){
		lblprice = frame.label("price");
	    frame.button("[M&M, $5]").click();
	    Assert.assertEquals("5", lblprice.text());    
	}
	
	@Test
	//Testing only one ice-cream flavor can be chosen each time.
	public void test3(){
		lblprice = frame.label("price");
	    frame.button("[Chocolate,$20]").click();
	    frame.button("[Vanilla,$20]").click();
	    Assert.assertEquals("20", lblprice.text());    
	}
	
	@Test
	//Testing several ice-cream decorators can be chosen each time.
	public void test4(){
		lblprice = frame.label("price");
	    frame.button("[Chocolate,$20]").click();
	    frame.button("[M&M, $5]").click();
	    frame.button("[Strawberry, $4]").click();   
	    Assert.assertEquals("29", lblprice.text());    
	}
	
	@Test
	//Testing start a new transaction when [New IceCream] button is clicked.
	public void test5(){
		lblprice = frame.label("price");
	    frame.button("[Chocolate,$20]").click();
	    frame.button("[M&M, $5]").click();
	    frame.button("[Strawberry, $4]").click();  
	    frame.button("New Ice-Cream").click(); 
	    Assert.assertEquals("0", lblprice.text());    
	}
	
	@After
	public void after(){
	    frame.cleanUp();
	}

}
