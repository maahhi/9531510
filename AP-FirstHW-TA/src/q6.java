import java.util.*;
public class q6 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.print("{");
		for(int i = a ; i!=b; i=i-( (a-b) /Math.abs(a-b) ) ){
			System.out.print(i);
			System.out.print(", ");
		}
		System.out.print(b);
		System.out.print("}");
		s.close();
	}
}
