package tarea4_palindromos;

/**
 *
 * @author Pl_Hm
 */
public class Propuesta2_AlgoritmoPalindromoHrs {
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
        String[] Horas = new  String[1440]; // t(n) =1    S(n)=1  
        int contador = 0; // t(n) =1    S(n)=1  
        
        
        for (int i=0; i<24; i++){  // t(n) =7nm    S(n)=2  
            for (int j=0; j<60; j++){
                
                Horas[contador]= formato(i,j); // t(n) =6    S(n)=2   
                contador ++; // t(n) =1    S(n)=0
            }
        }
        
        for (int i=0; i<1440; i++){  // t(n)=3n    S(n)=1 
            numEjec = numEjec + comparar(Horas[i]); // t(n) =3    S(n)=1  
        }
        
        System.out.println("Conteo total: " + numEjec); // t(n) =1    S(n)=0   
    }
    
    // TOTAL t(n)= 6+7mn+3n     S(n)= 8 
    // BIG O... t(n)= mn -> Lineal    S(n)= S(c)
    
    
    
    
    
    public static String formato (int hr, int min){ // t(n) =5    S(n)=2    
        
            if ((hr < 10) & (min < 10)){ // t(n) =1    S(n)=0   
                return ("0"+hr+":"+"0"+min);
            }    
            
            if ((hr < 10) & (min > 10)){ // t(n) =1    S(n)=0   
                return ("0"+hr+":"+min);
            } 
            
            if ((hr > 10) & (min < 10)){ // t(n) =1    S(n)=0   
                return (hr+":"+"0"+min);
            } 
            
            if ((hr > 10) & (min > 10)){ // t(n) =1    S(n)=0   
                return (hr+":"+min);
            } 
            else{
                return ("Error"); // t(n) =1    S(n)=0   
            }
           
        }
    
    
    
    public static int comparar (String hora){ // t(n) =2    S(n)=1   
            if ( (hora.charAt(0) == hora.charAt(3)) && (hora.charAt(1) == hora.charAt(2)) ) { // t(n) =1    S(n)=0   
                System.out.println(hora);
                return 1;
            }
            else{
                return 0;
            } 
        }
    
   
}
