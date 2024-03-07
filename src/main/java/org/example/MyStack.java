package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {
    private ArrayList<E> delegate;


    public MyStack() {
        this.delegate = new ArrayList<E>();
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (delegate.isEmpty()) throw new EmptyStackException();
        return delegate.remove(delegate.size() - 1);
    }

    public E peek() {
        if (delegate.isEmpty()) throw new EmptyStackException();
        return delegate.get(delegate.size()-1);
    }

    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    public int size() {
        return delegate.size();
    }


}
