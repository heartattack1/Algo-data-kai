package Stack;

import java.util.List;

/**
 * 20.02.2016.
 */
public class Stack3<E> extends StackDynamic<E> {


    public void push(E... listOfElements){
        for(E element: listOfElements){
            push(element);
        }
    }

    public void push(List<E> list){
        list.stream().forEach(this::push);
    }
}
