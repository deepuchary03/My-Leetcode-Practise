class Node{
    public int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
}}
class Main {
      private static Node convertArr2LL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
            return head;
        }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        Node ans= convertArr2LL(arr);
      while(ans!=null){
          System.out.print(ans.data+"->");
          ans=ans.next;
      }
      System.out.print("null");
        
    }
}