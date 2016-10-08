package Paquetes;

/*
* 
* @author 
* @param <T> 
*/

@SuppressWarnings({"unchecked"})
public class GenericList<T> {
	

	private GenericNode<T> head;
	private GenericNode<T> tail;
   
   /**
    * 
    */
   	public GenericList(){      
   		head = tail = null;
   }
   
   /**
    * 
    * @return 
    */
   	public boolean isEmpty(){
   		return head == null;        
   	}
   
   /**
    * 
    * @param pElemento 
    */
   public void insertarAlFrente(T pElemento) {
       if(isEmpty()) {
           head = tail
             = new GenericNode<T>(pElemento);
       }
       else {
           GenericNode<T> nodo = new GenericNode<T>(pElemento, head);//tengo una referencia al head
           head = nodo;          
       }
   }
   
   /**
    * 
    * @param elemento 
    */
   public void insertarAlFinal(T elemento) {
       if (isEmpty()) {
           head = tail = new GenericNode<T>(elemento);
       }
       else {
           GenericNode<T> nodo = new GenericNode<T>(elemento);
           tail.setNext(nodo);
           tail = tail.getNext();
       }
   }
   
   public Object eliminarDelFrente() throws Exception {
       if (isEmpty()) {
           throw new Exception("No hay elementos en la lista");
       }
       else {
           Object elemento = head.getDato();
           if (head == tail) {
               head = tail = null;
           }
           else {
               head = head.getNext();
           }
           return elemento;
       }
   }
   
   public Object eliminarDelFinal() throws Exception {
       if (isEmpty()) {
           throw new Exception("No hay elementos en la lista");
       }
       else {
           Object elemento = tail.getDato();
           if (head == tail) {
               head = tail = null;
           }
           else {
               GenericNode<T> actual = head, temporal;
               while (actual.getNext() != tail) {
                   temporal = actual.getNext();
                   actual.setNext(temporal);
                   //actual.setSiguienteNodo(actual.getSiguienteNodo());
               }
               tail = actual;
               actual.setNext(null);
           }
           return elemento;
       } 
   }
   
   public int search(){
	   int last = 0;
	   if (head!=null){
	    GenericNode<T> temp = head;
	    while (temp != null){
	    	if (temp.getNext() == null){
	    		last = (int) temp.getDato();
	    		break;
	    	}
	    	temp = temp.getNext();
	    }
	    	
	   	}
	return last;
	}
   
   /**
    * 
    */
   public void imprimir() {
       if (isEmpty()) {
           System.out.println("La lista esta vacia");
       }
       else {
           GenericNode<T> actual = head;
           while (actual != null) {
               System.out.println(actual.getDato());
               actual = actual.getNext();
           }
       }  
       System.out.println("");
   }

   public GenericNode<T> getHead() {
       return head;
   }
   
   public GenericNode<T> getTail() {
       return tail;
   }
   
}