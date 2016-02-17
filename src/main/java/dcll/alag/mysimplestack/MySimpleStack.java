package dcll.alag.mysimplestack;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * Created by Alexandre Lagane on 2/17/16.
 */
public class MySimpleStack implements SimpleStack {
    private Vector<Item> v;

    public MySimpleStack() {
        v = new Vector<Item>();
    }

    @Override
    public boolean isEmpty() {
        return v.isEmpty();
    }

    @Override
    public int getSize() {
        return v.size();
    }

    @Override
    public void push(Item item) {
        v.add(v.size(), item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (v.size() <= 0) {
            throw new EmptyStackException();
        }
        return v.get(v.size() - 1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (v.size() <= 0) {
            throw new EmptyStackException();
        }
        return v.remove(v.size() - 1);
    }
}
