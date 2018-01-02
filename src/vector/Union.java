package vector;

import java.util.Collections;
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
		union.setSize(a.size()+b.size());
		Collections.copy(union, a);
		Collections.copy(union, b);
	
		
		return union;
	}

	public static void main (String []argv) {
		
	}
}
