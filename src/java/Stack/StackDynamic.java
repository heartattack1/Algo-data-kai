package Stack;

import Exception.StackIsEmptyException;

import java.util.Iterator;

/**
 * 20.02.2016.
 */
public class StackDynamic<E>{


    private int top;
    private final int size;
    private E[] stack;
    private final static int DEFAULT_SIZE = 10;

    public StackDynamic() {
        this(DEFAULT_SIZE);
    }

    public StackDynamic(int initSize) {

        if(initSize <= 0) throw new IllegalArgumentException();

        top = -1;
        stack = (E[]) new Object[initSize];
        size = initSize;
    }

    public E pop() throws StackIsEmptyException {
        if(isEmpty()){
            throw new StackIsEmptyException();
        }
        return stack[top--];
    }

    public void push(E element) {

        if (top == stack.length - 1) resize(2 * stack.length);

        stack[++top] = element;
    }


    public boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == size - 1;
    }

    private void resize (int newSize)
    {
        E t[] = (E[]) new Object[newSize];
        System.arraycopy(stack, 0, t, 0, top + 1);
        stack = t;
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
