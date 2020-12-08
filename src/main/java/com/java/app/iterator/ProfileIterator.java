package com.java.app.iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}