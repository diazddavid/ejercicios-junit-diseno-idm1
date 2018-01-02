package vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Vector;
import org.junit.Test;

public class UnionTest {
	@Test public void elementsInOne()
	   {
	      Vector a = new Vector(3);
	      a.addElement(5);
	      a.addElement(6);
	      Vector b = new Vector(3);
	      int unionSize = a.size()+b.size();
	      
	      assertEquals("Vector has the same size", unionSize, Union.union(a, b).size());
	      assertTrue("Union contains 5",Union.union(a, b).contains(5)); 
	      assertTrue("Union contains 6",Union.union(a, b).contains(6));
	   }
}
