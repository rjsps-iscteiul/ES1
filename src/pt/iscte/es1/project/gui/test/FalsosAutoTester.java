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
public class FalsosAutoTester extends FalsosGUITester{

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
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosAuto#FalsosAuto(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testFalsosAuto() {
		String title= "";
		
		String ham_path= "Files/ham.log";
		String spam_path= "Files/spam.log";
		String rules_path= "Files/rules.cf";
		FalsosAuto falsosAuto= new FalsosAuto(title,rules_path,ham_path,spam_path);
	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI()}.
//	 */
//	@Test
//	public void testFalsosGUI() {
//		FalsosAuto fg = new FalsosAuto("", "", "", "");
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
//	 */
//	@Test
//	public void testFalsosGUIStringStringStringString() {
//		FalsosAuto fg = new FalsosAuto("", "", "", "");
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildGUI()}.
//	 */
//	@Test
//	public void testBuildGUI() {
//		FalsosAuto fg = new FalsosAuto("", "", "", "");
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#guardarResultados()}.
//	 */
//	@Test
//	public void testGuardarResultados() {
//		FalsosAuto fg= new FalsosAuto("", "Files/rules.cf", "", "");
//		fg.guardarResultados();
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarManual()}.
//	 */
//	@Test
//	public void testAvaliarManual() {
//		FalsosAuto fg = new FalsosAuto("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
//		fg.avaliarManual();
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#open()}.
//	 */
//	@Test
//	public void testOpen() {
//		FalsosManual fg= new FalsosManual("","","","");
//		fg.open();
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#setRules_path(java.lang.String)}.
//	 */
//	@Test
//	public void testSetRules_path() {  //A funcao e chamada  no contrutor e fica logo testada
//		FalsosAuto fg = new FalsosAuto("","","","");
//		fg.setRules_path("Files/rules.cf");
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildTable()}.
//	 */
//	@Test
//	public void testBuildTable() { //cena gráfica
//		FalsosAuto fg= new FalsosAuto("", "", "", "");
//		fg.buildTable();
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
//		FalsosAuto fg = new FalsosAuto("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
//		ReadFile r = new ReadFile();
//		double[] pesos = r.pesosReader(0, 10);
//		fg.transformIntoHashMap(pesos);
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#evaluate(java.util.HashMap)}.
//	 */
//	@Test
//	public void testEvaluate() {
//		FalsosAuto fg = new FalsosAuto("", "", "Files/ham.log", "Files/spam.log");
//		ReadFile r = new ReadFile();
//		Mensagem msg = new Mensagem();
//		fg.setRules_path("Files/rules.cf");
//		double[] pesos= r.pesosReader(2.0, 10);
//		HashMap<String, Double> hm = fg.transformIntoHashMap(pesos);
//		fg.evaluate(hm);
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#getPesoFinalMensagem(java.util.HashMap, pt.iscte.es1.project.resources.msg.Mensagem)}.
//	 */
//	@Test
//	public void testGetPesoFinalMensagem() {
//		FalsosAuto fa = new FalsosAuto("", "Files/rules.cf", "", "");
//		Mensagem msg = new Mensagem();
//		ReadFile r = new ReadFile();
////		fa.setRules_path("Files/rules.cf");
//		HashMap<String, Double> hmp = fa.transformIntoHashMap(r.pesosReader(2.0, 10));
//		fa.getPesoFinalMensagem(hmp, msg);
//	}
//
//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarAutomatico()}.
//	 */
//	@Test
//	public void testAvaliarAutomatico() {
//		FalsosAuto fg = new FalsosAuto("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
//		fg.avaliarAutomatico();
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
