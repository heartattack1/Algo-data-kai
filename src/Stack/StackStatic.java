package Stack;

import Exception.StackIsEmptyException;
import Exception.StackIsFullException;

import java.util.Iterator;

/**
 * 20.02.2016.
 */
public class StackStatic<E> {

    private int top;
    private final int size;
    private E[] stack;
    private final static int DEFAULT_SIZE = 10;

    public StackStatic() {
        this(DEFAULT_SIZE);
    }

    public StackStatic(int capacity) {
        if(capacity <= 0) throw new IllegalArgumentException();

        top = -1;
        stack = (E[]) new Object[capacity];
        size = capacity;
    }

    public E pop() throws StackIsEmptyException {
        if(isEmpty()){
            throw new StackIsEmptyException();
        }
        return stack[top--];
    }

    public void push(E element) throws StackIsFullException {
        if(isFull()){
            throw new StackIsFullException();
        }
        stack[++top] = element;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == size - 1;
    }

    public Iterator<E> iterator()
    {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator <E>
    {
        private int i = top;

        public boolean hasNext()
        {
            return (i > -1);
        }

        public E next()
        {
            return stack[i--];
        }

        public void remove()
        {
            // not needed
        }
    }





}
