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
import pt.iscte.es1.project.resources.msg.Mensagem;
import pt.iscte.es1.project.utils.ReadFile;

/**
 * @author Beatriz
 *
 */
public class FalsosAutoTester {

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

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#FalsosGUI()}.
	 */
	@Test
	public void testFalsosGUI() {
		
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
		FalsosAuto fa = new FalsosAuto("", "", "", "");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#guardarResultados()}.
	 */
	@Test
	public void testGuardarResultados() {
		FalsosGUI fg= new FalsosGUI("", "Files/rules.cf", "", "");
		fg.guardarResultados();
		
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarManual()}.
	 */
	@Test
	public void testAvaliarManual() {
		FalsosGUI fg = new FalsosGUI("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
		fg.avaliarManual();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#open()}.
	 */
	@Test
	public void testOpen() {
	
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#setRules_path(java.lang.String)}.
	 */
	@Test
	public void testSetRules_path() {  //A funcao e chamada  no contrutor e fica logo testada
//		FalsosGUI falsosGui= new FalsosGUI();
//		String rules_path= "Files/rules.cf";
//		falsosGui.setRules_path(rules_path);
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#buildTable()}.
	 */
	@Test
	public void testBuildTable() { //cena gr�fica
//		FalsosGUI fg= new FalsosGUI();
//		fg.buildTable();
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
		FalsosGUI fg = new FalsosGUI("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
		ReadFile r = new ReadFile();
		double[] pesos = r.pesosReader(0, 10);
		fg.transformIntoHashMap(pesos);
	}

//	/**
//	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#evaluate(java.util.HashMap)}.
//	 */
//	@Test
//	public void testEvaluate() {
//		FalsosGUI fg= new FalsosGUI("", "", "Files/ham.log", "Files/spam.log");
//		ReadFile r = new ReadFile();
//		Mensagem msg = new Mensagem();
//		double[] pesos= r.pesosReader(2.0, 10);
//		HashMap<String, Double> hm = fg.transformIntoHashMap(pesos);
//		fg.getPesoFinalMensagem(hm, msg);
//	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#getPesoFinalMensagem(java.util.HashMap, pt.iscte.es1.project.resources.msg.Mensagem)}.
	 */
	@Test
	public void testGetPesoFinalMensagem() {
		FalsosAuto fa = new FalsosAuto("", "Files/rules.cf", "", "");
		Mensagem msg = new Mensagem();
		ReadFile r = new ReadFile();
//		fa.setRules_path("Files/rules.cf");
		HashMap<String, Double> hmp = fa.transformIntoHashMap(r.pesosReader(2.0, 10));
		fa.getPesoFinalMensagem(hmp, msg);
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.gui.FalsosGUI#avaliarAutomatico()}.
	 */
	@Test
	public void testAvaliarAutomatico() {
		FalsosGUI fg = new FalsosGUI("", "Files/rules.cf", "Files/ham.log", "Files/spam.log");
		fg.avaliarAutomatico();
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
