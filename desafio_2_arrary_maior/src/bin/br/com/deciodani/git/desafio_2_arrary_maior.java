package bin.br.com.deciodani.git;
import java.util.*;

public class desafio_2_arrary_maior {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	//TODO: Complete os espa�os em branco com uma poss�vel solu��o para o desafio
	    List<Integer> numeros = new ArrayList<>();
	    for(int i = 0; i < 5; i++){
	      // System.out.println(  i        );
	      int numero = scan.nextInt();
	      numeros.add(numero);
	    }
	    
	   	    

	    Integer maxlist = Collections.max(numeros);
	    System.out.println( maxlist );  
	    int position = numeros.indexOf(maxlist) +1;
	    System.out.println(  position         );
	  }
	
	
	

}
