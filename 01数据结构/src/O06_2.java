import util.ListNode;

import java.util.LinkedList;

public class O06_2 {
    public int[] Solution(ListNode head){
        LinkedList<Integer> stack = new LinkedList<>();
        while(head != null){
            stack.addLast(head.val);
            head = head.next;
        }
        int res[] = new int[stack.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = stack.removeLast();
        }
        return res;
    }
    public static void main(String args[]){
        O06_2 o06 = new O06_2();
        ListNode head = new ListNode(1);
        ListNode p = new ListNode(2);
        head.next = p;
        p.next = null;
        System.out.println(o06.Solution(head)[0] + " " + o06.Solution(head)[1]);
    }
}
