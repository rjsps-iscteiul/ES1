/**
 * 
 */
package pt.iscte.es1.project.utils.test;

import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pt.iscte.es1.project.utils.SearchFile;

/**
 * @author Beatriz
 *
 */
public class SearchFileTester {

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
	 * Test method for {@link pt.iscte.es1.project.utils.SearchFile#SearchFile()}.
	 */
	@Test
	public void testSearchFile() {
		SearchFile sf = new SearchFile();
		
	}

	/**
	 * Test method for {@link pt.iscte.es1.project.utils.SearchFile#getLink()}.
	 */
	@Test
	public void testGetLink() {
		SearchFile sf = new SearchFile();
		JTextField jtf= sf.getLink();
	}

}
