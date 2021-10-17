package dataStructures;

public class Ex4QueueTest {
    public static void main(String[] args) {
        Ex4Queue queue = new Ex4Queue(2);

        System.out.println("Enqueue 4:");
        queue.enqueue("Anne");
        queue.enqueue("Bob");
        queue.enqueue("Catherine");
        queue.enqueue("Dylan");
        System.out.println(queue.toString());
        System.out.println("Size: "+queue.size());

        System.out.println("\nFirst element: "+queue.first());

        System.out.print("\nDequeue 2: ");
        System.out.println("("+queue.dequeue()+", "+queue.dequeue()+")");

        System.out.println("\nFinal list:");
        System.out.println(queue.toString());
        System.out.println("Size: "+queue.size());
    }
}