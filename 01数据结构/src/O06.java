import util.ListNode;

import java.util.ArrayList;

public class O06 {
    ArrayList<Integer> tmp = new ArrayList<>();
    public int[] Solution(ListNode head){
        recur(head);
        int res[] = new int[tmp.size()];
        for ( int i = 0; i < res.length; i++){
            res[i] = tmp.get(i);
        }
        return res;
    }
    public void recur(ListNode head){
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }


    public static void main(String args[]){
        O06 o06 = new O06();
        ListNode head = new ListNode(1);
        ListNode p = new ListNode(2);
        head.next = p;
        p.next = null;
        System.out.println(o06.Solution(head)[0] + " " + o06.Solution(head)[1]);
    }
}
