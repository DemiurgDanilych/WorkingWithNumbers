import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
		Iterator<Integer> it = intList.iterator();
		while(it.hasNext()){
			int nextValue = it.next();
			if (nextValue <= 0 || (nextValue % 2) !=0 ){
				it.remove();
			}
		}
		Collections.sort(intList);
		System.out.println(intList);
	}
}
