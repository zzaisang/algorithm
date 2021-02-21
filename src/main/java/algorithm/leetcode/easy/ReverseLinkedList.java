package main.java.algorithm.leetcode.easy;

import lombok.ToString;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-21
 */
public class ReverseLinkedList {

    /**
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     *
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     *
     * */

    public static void main(String[] args) {

    }

    // 재귀 호출로 처리
    private static ListNode reverseListRecursive(ListNode current, ListNode prev){
        if (current == null){
            return prev;
        }else {
            ListNode nextNode = current.next;
            current.next = prev;
            return reverseListRecursive(nextNode,current);
        }
    }

}

@ToString
class ListNode{
    int val;
    ListNode next;
    ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
