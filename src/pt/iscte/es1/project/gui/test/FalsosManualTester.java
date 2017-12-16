/**
 * 
 */
package pt.iscte.es1.project.gui.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
public class FalsosManualTester  extends FalsosGUITester{

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
//		FalsosManual fi= new FalsosManual(title,rules_path,ham_path,spam_path);
		
	}

//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI()}.
//	 */
//	@Test
//	public void testFalsosGUI() {
//		FalsosManual fi = new FalsosManual("","","","");
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
//	 */
//	@Test
//	public void testFalsosGUIStringStringStringString() {
//		FalsosManual fi= new FalsosManual("","","","");
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildGUI()}.
//	 */
//	@Test
//	public void testBuildGUI() {
//		FalsosManual fi= new FalsosManual("","","","");
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#guardarResultados()}.
//	 */
//	@Test
//	public void testGuardarResultados() {
//		FalsosAuto fi= new FalsosAuto("", "Files/rules.cf", "", "");
//		fi.guardarResultados();
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarManual()}.
//	 */
//	@Test
//	public void testAvaliarManual() {
//		FalsosAuto fi = new FalsosAuto("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
//		fi.avaliarManual();
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#open()}.
//	 */
//	@Test
//	public void testOpen() {
//		FalsosManual fi= new FalsosManual("","","","");
//		fi.open();
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#setRules_path(java.lang.String)}.
//	 */
//	@Test
//	public void testSetRules_path() {
//		FalsosManual fi= new FalsosManual("","","","");
//		fi.setRules_path("Files/rules.cf");
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildTable()}.
//	 */
//	@Test
//	public void testBuildTable() {
//		FalsosManual fi= new FalsosManual("","","","");
//		fi.buildTable();
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#main(java.lang.String[])}.
//	 */
//	@Test
//	public void testMain() {
//
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#transformIntoHashMap(double[])}.
//	 */
//	@Test
//	public void testTransformIntoHashMap() {
//		FalsosManual fg = new FalsosManual("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
//		ReadFile r = new ReadFile();
//		double[] pesos = r.pesosReader(10, 10);
//		fg.transformIntoHashMap(pesos);
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#evaluate(java.util.HashMap)}.
//	 */
//	@Test
//	public void testEvaluate() {
//		FalsosManual fi = new FalsosManual("", "", "Files/ham.log", "Files/spam.log");
//		ReadFile r = new ReadFile();
////		Mensagem msg = new Mensagem();
//		fi.setRules_path("Files/rules.cf");
//		double[] pesos= r.pesosReader(10, 10);
//		HashMap<String, Double> hm = fi.transformIntoHashMap(pesos);
////		fi.evaluate(hm);
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#getPesoFinalMensagem(java.util.HashMap, pt.iscte.es1.project.resources.msg.Mensagem)}.
//	 */
//	@Test
//	public void testGetPesoFinalMensagem() {
//		FalsosManual fi = new FalsosManual("", "Files/rules.cf", "", "");
//		Mensagem msg = new Mensagem();
//		msg.setRules(new ArrayList<String>());
//		ReadFile r = new ReadFile();
//		double[] pesos = r.pesosReader(10, 10);
//		HashMap<String, Double> map = fi.transformIntoHashMap(pesos);
//		fi.getPesoFinalMensagem(map, msg);
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarAutomatico()}.
//	 */
//	@Test
//	public void testAvaliarAutomatico() {
//		FalsosManual fi = new FalsosManual("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
//		fi.avaliarAutomatico();
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#configureAlgorithmList(java.util.List)}.
//	 */
//	@Test
//	public void testConfigureAlgorithmList() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
//	 */
//	@Test
//	public void testEquals() {
//		fail("Not yet implemented");
//	}

}
