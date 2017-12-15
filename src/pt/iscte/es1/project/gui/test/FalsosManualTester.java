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

import pt.iscte.es1.project.gui.FalsosAuto;
import pt.iscte.es1.project.gui.FalsosGUI;
import pt.iscte.es1.project.gui.FalsosManual;

/**
 * @author Beatriz
 *
 */
public class FalsosManualTester {

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
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosManual#FalsosManual(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testFalsosManual() {
        String title= "";
		String ham_path= "Files/ham.log";
		String spam_path= "Files/spam.log";
		String rules_path= "Files/rules.cf";
		FalsosManual falsosManual= new FalsosManual(title,rules_path,ham_path,spam_path);
		
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI()}.
	 */
	@Test
	public void testFalsosGUI() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testFalsosGUIStringStringStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildGUI()}.
	 */
	@Test
	public void testBuildGUI() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#guardarResultados()}.
	 */
	@Test
	public void testGuardarResultados() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarManual()}.
	 */
	@Test
	public void testAvaliarManual() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#open()}.
	 */
	@Test
	public void testOpen() {
		FalsosGUI falsosGui= new FalsosGUI();
		falsosGui.open();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#setRules_path(java.lang.String)}.
	 */
	@Test
	public void testSetRules_path() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildTable()}.
	 */
	@Test
	public void testBuildTable() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#transformIntoHashMap(double[])}.
	 */
	@Test
	public void testTransformIntoHashMap() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#evaluate(java.util.HashMap)}.
	 */
	@Test
	public void testEvaluate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#getPesoFinalMensagem(java.util.HashMap, pt.iscte.es1.project.resources.msg.Mensagem)}.
	 */
	@Test
	public void testGetPesoFinalMensagem() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarAutomatico()}.
	 */
	@Test
	public void testAvaliarAutomatico() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#configureAlgorithmList(java.util.List)}.
	 */
	@Test
	public void testConfigureAlgorithmList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

}
