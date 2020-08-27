package assignment_4;

public class Set {
	LinkedNode front;
	int count;

	// Constructor
	Set(){
		front = null;
		count = 0;
	}
	
	// Exists method
	Boolean exists(int x) {
		
		LinkedNode tempNode = front;
		while (tempNode != null) {
			if ( x == tempNode.x) {
				return true;
			}
			tempNode = tempNode.next;
		}
		
		return false;
	}
	
	// Add operation
	void add(int x) {
		
		// Do nothing if already in set
		if (this.exists(x)) {
			return;
		}
		
		// Add to front
		LinkedNode newNode = new LinkedNode();
		newNode.next = front;
		newNode.x = x;
		front = newNode;
	}
	
	// Deletion operation
	void del(int x) {
		LinkedNode tempNode = front;
		
		if (tempNode.x == x) {
			front = tempNode.next;
			return;
		}
		
		while (tempNode.next != null) {
			if (tempNode.next.x == x) {
				tempNode.next = tempNode.next.next;
				return;
			}
			tempNode = tempNode.next;
		}
	}
	
	// String conversion
	public String toString() {
		String string = "" + front.x;
		LinkedNode tempNode = front.next;
		
		while (tempNode!=null) {
			string += " " + tempNode.x;
			tempNode = tempNode.next;
		}
		
		return string;
	}


}
