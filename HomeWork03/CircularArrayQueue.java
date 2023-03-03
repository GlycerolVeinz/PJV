package cz.cvut.fel.pjv;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {

    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean isFull() {
        return true;
    }

    @Override
    public boolean enqueue(String obj) {
        return false;
    }

    @Override
    public String dequeue() {
        return null;
    }

    @Override
    public void printAllElements() {

    }
}
