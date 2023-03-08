package datastruct;

public class ListManipulator {

	public static void main(String[] args) {
		UnsortedList<Integer> list = MyUnsortedList.of(4);

		list.append(6);
		System.out.println(list.toString());
	}

}
