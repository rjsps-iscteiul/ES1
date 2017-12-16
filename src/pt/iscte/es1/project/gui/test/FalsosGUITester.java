/**
 * 
 */
package pt.iscte.es1.project.gui.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pt.iscte.es1.project.gui.FalsosAuto;
import pt.iscte.es1.project.gui.FalsosGUI;
import pt.iscte.es1.project.gui.FalsosManual;
import pt.iscte.es1.project.gui.GUI;
import pt.iscte.es1.project.resources.msg.Mensagem;
import pt.iscte.es1.project.utils.ReadFile;

/**
 * @author Beatriz
 *
 */
public class FalsosGUITester {

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
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI()}.
	 */
	@Test
	public void testFalsosGUI() {
		FalsosGUI f = new FalsosGUI("", "", "", "");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testFalsosGUIStringStringStringString() {
		FalsosGUI f = new FalsosGUI("", "", "", "");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildGUI()}.
	 */
	@Test
	public void testBuildGUI() {
		FalsosGUI f = new FalsosGUI("", "", "", "");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#guardarResultados()}.
	 */
	@Test
	public void testGuardarResultados() {
		FalsosAuto f= new FalsosAuto("", "Files/rules.cf", "", "");
		f.guardarResultados();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarManual()}.
	 */
	@Test
	public void testAvaliarManual() {
		FalsosAuto f = new FalsosAuto("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
		f.avaliarManual();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#open()}.
	 */
	@Test
	public void testOpen() {
		FalsosGUI g = new FalsosGUI("", "", "", "");
		g.open();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#setRules_path(java.lang.String)}.
	 */
	@Test
	public void testSetRules_path() {
		FalsosGUI g = new FalsosGUI("", "", "", "");
		g.setRules_path("Files/rules.cf");
	
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildTable()}.
	 */
	@Test
	public void testBuildTable() {
		FalsosGUI g = new FalsosGUI("", "", "", "");
		g.buildTable();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		
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
		FalsosAuto g = new FalsosAuto("", "", "Files/ham.log", "Files/spam.log");
		ReadFile r = new ReadFile();
		Mensagem msg = new Mensagem();
		g.setRules_path("Files/rules.cf");
		double[] pesos= r.pesosReader(2.0, 10);
		HashMap<String, Double> hm = g.transformIntoHashMap(pesos);
		g.evaluate(hm);
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#getPesoFinalMensagem(java.util.HashMap, pt.iscte.es1.project.resources.msg.Mensagem)}.
	 */
	@Test
	public void testGetPesoFinalMensagem() {
		FalsosGUI g = new FalsosGUI("", "Files/rules.cf", "", "");
		Mensagem msg = new Mensagem();
		ReadFile r = new ReadFile();
		g.getPesoFinalMensagem(g.transformIntoHashMap(r.pesosReader(2.0, 10)), new Mensagem());
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarAutomatico()}.
	 */
	@Test
	public void testAvaliarAutomatico() {
		FalsosGUI g = new FalsosGUI("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
		g.avaliarAutomatico();
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
