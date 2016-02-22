package Stack;

import Exception.StackIsEmptyException;

import java.util.ArrayList;
import java.util.List;

/**
 * 20.02.2016.
 */
public class Stack4<E> extends Stack3<E> {
    List<E> temp = new ArrayList<>();

    public E pop(String string) throws StackIsEmptyException {
        if( true
        // * TODO:
        ){
            return pop();
        }
        temp.add(pop());
        return null;
    }


}
