import java.util.*;

class Task {
	static class Node {
		int coeff, power;
		Node next;
	};

	static Node addnode(Node start, int coeff, int power) {
		Node newnode = new Node();
		newnode.coeff = coeff;
		newnode.power = power;
		newnode.next = null;
		if (start == null)
			return newnode;
		Node ptr = start;
		while (ptr.next != null)
			ptr = ptr.next;
		ptr.next = newnode;

		return start;
	}

	static void printList(Node ptr) {
		if (ptr.next != null) {
			System.out.print(ptr.coeff + "x^" + ptr.power + " + ");
			ptr = ptr.next;
		} else {
			System.out.print(ptr.coeff + "xy^" + ptr.power + "");
		}

		while (ptr.next != null) {
			System.out.print(ptr.coeff + "y^" + ptr.power + " + ");

			ptr = ptr.next;
		}
		System.out.print(ptr.coeff + "\n");
	}

	static void removeDuplicates(Node start) {
		Node ptr1, ptr2, dup;
		ptr1 = start;

		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			while (ptr2.next != null) {

				if (ptr1.power == ptr2.next.power) {
					ptr1.coeff = ptr1.coeff + ptr2.next.coeff;
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;

				} else
					ptr2 = ptr2.next;

			}
			ptr1 = ptr1.next;
		}
	}

	static Node multiply(Node algebra1, Node algebra2,
			Node algebra3) {

		Node ptr1, ptr2;
		ptr1 = algebra1;
		ptr2 = algebra2;
		while (ptr1 != null) {
			while (ptr2 != null) {
				int coeff, power;
	coeff = ptr1.coeff * ptr2.coeff;
				power = ptr1.power + ptr2.power;
				algebra3 = addnode(algebra3, coeff, power);
				ptr2 = ptr2.next;
				// System.out.println("x^" + "y^");
			}
			ptr2 = algebra2;
			ptr1 = ptr1.next;
		}
		removeDuplicates(algebra3);
		return algebra3;
	}

	public static void main(String args[]) {
		Node algebra1 = null, algebra2 = null, algebra3 = null;
		algebra1 = addnode(algebra1, 2, 1);
		algebra1 = addnode(algebra1, 1, 0);
		algebra2 = addnode(algebra2, 3, 1);
		algebra2 = addnode(algebra2, -5, 0);
		System.out.print("1st Algebric Expression: ");
		printList(algebra1);
		System.out.print("2nd Algebric Expression: ");
		printList(algebra2);
		algebra3 = multiply(algebra1, algebra2, algebra3);
		System.out.print("Two Algebric Expression are:");
		printList(algebra3);

	}
}
