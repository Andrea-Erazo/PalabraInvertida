
package uspg.edu.gt.palabrainvertida;

import java.util.Stack;


public class Palabra {
    
    private Stack<Character>pila = new Stack<Character>();
    
    
    public String invertir_palabra(String cadena){
        
        char letras[] = cadena.toCharArray();
        
        
        for(int i= 0;i<letras.length; i++)
        {
            pila.push(letras[i]);
            //System.out.println("Ingresando caracter"+letras[i]);
        }
        
        while(!pila.empty())
        {
            System.out.print(pila.pop());
        }
        
        
        return null;
        
    }
    
}
