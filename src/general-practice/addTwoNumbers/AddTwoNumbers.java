package addTwoNumbers;

class AddTwoNumbers{
    public static void main( String[] args) {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3))); //342
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4))); //465

        // PracticeQuestions.AddTwoNumbers.ListNode result = addTwoNumbers(list1, list2);
        System.out.println(list2.getNext().getNext().getVal());
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        ListNode currNode1 = l1;
        ListNode currNode2 = l2;
        int currSum = 0;
        int carryOver = 0;
        /*
            read each node's val
            add the values
            check if the division by 10 reveals any remainder?
            if there is no
        */
        while(currNode1 != null || currNode2 != null){ // run till the end of the lists
            int val1 = currNode1.getVal();
            int val2 = currNode2.getVal();
            currSum = carryOver+val1+val2;
            if(currSum % 10 != 0){
                //TODO: complete
            }
        }


        return result;
    }

}