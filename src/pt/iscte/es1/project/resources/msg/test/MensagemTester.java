/**
 * 
 */
package pt.iscte.es1.project.resources.msg.test;

import static org.junit.Assert.*;

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
public class MensagemTester {

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
	 * Test method for {@link pt.iscte.es1.project.resources.msg.Mensagem#Mensagem()}.
	 */
	@Test
	public void testMensagem() {
		Mensagem msg = new Mensagem();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.resources.msg.Mensagem#getId()}.
	 */
	@Test
	public void testGetId() {
		Mensagem msg = new Mensagem();
		msg.getId();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.resources.msg.Mensagem#setId(java.lang.String)}.
	 */
	@Test
	public void testSetId() {
		Mensagem msg = new Mensagem();
		String id = "31";
		msg.setId(id);
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.resources.msg.Mensagem#getRules()}.
	 */
	@Test
	public void testGetRules() {
		Mensagem msg = new Mensagem();
		ArrayList<String> r = msg.getRules();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.resources.msg.Mensagem#setRules(java.util.ArrayList)}.
	 */
	@Test
	public void testSetRules() {
		Mensagem msg = new Mensagem();
		ReadFile r = new ReadFile();
		ArrayList <String> rules = ReadFile.rulesReader("Files/rules.cf");
		msg.setRules(rules);
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.resources.msg.Mensagem#getSpam()}.
	 */
	@Test
	public void testGetSpam() {
		Mensagem msg = new Mensagem();
		Boolean b = msg.getSpam();
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.resources.msg.Mensagem#setSpam(java.lang.Boolean)}.
	 */
	@Test
	public void testSetSpam() {
		Mensagem msg = new Mensagem();
		msg.setSpam(true);
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	public void testEquals() {
		new Mensagem().equals(Mensagem.class);
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	public void testToString() {
		new Mensagem().toString();
	}

}
