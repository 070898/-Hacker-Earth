import java.io.*;

/**
 * @author Alison Juliana López C.
 *
 */
 
public class Palindromic {
	
	public String palin(String s) 
	{
		if (s.length()==1) {
			return s;
		}
		else {
			return palin (s.substring(1, s.length())) + s.charAt(0) ;
		}
		
	}
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			Palindromic prueba = new Palindromic();
			String s = br.readLine();
			if (prueba.palin(s).equals(s)) 
			{
				bw.write("SI");
			}
			else {
				bw.write("NO");
			}
			bw.flush();
		}
		catch (Exception ex ) {}
 
	}
 
}
