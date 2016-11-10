import java.util.Scanner;

//import java.util.Scanner;
public class q5 {
	public static void main(String[] args){
		Scanner ss = new Scanner(System.in);
		String line = ss.nextLine();
		ss.close();
		Scanner s = new Scanner(line);
		int i = 0 ;
		while(s.hasNext()){
			i++;
			s.next();
		}
		System.out.println(i);
		s.close();
	}
}
