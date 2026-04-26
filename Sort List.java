class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> helper = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            helper.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(helper);
        ListNode ans = new ListNode(0);
        ListNode temp2 = ans;
        int size = helper.size();
        for(int i=0; i<size; i++) {
            ListNode curr = new ListNode(helper.get(i));
            temp2.next = curr;
            temp2 = temp2.next;
        }
        return ans.next;
    }
}
