import java.io.*;

/**
 * @author Alison Juliana López C.
 *
 */
 
public class Birthday {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			int T= Integer.parseInt(br.readLine());
			int N, M;
			String line;
			for (int i = 0; i< T; i++)
			{
			    line = br.readLine();
			    String datos[] = line.split(" ");
			    N = Integer.parseInt(datos[0]);
			    M = Integer.parseInt(datos[1]);
			    if ( M % N==0){
			        bw.write("Yes" + "\n");
			    }
			    else{
			        bw.write("No" + "\n");
			    }
			}
			bw.flush();
			
					
		}
		catch (Exception ex ) {}
 
	}
 
}
