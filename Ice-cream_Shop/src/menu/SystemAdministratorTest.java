package menu;

import static org.junit.Assert.*;

import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.fixture.JLabelFixture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.InitializationError;

public class SystemAdministratorTest {

	private FrameFixture saframe;
	private JLabelFixture lblprice;
	
	@Before
	public void setup() throws InitializationError{ 
	    saframe = new FrameFixture(new SystemAdministrator());
	    saframe.show();
	}
	
	@Test
	//Testing whether saframe is really generate
	public void test1(){
		saframe.requireVisible();   
	}
	
	@Test
	//Testing whether a radiobutton is really selected.
	public void test2(){
		saframe.radioButton("rdbtnNewRadioButton").click();
		Assert.assertEquals("Decorator", saframe.radioButton("rdbtnNewRadioButton").text());
		
	}
	
	@After
	public void after(){
	    saframe.cleanUp();
	}

}
