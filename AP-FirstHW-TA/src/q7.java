import java.util.Scanner;
public class q7 {
	public static int numUnique (int a , int b , int c){
		int i = 3;
		if (a==b)
			i--;
		if(a==c)
			i--;
		if(b==c)
			i--;
		if(a==b && a==c)
			i=1;
		return i ;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println( numUnique(a,b,c) );
		s.close();
	}

}
