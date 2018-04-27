import java.io.*;

public class DnaPride {
    public static String output (String line){
    	String num = ""; 
        for (int i= 0; i< line.length(); i++){
             if (line.charAt(i) != 'A' && line.charAt(i) != 'C' && line.charAt(i) != 'G' && line.charAt(i) != 'T'){
                return "¡Se encontraron nucleobases de RNA erróneos!";
             }
            else{
                if (line.charAt(i) == 'A') 
                	num = num + "T" ;
                
                if (line.charAt(i) == 'G') 
                    num = num + "C" ;
                
                if (line.charAt(i) == 'T') 
                    num = num + "A" ;
                
                if (line.charAt(i) == 'C') 
                    num = num + "G" ;
            }
        }
        return num;
       
    }
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			int cases= Integer.parseInt(br.readLine());
			int n;
			String line;
			for (int i = 0; i< cases; i++){
			    n= Integer.parseInt(br.readLine());
			    line = br.readLine();
			    bw.write(output(line)+ "\n");
			}
			bw.flush();
		}
		catch (Exception ex ) {}

	}

}
