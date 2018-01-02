package vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
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
	
	@Test public void elementsInBoth()
	   {
	      Vector a = new Vector(3);
	      a.addElement(5);
	      Vector b = new Vector(3);
	      b.addElement(6);
	      int unionSize = a.size()+b.size();
	      
	      assertEquals("Vector has the same size", unionSize, Union.union(a, b).size());
	      assertTrue("Union contains 5",Union.union(a, b).contains(5)); 
	      assertTrue("Union contains 6",Union.union(a, b).contains(6));
	   }
	
	@Test public void unionSetElementInOne() {
		Set a = new HashSet();
		a.add("Prueba1");
		a.add("Prueba2");
		Set b = new HashSet();
		int unionSize = a.size()+b.size();
		
	    assertTrue("Union contains Prueba1",Union.unionSet(a, b).contains("Prueba1")); 
	    assertTrue("Union contains Prueba2",Union.unionSet(a, b).contains("Prueba2"));
	}
	
	@Test public void unionSetRepeated() {
		Set a = new HashSet();
		a.add("Prueba1");
		Set b = new HashSet();
		b.add("Prueba1");
		b.add("Prueba2");
		int unionSize = a.size()+b.size();

		assertEquals("Each element appear once", 1, Collections.frequency(Union.unionSet(a, b), "Prueba1"));
		assertEquals("Each element appear once", 1, Collections.frequency(Union.unionSet(a, b), "Prueba2"));
	}
}
