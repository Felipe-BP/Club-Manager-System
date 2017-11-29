/**
 * @(#)Leitura.java
 *
 *
 * @author Felipe Bueno de Paula
 * @version 1.00 2017/10/10
 */
import java.io.*;

public class Leitura {
    public static String lerString() {
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader obj = new BufferedReader(isr);
    	String aux = "";
    	try {
    		aux = obj.readLine();
    	} catch(IOException e) {
    		System.out.println("Deu erro!!!");
    	}
    	return aux;
    }

    public static int lerInt() {
     	return Integer.parseInt(lerString());
    }

    public static float lerFloat() {
    	return Float.parseFloat(lerString());
    }

    public static double lerDouble() {
    	return Double.parseDouble(lerString());
    }

    public static char lerChar() {
    	String aux = "";
    	aux = lerString();
    	return aux.charAt(0);
    }

}