package ListyIterator;


import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> elements;
    private int index;

    public ListyIterator(String... elements) {
        this.elements = List.of(elements);
        this.index = 0;
    }

    public int length() {
        return elements.size();
    }

    public boolean move() {
        if (index < length() - 1) {
            index++;
            return true;
        }
        return false;

    }

    public boolean hasNext() {
        return index + 1 < elements.size();
    }

    public void printAll() {
        String output = String.join(" ", elements);
        System.out.println(output);
    }

    public void print() {
        try {
            System.out.println(elements.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid Operation!");
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int internalIndex;
            @Override
            public boolean hasNext() {
                return internalIndex < elements.size();
            }

            @Override
            public String next() {
                String element = elements.get(internalIndex);
                internalIndex++;
                return element;
            }
        };
    }
}

