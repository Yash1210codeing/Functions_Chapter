package Functions_Chapter;
public class Paramitries_Return_Type_Void_Function_Variable_Content_Pass_set_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int a = 5;
		int b = 7;
		int i=5;
		int j=4;
		add(a, b); // Function Call
		add(5,7);
		add(i,a);
	}

	// Call Make Function
	public static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
}
