package vector;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Union {
	/**
	* @return New object (different from a and b) of class Vector that
	contains the union set (NO elements can be repeated) of a and b
	* @param a Vector containing elements, including null. It is not a set, so it can have repeated elements, and they can be of different classes / types
	* @param b Vector containing elements, including null. It is not a set,	so it can have repeated elements, and they can be of different classes / types
	* @throws NullPointerException If a or b is null
	*/
	
	public static Vector union (Vector a, Vector b){
		
		Vector union = new Vector();
		for (Object Obj : a) {
			if(!union.contains(Obj)) {
				union.add(Obj);
			}
		}
		for (Object Obj : b) {
			if(!union.contains(Obj)) {
				union.add(Obj);
			}
		}
		union.setSize(a.size()+b.size());
		return union;
	}
	
	/**
	* @return
	New Set (different from a and b) that contains the
	*
	union set of a and b
	* @param
	a Set of elements. It can contain the null element. It can’t
	*
	contain repeated elements
	* @param
	b Set of elements. It can contain the null element. It can’t
	*
	contain repeated elements
	* @throws
	NullPointerException If a or b is null
	*/
	
	public static Set unionSet (Set a, Set b) {
		Set union = new HashSet();
		for (Object Obj : a) {
			if(!union.contains(Obj)) {
				union.add(Obj);
			}
		}
		for (Object Obj : b) {
			if(!union.contains(Obj)) {
				union.add(Obj);
			}
		}
		
		return union;
	}
	
	public static void main (String []argv) {
		
	}
}
