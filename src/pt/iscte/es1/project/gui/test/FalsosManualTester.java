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
import pt.iscte.es1.project.resources.msg.Mensagem;
import pt.iscte.es1.project.utils.ReadFile;

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
//		FalsosManual falsosManual= new FalsosManual(title,rules_path,ham_path,spam_path);
		
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI()}.
	 */
	@Test
	public void testFalsosGUI() {
		FalsosGUI falsosGui = new FalsosGUI("","","","");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testFalsosGUIStringStringStringString() {
		FalsosGUI falsosGui= new FalsosGUI("","","","");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildGUI()}.
	 */
	@Test
	public void testBuildGUI() {
		FalsosGUI falsosGui= new FalsosGUI("","","","");
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
		FalsosGUI falsosGui= new FalsosGUI("","","","");
		falsosGui.open();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#setRules_path(java.lang.String)}.
	 */
	@Test
	public void testSetRules_path() {
		FalsosGUI fi= new FalsosGUI("","","","");
		fi.setRules_path("Files/rules.cf");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildTable()}.
	 */
	@Test
	public void testBuildTable() {
		FalsosGUI falsosGui= new FalsosGUI("","","","");
		falsosGui.buildTable();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
//		FalsosGUI falsosGui= new FalsosGUI("","","","");
//		falsosGui.main(new String[]);
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
		FalsosGUI fg= new FalsosGUI("", "", "Files/ham.log", "Files/spam.log");
		ReadFile r = new ReadFile();
		Mensagem msg = new Mensagem();
		fg.setRules_path("Files/rules.cf");
		double[] pesos= r.pesosReader(2.0, 10);
		HashMap<String, Double> hm = fg.transformIntoHashMap(pesos);
		fg.evaluate(hm);
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#getPesoFinalMensagem(java.util.HashMap, pt.iscte.es1.project.resources.msg.Mensagem)}.
	 */
//	@Test
//	public void testGetPesoFinalMensagem() {
//		FalsosGUI fi = new FalsosGUI("","","","");
//		ReadFile r = new ReadFile();
//		fi.getPesoFinalMensagem(fi.transformIntoHashMap(r.pesosReader(2.0, 10)), new Mensagem());
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarAutomatico()}.
//	 */
//	@Test
//	public void testAvaliarAutomatico() {
//		fail("Not yet implemented");
//	}

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
