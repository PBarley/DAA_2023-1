package tarea5_ordenamientoporselección;

/**
 * @author Pl_Hm
 */
public class Tarea5_OrdenamientoPorSelección {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dato = {23,12,8,7,1,4,3,2,11};
        
        System.out.println("Arreglo:");
        for (int i = 0; i < dato.length; i++)
        {
            System.out.print(dato[i] + ", ");
        }
         
        seleccion(dato);
        System.out.println("\nArreglo ordenado por seleccion:");
        for (int i = 0; i < dato.length; i++)
        {
            System.out.print(dato[i] + ", ");
        }
    }
    
    public static void seleccion (int[] arr)
    {
        int pivote = 0;
        int temp = 0;
        int aux = 0;
        int min = 0;
        
        for(pivote = 0; pivote < arr.length; pivote++)
        {
            min = pivote;
            for(aux = pivote+1;aux < arr.length; aux++)
            {
                if(arr[aux] < arr[min]){
                    min = aux;
                }
            }
            
            temp = arr[pivote];
            arr[pivote] = arr[min];
            arr[min] = temp;
        }
    }
}
