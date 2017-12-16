/**
 * 
 */
package pt.iscte.es1.project.utils.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pt.iscte.es1.project.resources.msg.Mensagem;
import pt.iscte.es1.project.utils.ReadFile;

/**
 * @author Beatriz
 *
 */
public class ReadFileTester {

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
	 * Test method for {@link pt.iscte.es1.project.utils.ReadFile#rulesReader(java.lang.String)}.
	 */
	@Test
	public final void testRulesReader() {
		ReadFile r = new ReadFile();
		ArrayList <String> rules = ReadFile.rulesReader("Files/rules.cf");
		rules.isEmpty();
		ArrayList <String> rules2 = ReadFile.rulesReader("Files/rules2.cf");
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.utils.ReadFile#messageReader(java.lang.String)}.
	 */
	@Test
	public void testMessageReader() {
		ReadFile r = new ReadFile();
		ArrayList<Mensagem> messages=r.messageReader("Files/ham.log");
		messages.isEmpty();
		ArrayList<Mensagem> messages2=r.messageReader("Files/ham2.log");
		
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.utils.ReadFile#fpfnReader()}.
	 */
	@Test
	public void testFpfnReader() {
		ReadFile r = new ReadFile();
		double[] fpfn= r.fpfnReader();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.utils.ReadFile#pesosReader(double, int)}.
	 */
	@Test
	public void testPesosReader() {
		ReadFile.pesosReader(10, 10);
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.utils.ReadFile#guardarConfig(java.util.ArrayList, double[])}.
	 */
	@Test
	public void testGuardarConfig() {
//		ReadFile r = new ReadFile();
//		ArrayList<String> rules = ReadFile.rulesReader("Files/rules.cf");	
		double[] pesos = ReadFile.pesosReader(10, 10);
		ReadFile.guardarConfig(new ArrayList<String>(), pesos);
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	public void testEquals() {
		ReadFile f = new ReadFile();
		f.equals(ReadFile.class);
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	public void testToString() {
		ReadFile f = new ReadFile();
		f.toString();
	}

}
