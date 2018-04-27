import java.io.*;

 
class Ocurrence {
    public static String ocurrence (String line) {
    	String occ = ""; 
        int cont =0;
        for (int i = 0; i<line.length(); i++){ //Para recorrer string 
            if (line.substring(i,i+1).equals(line.substring(i+1, i+2))) //No hay secuencia si la primera y segunda letra son iguales.
            	continue; //continua el ciclo.
            else { //Hay secuencia cuando se no se cumple lo anterior.
                for(int j= i+1; j< line.length(); j++){ 
	
                    if (line.substring(i, i+1).equals((line.substring(j, j+1)))) //Cuando se encuentra la primera letra no hay secuencia.
                        break; //Se rompe el ciclo.
                    else //Hay secuencia si no se cumple lo anterior y se va sumando el contador.
                        cont++;
                }
                if (cont >0) {//Si el contodor no es cero, hubo secuncia.
                	occ = line.substring(i, i+cont+1);//Se guarda el substring de la secuencia en una variable String.
                    break; //Se rompe el ciclo cuando se encontró secuencia.
                }
            }
        }
        
        return oc2(occ); //Se retorna el substring de la secuencia.
    }
    /**
     * Reemplazar carácteres repetidos en la ocurrencia.
     * @param line = Ocurrencia encontrada.
     * @return = Ocurrencia sin repeticiones.
     */
    public static String oc2 (String line ) {
    	String repl = "";
    	for (int i = 0; i< line.length(); i++) {
    		if (line.contains(line.substring(i, i+1))){
    			repl = line.substring(i+1);
    			repl =repl.replace(line.substring(i, i+1), "");
    			line = line.substring(0, i+1) + repl;
    		}
    	}
    	if (repl.equals("")) 
    		return line;	
    	return line;
    }
    public static void main(String args[] ) throws Exception {
        try{
            BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
            BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
            int t = Integer.parseInt(br.readLine());
            String line;
            for (int i = 0; i< t; i++){
                line = br.readLine();
                bw.write(ocurrence(line)+"\n");
            }
            bw.flush();
        }
        catch (Exception ex){}
 
    }
}
