package Tasks11;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{
   public List<T> stack = new ArrayList<>();

    public void push(T t){
        stack.add(t);
    }
    public T  pop(){
        return stack.remove(stack.size()-1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);


        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());

    }
}
