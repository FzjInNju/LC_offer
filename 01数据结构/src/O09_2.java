import java.util.LinkedList;

public class O09_2 {
    LinkedList<Integer> A,B;
    public O09_2(){
        A = new LinkedList<>();
        B = new LinkedList<>();
    }
    public void appendTrail(int val){
        A.addLast(val);
    }

    public int deleteHead(){
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty()) return -1;
        while(!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}

