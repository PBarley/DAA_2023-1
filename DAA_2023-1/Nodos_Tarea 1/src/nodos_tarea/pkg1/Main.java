package nodos_tarea.pkg1;

/*
 * @author Pl_Hm
 */
public class Main {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolB tarea1 = new ArbolB();
        
        tarea1.InsertarDato(20);
        tarea1.InsertarDato(19);
        tarea1.InsertarDato(23);
        tarea1.InsertarDato(57);
        tarea1.InsertarDato(67);
        tarea1.InsertarDato(99);
        
        tarea1.head(99);
        tarea1.head(57);
        tarea1.head(5);
    }
    
}
