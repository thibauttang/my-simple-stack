package deqo.ttan.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by thibauttang on 09/11/2016.
 */
public interface SimpleStack {

    public boolean isEmpty();

    public int getSize();

    public void push (Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;

}
