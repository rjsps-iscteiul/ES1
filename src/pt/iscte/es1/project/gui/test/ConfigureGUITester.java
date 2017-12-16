/**
 * 
 */
package pt.iscte.es1.project.gui.test;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pt.iscte.es1.project.gui.ConfigureGUI;

/**
 * @author Beatriz
 *
 */
public class ConfigureGUITester {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.ConfigureGUI#buildGUI()}.
	 */
	@Test
	public void testBuildGUI() {
		ConfigureGUI gui = new ConfigureGUI("");
		
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.ConfigureGUI#ConfigureGUI(java.lang.String)}.
	 */
	@Test
	public void testConfigureGUI() {
		ConfigureGUI gui = new ConfigureGUI("");
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	public void testEquals() {
		ConfigureGUI gui = new ConfigureGUI("");
		gui.equals(JFrame.class);
	}

}
