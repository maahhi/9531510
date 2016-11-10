import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;

public class qq10 {
	public static void main (String args[]){
		try{
			System.out.println("enter exact directory of your file");
			String path = "C:/Users/maahhi/Desktop/f.txt";
			Scanner s= new Scanner( System.in );
			path=s.nextLine();
			s.close();
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr); 
		File t = new File("x.txt");
		FileWriter fw = new FileWriter(t);
		PrintWriter pw = new PrintWriter(fw);
		String line = null;
		String sline = null;
		while((line = br.readLine()) != null){
			//System.out.println(line);
      	  int i = 0;
      	  do{
      		int j = Math.min(line.length(),(60*(i+1)));
      		int k = i*60;
      		if(line.length()>0)
            sline = line.substring(k,j);
      		System.out.println(sline);
      		
            i++;
          pw.println(sline);
          }while(line.length()>60*i);
		}
		fw.close();
		pw.close();
		fr.close();
		br.close();
		
		//File x = new File("C:/Users/maahhi/Desktop/x.txt");
		FileReader frm = new FileReader(t);
		BufferedReader brm = new BufferedReader(frm);
		PrintWriter pwm = new PrintWriter(f);
		String l;
		while((l = brm.readLine()) != null){
			pwm.println(l);
		}
		pwm.close();
		brm.close();
		}catch(Exception e){
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
	}

}
