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
    
    public static void seleccion (int[] arr) //S(n)= 1       
    {
        int pivote = 0; //T(n)= 1   S(n)= 1
        int temp = 0;   //T(n)= 1   S(n)= 1
        int aux = 0;    //T(n)= 1   S(n)= 1
        int min = 0;    //T(n)= 1   S(n)= 1
        
        for(pivote = 0; pivote < arr.length; pivote++) //T(n)= 4n + 2n^2   S(n)= 0
        {
            min = pivote; //T(n)= 1   S(n)= 0
            for(aux = pivote+1;aux < arr.length; aux++) //T(n)= 2n   S(n)= 0
            {
                if(arr[aux] < arr[min]){ //T(n)= 1   S(n)= 0
                    min = aux;           //T(n)= 1   S(n)= 0
                }
            }
            
            temp = arr[pivote]; //T(n)= 1   S(n)= 0
            arr[pivote] = arr[min]; //T(n)= 1   S(n)= 0
            arr[min] = temp; //T(n)= 1   S(n)= 0
        }
    }
    // T(n) -> O(n)= n^2         S(n) -> O(n)= 5 = O(c)
}
