public class squeee {
    int front=0, rear=0, size=0, range;
    int[] queue;

    squeee(int size) { // Constructor with size parameter
        range = size;
        queue = new int[range];
    }

    public squeee() {
    }

    void enqueue(int data){ // to insert a value
        if(size == range){
            System.out.println("Queue is full");
        }
        queue[rear] = data;
        rear = (rear + 1) % range;
        size++;
    }

    void dequeue(){
        if(size == 0){
            System.out.println("Underflow");
        }else{
            int data = queue[front];
            front = (front + 1) % range;
            size--;
            System.out.println("Dequeued: " + data);
        }
    }

    int peek(int data){
        if(size == 0){
            System.out.println("Empty Queue");
        }
        return queue[front];
    }
    public static void main(String[] args) {
        squeee ob = new squeee();
        ob.enqueue(5);
        ob.dequeue();
        ob.peek(1);
    }
}