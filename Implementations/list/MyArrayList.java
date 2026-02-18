package com.Implementations.list;

import com.Interface.list;

public class MyArrayList<E> implements list<E> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }


 // Size & emptiness   
    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
       if(size>0){

           return false;
       }

       return true;
    }

  // Elements Operations 
   public boolean add(E e){

   if(size == elements.length){

   Object[] newElements = new Object[elements.length*2];

   System.arraycopy(elements, 0,newElements, 0, elements.length);
   elements = newElements;

   }
   elements[size] = e;
   size++;
 return true;
   }

  public boolean contains(Object o){
      for(int i = 0; i<size; i++){
        if(elements[i] == null){
             if(o == null){
                 return true;
             }else{
                if(elements[i].equals(o)){
                    return true;
                }
             }
            }
        }
        return false;
  }
  

public boolean remove(Object o){
   
     for(int i = 0; i<size ; i++){
        if(elements[i] == null){
            if(o == null){
                shiftLeft(i);
                size--;
                return true;
            }
        }else{
            if(elements[i].equals(o)){
                shiftLeft(i);
                size--;
                return true;
            }
        }
     }
  return false;
 }


 private void shiftLeft(int index){
    for(int j = index; j<size -1; j++){
        elements[j] = elements[j+1];
    }
    elements[size -1] = null;
 }

 public void clear(){
    remove(elements);
 }

}
