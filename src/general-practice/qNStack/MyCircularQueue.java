package qNStack;

public class MyCircularQueue {
    int [] data;
    int head = -1;
    int tail = -1;
    int size = -1;

    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    public boolean enQueue(int value) {
        boolean ans = false;
        // case when queue is empty
        if(head == -1 && tail == -1){
            head = 0;
            tail = 0;
            data[tail] = value;
            ans = true;
        }

        //case when queue is full
        else if ((tail == size-1 && head == 0) || (tail == head-1)){
            return false;
        }

        else if(tail == size-1) {
            if (head != 0) {
                tail = 0;
                data[tail] = value;
                ans = true;
            }
        } else {
            tail++;
            data[tail] = value;
            ans = true;

        }
        return ans;
    }

    public boolean deQueue() {

        // case if the queue is empty
        if (tail == -1){
            return false;
        }

        // case when there is only one element
        if (head == tail){
            head = -1;
            tail = -1;

        }

        // case when there is data in the queue
        if (head != -1){
            if (head == size -1){
                head = 0;
            }
            head = head +1;

        }

        return true;

    }

    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }

    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];

    }

    public boolean isEmpty() {
        return head == -1;

    }

    public boolean isFull() {
        boolean ans = false;
        if (((head == 0) && (tail == size-1)) || (tail+1) == head){
            ans= true;
        }
        return ans;
    }

    public static void main(String[] args) {

// copying the failing test case
        MyCircularQueue obj = new MyCircularQueue(2);

        boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.enQueue(2);
        boolean deQueue0 = obj.deQueue();
        boolean param_3 = obj.enQueue(3);
        boolean deQueue1 = obj.deQueue();
        boolean param_4 = obj.enQueue(3); //
        boolean deQueue2 = obj.deQueue();
        boolean param_x = obj.enQueue(3); //
        boolean deQueue = obj.deQueue();
        int front = obj.Front();

        System.out.println(param_1
                + " "+param_2
                + " "+deQueue0
                + " "+param_3
                + " "+deQueue1
                + " "+param_4
                + " "+deQueue2
                + " "+param_x
                + " "+deQueue
                + " "+ front);

        //TODO : 56 of 58 test cases passed : work on the last two.
    }
}