/**
 * 
 */
package pt.iscte.es1.project.gui.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pt.iscte.es1.project.gui.GUI;

/**
 * @author Beatriz
 *
 */
public class GUITester {

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
	 * Test method for {@link pt.iscte.es1.project.gui.GUI#GUI(java.lang.String)}.
	 */
	@Test
	public void testGUI() {
		GUI g = new GUI("");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.GUI#buildGUI()}.
	 */
	@Test
	public void testBuildGUI() {
		GUI g = new GUI("");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.GUI#open()}.
	 */
	@Test
	public void testOpen() {
		new GUI("").open();
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	public void testEquals() {
		GUI g = new GUI("");
		g.equals(GUI.class);
	}

}
