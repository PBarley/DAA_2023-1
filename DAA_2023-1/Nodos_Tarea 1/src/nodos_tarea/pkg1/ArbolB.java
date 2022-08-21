package nodos_tarea.pkg1;

/**
 *@author Pl_Hm
 */
public class ArbolB {
    
    
    //LA CLASE DE LOS NODOS
    public class Nodo {
        private int item;
        private int contador;
        private Nodo hijoIzq;
        private Nodo hijoDer;
    
        Nodo(int miDato)
        {
            hijoIzq=null;
            hijoDer=null;
            contador=1;
            item= miDato;
        }   
    }
    
    
    
    
    
    //LA CLASE DEL ARBOL B
    
   Nodo raiz;
   
   public ArbolB()
   {
       raiz=null;
   }
   
   
   
   public void InsertarDato(int miDato)
   {
       raiz= Insertar(raiz, miDato);
   }
   
   
   
   private Nodo Insertar(Nodo nodo, int miDato)
   {
       Nodo newNodo;
       
       if(nodo == null)
       {
           newNodo = new Nodo(miDato); 
                   
       }
       else
       {
           newNodo= nodo;
           
           if (nodo.item == miDato)
           {
               nodo.contador++;
           }
           else
           {
               if (nodo.item < miDato)
               {
                   nodo.hijoDer = Insertar(nodo.hijoDer, miDato);
               }
               else
               {
                   if (nodo.item > miDato)
                   {
                       nodo.hijoIzq = Insertar(nodo.hijoIzq, miDato);
                   }
               }
          
           }
           
       }
       
       return newNodo;
   }
   
   
   // MÉTODO PARA BUSCAR VALORES EN EL ÁRBOL
   public void head(int valorNodo)
   {
       Nodo nodoAux= raiz;
       while (nodoAux.item != valorNodo)
       {
           if(valorNodo < nodoAux.item)
           {
               nodoAux = nodoAux.hijoIzq;
           }
           else
           { 
               if(valorNodo > nodoAux.item)
                   nodoAux = nodoAux.hijoDer;
           }
           if(nodoAux == null)
                System.out.println("No existe");
       } 
       System.out.println(nodoAux.item);
   }
   
   
}
