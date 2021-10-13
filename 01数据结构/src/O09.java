import java.util.LinkedList;
public class O09 {
    LinkedList<Integer> stack1 = new LinkedList<>();
    LinkedList<Integer> stack2 = new LinkedList<>();

    public O09() {

    }
    //队尾插入整数
    public void appendTail(int value) {
        stack1.addLast(value);
    }

    //队头删除整数
    public int deleteHead() {
        int size1 = stack1.size();
        while(size1 != 0){
            stack2.addLast(stack1.removeLast());
            size1 --;
        }
        int res;
        if ( stack2.size() == 0) res = -1;
        else res = stack2.removeLast();

        // 啊要将stackq1还原
        size1 = stack2.size();
        while(size1 != 0){
            stack1.addLast(stack2.removeLast());
            size1 --;   // 啊循环条件不能少
        }
        return res;
    }
    public static void main(String args[]){
        O09 o09 = new O09();
        o09.appendTail(1);
        o09.appendTail(2);
        System.out.println(o09.deleteHead() +" " + o09.deleteHead());

    }
}
