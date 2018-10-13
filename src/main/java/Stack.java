public class Stack {

    private int [] storage;
    private int top = -1;

    public Stack(int size) {
        storage = new int[size];

    }


    public boolean isEmpty() {
        return size() ==0;
    }

    public void push(int value) {
        if (top +1 == storage.length){
            throw new IllegalStateException("Overflow");
        }
        top++;
        storage[top]=value;

    }

    public int pop() {
        if (isEmpty()){
            throw new IllegalStateException("Underflow");
        }
        int oldTop = top;
        top--;
        return storage[oldTop];
    }

    public int size() {
        return top +1;
    }
}