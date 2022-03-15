package pack;
import java.util.Scanner;

public class Pass_or_Fail {
	

	public static void main(String[] args) {
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER YOUR MARKS");
		marks=s.nextInt();
		
		String result=marks >=40 ?"PASS" : "FAIL";
		System.out.println(result);
		
		// 

	}

}
