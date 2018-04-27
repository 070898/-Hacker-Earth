import java.io.*;
 
public class Capicua{
	public String capicua(String num) {
		if (num.length()==1) {
		return num;
		}
		else {
			return capicua (num.substring(1, num.length()))+ num.charAt(0);
		}
	}
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			Capicua numCap = new Capicua();
			int cases= Integer.parseInt(br.readLine());
			String n;
			for (int i=0; i<cases; i++) {
				n= br.readLine();
				
				if (numCap.capicua(n).equals(n)) {
					bw.write("YES" + "\n");
				}
				else {
					bw.write("NO"+ "\n");
				}
			}
			bw.flush();
			
		}
		catch (Exception ex ) {}
 
	}
 
}
