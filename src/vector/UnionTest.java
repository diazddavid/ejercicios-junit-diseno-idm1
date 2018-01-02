package vector;

import static org.junit.Assert.assertEquals;
import java.util.Vector;
import org.junit.Test;

public class UnionTest {
	@Test public void elementsInA()
	   {
	      Vector a = new Vector(3);
	      a.addElement(5);
	      a.addElement(6);
	      Vector b = new Vector(3);
	      
	      assertEquals("Vector has the same size", a.size() + b.size() ,Union.union(a, b).size());
	      assertEquals("Vector has the same capacity", a.capacity() + b.capacity() ,Union.union(a, b).capacity());
	      assertEquals("Union contains 5", Union.union(a, b).contains(5));
	      assertEquals("Union contains 6", Union.union(a, b).contains(6));
	   }
}
