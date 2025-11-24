package CollectionImp.com.rushikesh.collections.Interfaces;

public interface MyCollection<E> extends Iterator<E>{
    
    boolean add(E element);

    // Removes an element from the collection
    boolean remove(E element);

    // Checks if the collection contains a given element
    boolean contains(E element);

    // Returns the number of elements in the collection
    int size();

    // Checks if the collection is empty
    boolean isEmpty();

    // Clears all elements from the collection
    void clear();

    // Returns an iterator to traverse the collection
    java.util.Iterator<E> iterator();

}
