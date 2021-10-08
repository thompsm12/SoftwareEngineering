import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LCATest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLCA() {
		//test on empty tree 
		LCA tree = new LCA();
		assertEquals("Check LCA for nodes not in tree", -1, tree.findLCA(4,5));
		
		//test on tree with 1 elem in it and the other missing
		tree = new LCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		assertEquals("Check LCA for tree with 1 elem in it and the other missing", -1, tree.findLCA(2,3));
		
		//test on tree with 1 elem in it and the other missing (other side)
		tree = new LCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		assertEquals("Check LCA for tree with 1 elem in it and the other missing", -1, tree.findLCA(4,3));
		
		//test for tree with both elems in the tree but no common ancestor
		tree = new LCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		assertEquals("Check LCA for tree with 2 elems in the tree ", 1, tree.findLCA(1,2));
		
		
		
		
		
        tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
 
		assertEquals("Check LCA for nodes 4 and 5", 2, tree.findLCA(4,5));
		assertEquals("Check LCA for nodes 4 and 6", 1, tree.findLCA(4,6));
		assertEquals("Check LCA for nodes 3 and 4", 1, tree.findLCA(3,4));
		assertEquals("Check LCA for nodes 2 and46", 2, tree.findLCA(2,4));
	}

}
