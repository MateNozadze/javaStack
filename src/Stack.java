public class Stack {
    public class Node{
        public Node next;
        public int data;

        public Node(int d, Node n) {
            data=d;
            next=n;
        }
    }
    Node top;
    int size;
    public Stack() {
        top=null;
        size=0;
    }

    public int getSize() {
        return size;
    }

    public void push(int val){
        top= new Node(val,top);
        size++;
    }
    public void pop(){
        if (top==null){
            System.out.println("this stack is empty");
        }else{
            top=top.next;
            size--;
        }
    }
    public void print(){
        Node it=top;
        for(int i=0;i<size;i++){
            System.out.println(it.data);
            it=it.next;
        }
    }
}
