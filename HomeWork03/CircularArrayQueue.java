// package cz.cvut.fel.pjv;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    private String[] queue;
    private int capacity;
    private int size;
    private int head;
    private int tail;

    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        this.capacity = 5;
        this.size = 0;
        this.head = -1;
        this.tail = -1;
        this.queue = new String[5];
    }

    /**
     * Creates the queue with given {@code capacity}. The capacity represents
     * maximal number of elements that the
     * queue is able to store.
     * 
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = -1;
        this.tail = -1;
        this.queue = new String[this.capacity];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        boolean ret = true;
        if ((this.head != -1) || (this.size == 0))
            ret = false;
        return ret;
    }

    @Override
    public boolean isFull() {
        boolean ret = true;
        if (this.capacity != this.size)
            ret = false;
        return ret;
    }

    @Override
    public boolean enqueue(String obj) {
        boolean ret = false;

        if ((this.head == -1) || (this.tail == -1) && (size == 0)) {
            this.head = 0;
            this.tail = 0;
            this.queue[this.tail] = obj;
            this.size = 1;
            ret = true;
        }

        if ((this.size != 0) && !(this.isFull())) {
            this.tail = (this.tail + 1) % this.capacity;
            this.queue[this.tail] = obj;
            this.size += 1;
            ret = true;
        }

        return ret;
    }

    @Override
    public String dequeue() {
        String ret = null;
        if (this.isEmpty()) {
            ret = null;
        } else {
            ret = this.queue[this.head];
            this.queue[this.head] = null;
            this.head = (this.head +1) % this.capacity;
            if (this.isEmpty()){
                
            }
        }

        return ret;
    }

    @Override
    public void printAllElements() {

    }
}
