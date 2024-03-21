package Collections;
import java.util.ArrayList;
public class Collection1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		System.out.println(a);
		a.add(10);
		a.add(15.5);
		a.add(null);
		a.add('c');
		a.add("Sheela");
		a.add(10);
		a.add(15.5);
		a.add(false);
		a.add(null);
		a.add("Sheela");
		System.out.println("List: "+a);
		System.out.println("No. of elements: "+a.size());

	}

}
