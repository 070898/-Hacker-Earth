import  java.io.* ;
/**
 * Programa que imprime el valor ASCII de un caracter
 */
 
/**
 * @author Alison Juliana López C.
 *
 */
public class  Ascii{
	 
	public  static  void  main ( String [] args ) {
		
		
		try {
			BufferedWriter bw =  new BufferedWriter ( new  OutputStreamWriter ( System.out));
			BufferedReader br =  new  BufferedReader ( new  InputStreamReader ( System.in));
			char let = ( char ) br.read();
			System.out.println (( int ) let);
		}
		catch(Exception ex){}
 
	}
 
}
