import java.io.*;
/**
 * @author Alison Juliana López C.
 *
 */
 
public class PrimeNumber {

	public static void main(String[] args) {
		try {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n = Integer.parseInt(br.readLine());
		int cont = 0;
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j<= i; j++) 
			{
				if (i%j == 0) {
					cont ++;
				}
			}		
			if (cont == 2)
			{
				bw.write(i+ " ");
			}
			cont = 0;	
		}
		bw.flush();
		}
		catch (Exception ex ) {}

	}

}
