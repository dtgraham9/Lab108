/**
 * Data Structures & Algorithms 6th Edition
 * Goodrick, Tamassia, Goldwasser
 * Section 7.4.1
 */
 import java.util.Iterator;
 import java.util.ArrayList;
 import java.util.List;
 
public interface Iterable<E> {
    
    
    Iterator<E> iterator( ); // Returns an iterator of the elements in the collection
   
}
