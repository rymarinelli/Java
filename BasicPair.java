public class BasicPair<T> implements PairInterface<T>{
   private T first;
   private T second;
   
  /*
  @param takes two instances of objects T
  */ 
   public BasicPair(T f, T s){
     this.first = f;
     this.second = s;
   }
   
   /*
   @return returns the first of the two elements in the array
   */
   public T getFirst(){
     return this.first;
   }
   
  /*
   @return returns the second of the two elements in the array
   */
	public T getSecond(){
      return this.second;
    }
    
  /*
  @param takes the first of the two objects
  */
  	public void setFirst(Object f){
      this.first = (T) f;
    }
    
  /* 
  
  @param takes the second the two objects
  */
  	public void setSecond(Object s){
      this.second = (T) s;
    }

}