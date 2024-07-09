package Functions_Chapter;
public class Int_Return_Type_Function_Value_Return_Set_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
        int a=5;
        int b=10;
        int ans=add(a,b);  // Function Call
        System.out.println(ans);     // Print
	}
	public static int add(int a,int b) {
		int c=a+b;
		System.out.println(sub(c,a));
		return c;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
 }

