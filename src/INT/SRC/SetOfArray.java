package INT.SRC;
import java.util.HashSet;
import java.util.Set;

public class SetOfArray {

	public static void main(String[] args) {
		Set<Integer>IntegerSet = new HashSet<>();
		IntegerSet.add(30);
		IntegerSet.add(40);
		IntegerSet.add(10);
		IntegerSet.add(20);
		IntegerSet.add(20);
		IntegerSet.add(30);
		
		System.out.print("Set of Integer :"+IntegerSet);

	}

}
