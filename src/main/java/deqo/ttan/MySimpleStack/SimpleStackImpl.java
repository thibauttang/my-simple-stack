package deqo.ttan.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by thibauttang on 09/11/2016.
 * Un commentaire répondant à l'exigence 3
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public int getSize(){
        return wrappedStack.size();
    }

    public void push (Item item){
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException{
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException{
        return (Item) wrappedStack.pop();
    }

}
