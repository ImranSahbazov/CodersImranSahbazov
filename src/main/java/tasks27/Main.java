package tasks27;

import java.util.NoSuchElementException;

interface Iterator {
    boolean hasNext();

    int next();
}

class CustomIterator implements Iterator {
    private int[] collection;
    private int index;

    public CustomIterator(int[] collection) {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < collection.length;
    }

    @Override
    public int next() {
        if (hasNext()) {
            return collection[index++];
        } else {
            throw new NoSuchElementException("No more elements in the collection.");
        }
    }
}

class CustomCollection {
    private int[] items;

    public CustomCollection(int[] items) {
        this.items = items;
    }

    public Iterator getIterator() {
        return new CustomIterator(items);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        CustomCollection collection = new CustomCollection(array);

        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println("Element: " + element);
        }
    }
}
