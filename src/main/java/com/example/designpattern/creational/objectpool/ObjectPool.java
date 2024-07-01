package com.example.designpattern.creational.objectpool;

import java.util.HashSet;
import java.util.Set;

/** ObjectPool is a generic class that manages a pool of objects. */
public abstract class ObjectPool<T> {
    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();


    protected abstract T create();

    /**
     * Retrieve an instance from the pool.
     * If the pool is empty, a new instance is created.
     * @return an instance from the pool
     */
    public synchronized T retrieve() {
        if (available.isEmpty()) {
            available.add(create());
        }
        T instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    /**
     * Release an instance back to the pool.
     * @param instance the instance to release
     */
    public synchronized void release(T instance) {
        inUse.remove(instance);
        available.add(instance);
    }

    @Override
    public String toString() {
        return "ObjectPool{" +
                "available=" + available.size() +
                ", inUse=" + inUse.size() +
                '}';
    }
}
