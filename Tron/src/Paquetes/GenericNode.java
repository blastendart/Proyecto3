package Paquetes;

/*
* Clase para nodos genéricos
* 
* @param <T> tipo de dato del elemento
*/

@SuppressWarnings("rawtypes")
public class GenericNode<T> {
   private GenericNode _next;
   private T _dato;
   
   public GenericNode (T pDato){
       _next = null;
       _dato = pDato;
   }
   
   public GenericNode (T pDato, GenericNode pNode){
       this._dato = pDato;
       this._next = pNode;
   }

   /**
    * Devuelve el nodo siguiente
    * @return _next
    */
   public GenericNode getNext() {
       return _next;
   }

   /**
    * Configura _next
    * @param pNext nodo generico
    */
   public void setNext(GenericNode pNext) {
       this._next = pNext;
   }

   /**
    * Devuelve el dato del nodo
    * @return T el dato del nodo
    */
   public T getDato() {
       return _dato;
   }

   /**
    * 
    * @param pDato 
    */
   public void setDato(T pDato) {
       this._dato = pDato;
   }

   
}