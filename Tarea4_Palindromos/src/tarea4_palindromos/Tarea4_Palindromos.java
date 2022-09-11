package tarea4_palindromos;

/**
 * @author Pl_Hm
 */
public class Tarea4_Palindromos {

    /**
     * Se desea encontrar todos los palíndromos que existen en la franja horaria de un día completo. 
       Deberán tomar como horario inicial las 00:00hrs y como horario final las 23:59hrs.
       El algoritmo debe mostrar en pantalla todos los palíndromos existentes en ese rango, al final debe mostrar el conteo 
       total de palíndromos existentes y también deberán entregar capturas de pantalla de la ejecución.
     */
    
    public static void main(String[] args) {
        int hora = 0; // t(n) =1    S(n)=1   
        int minuto = 0; // t(n) =1    S(n)=1   
        int numEjec = 0; // t(n) =1    S(n)=1   
        
        for (int i=0; i<24; i++){  // t(n)=6mn    S(n)=4  
            for (int j=0; j<60; j++){
                hora = i;
                minuto = j;
                numEjec = numEjec + comparar(hora,minuto); // t(n) =4    S(n)=2   
            }
        }
        System.out.println("Conteo total: " + numEjec); // t(n) =1    S(n)=0   
    }
    
    // TOTAL t(n)= 4+6mn     S(n)= 7 
    // BIG O... t(n)= mn -> Lineal    S(n)= S(c)
    
    
    
    public static int comparar (int hr, int min){ // t(n) =4    S(n)=2   
            String hora, minuto; // t(n) =1    S(n)=2   
        
            if (hr < 10){ // t(n) =1    S(n)=0   
                hora = "0" + String.valueOf(hr);
            }
            else{
                hora = String.valueOf(hr);
            }
            
            
            
            if (min < 10){ // t(n) =1    S(n)=0   
                minuto = "0" + String.valueOf(min);
            }
            else{
                minuto = String.valueOf(min);
            }
            
            
            
        
            if ( (hora.charAt(0) == minuto.charAt(1)) && (hora.charAt(1) == minuto.charAt(0)) ) { // t(n) =1    S(n)=0   
                System.out.println(hora + ":" + minuto);
                return 1;
            }
            else{
                return 0;
            } 
        }
    
}
  