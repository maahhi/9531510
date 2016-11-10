
import java.io.*;
public class q9 {
	public static void main(String[] args){
		try{
			String path= "t.txt";
			File f = new File(path);
		    PrintWriter writer = new PrintWriter(f);
		    writer.println("Testing,");
		    writer.println("1, 2, 3.");
		    writer.println("This is my output file.");
		    writer.close();
		}catch(Exception e )
		{
			
		}
		
	}
}


