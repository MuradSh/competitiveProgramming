package dataStructures;

public class Ex4Queue {
    private String[] queue;
    private int rear;

    public Ex4Queue(int maxSize) {
        queue = new String[maxSize];
        rear = 0;
    }

    public void enqueue(String add) {
        if(queue.length==rear){
            this.expandCapacity();
        }
        queue[rear] = add;
        rear++;
    }

    private void expandCapacity(){
        String[] queue2 = new String[rear*2];
        int i=0;
        for(String s: queue){
            queue2[i]=s;
            i++;
        }
        this.queue = queue2;
    }

    public String first() {
        if(isEmpty()){
            System.out.println("Array is empty");
            return null;
        }
        return queue[0]; //temporary, change later
    }

    public String dequeue() {
        if(isEmpty()){
            System.out.println("Array is empty");
            return null;
        }
        String first = queue[0];
        rear--;
        for (int i=0; i < rear; i++)
            queue[i]=queue[i+1];
        queue[rear]=null;
        return first; //temporary, change later
    }

    public boolean isEmpty(){
        return (size() == 0);
    }

    public int size() {
        return rear; //temporary, change later
    }

    public String toString() {
        String s = "[";
        for(int i = 0; i < rear; i++) {
            s += queue[i];
            if(i == (rear-1))
                break;
            s += ", ";
        }
        return s + "]";
    }
}
