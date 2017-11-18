/**
 * 
 */
package pt.iscte.es1.project.utils.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pt.iscte.es1.project.utils.ReadFile;

/**
 * @author ruijs
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

}
