package addTwoNumbers;

public class ListNode {
    private  int val;
    private ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal(){
        return this.val;
    }

    public void setVal(int val){
        this.val = val;
    }

    public ListNode getNext(){
        return this.next;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

}
