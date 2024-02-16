public class Main {
    public static void main(String[] args){
        //stack test
        Stack stack=new Stack();
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(55);
        stack.push(12);
        stack.pop();
        stack.print();
    }
}