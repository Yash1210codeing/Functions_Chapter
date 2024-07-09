package Functions_Chapter;
public class Paramitries_Return_Type_Void_Function_Call_Set_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int a = 10;
		int b = 20;
		int c = a + b;
		add();     // Function Call
		System.out.println(c);
	}
	// Call Function Make
	public static void add() {
		int a = 30;
		int b = 20;
		int c = a + b;
		sub();       // Function Call
		System.out.println(c);
	}
	//Call Make Function
	public static void sub() {
		int a = 50;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}
}

