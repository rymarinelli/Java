public class ArrayPair <T> implements PairInterface<T>{
   private T [] objects;
   
  /*
  @parm f and s of type T 
  */
   public ArrayPair(T f, T s){
      objects = (T[]) (new Object[2]);
      objects[0] = f;
      objects[1] = s;
   }
   
   /*
   @return returns the first element of an array
   */
   public T getFirst(){
     return objects[0];
   }
  
  /*
  @return returns the second element of an array
  */
	public T getSecond(){
      return objects[1];
    }
  
  /*
  @param takes f of Object class
  @return returns f, the second of the two objects
  */
  	public void setFirst(Object f){
      objects[0] = (T) f;
    }
    
  /*
  @param takes s of the Object class, the first of the two objects
  @return assigns s to the first element of the array
  */
  	public void setSecond(Object s){
      objects[1] = (T) s;
    }

}
