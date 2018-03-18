package add_Two_Numbers;

public class Solution {

//   Definition for singly-linked list.
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
   
  
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode ret = new ListNode(0);
          boolean b = false;
          ListNode current = ret;
          while(true){
              int temp;
              temp = l1.val+l2.val;
              if(temp+current.val>9){
                  b=true;
                  temp=temp-10;
              }
              else
                  b= false;
              current.val = temp+current.val;
              if(l1.next==null || l2.next==null)
                  break;
              if(b==false){ current.next = new ListNode(0);}
                 
              
              else {current.next = new ListNode(1);}
              current = current.next;
              l1=l1.next;
              l2=l2.next;
          }
          if(l1.next!=null && b==false){current.next=l1.next;}
          else if(l1.next!=null && b==true){l1.next.val+=1;
                                            ListNode l1c = l1;
                                            
                                            while(l1c.next.val>9){
                                                l1c.next.val=0;
                                                if(l1c.next.next==null){l1c.next.next=new ListNode(1);}
                                                else l1c.next.next.val+=1;
                                                l1c=l1c.next;}
                                            
                                            
                                            current.next=l1.next;}
          else if(l2.next!=null && b==false){current.next=l2.next;}
          else if(l2.next!=null && b==true){l2.next.val+=1;
                                            ListNode l2c = l2;
                                            while(l2c.next.val>9){
                                                l2c.next.val=0;
                                                if(l2c.next.next==null){l2c.next.next=new ListNode(1);}
                                                else l2c.next.next.val+=1;
                                                l2c=l2c.next;
                                            }
                                            current.next=l2.next;}
          else if(b==true){current.next = new ListNode(1);}
          return ret;
      }
  
}
