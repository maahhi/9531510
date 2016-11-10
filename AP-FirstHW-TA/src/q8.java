import java.util.Scanner;

public class q8 {
	public static void main(String args[]){
		try{
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		s.close();
		Double i = new Double(0.1); 
		Double j = new Double(1);
		int out = 0 ,x= 0,y=0;
		int a = 0 ;
		do{
			
			i*=100;
			j*=100;

			x = in% (i.intValue());
			y = in% (j.intValue());
			x = x/(i.intValue()/10);
			y = y/(j.intValue()/10);
			//System.out.println("i"+i + "j"+j);
			if(in<i){
				out += x*(j.intValue()/100);
				break;}
			
			out += x*(j.intValue() /10) + y*(i.intValue() /10);
			//System.out.println("w:"+a + "x:"+x + "y:"+y + "out:"+out );
			a++;
		}while(in>j);
		
		System.out.println(out);
		}catch(Exception e){
			System.out.println("asda");
		}
		

	}

}
