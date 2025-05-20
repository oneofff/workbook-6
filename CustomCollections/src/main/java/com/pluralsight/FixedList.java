package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> extends ArrayList<T> {
    private int maxSize;

    public FixedList( int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean add(T item){
        if (this.size() >= maxSize)
            return false;
        super.add(item);
        return false;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
