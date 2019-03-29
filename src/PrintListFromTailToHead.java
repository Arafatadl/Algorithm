import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    private class ListNode{
        int val;
        ListNode next =null;

        ListNode(int val){
            this.val=val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode ){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }

        while (!stack.isEmpty())
            res.add(stack.pop());

        return res;
    }
}
