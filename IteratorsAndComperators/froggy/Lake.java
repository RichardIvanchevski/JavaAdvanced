package froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    List <Integer> elements;

    public Lake(List<Integer> elements) {
        this.elements = elements;
    }




    @Override
    public Iterator<Integer> iterator() {
        return new FrogJump();
    }
    class FrogJump implements Iterator<Integer>{
        int index = 0;
        boolean isFinished = false;
        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        @Override
        public Integer next() {
            int currentElement = elements.get(index);
            index += 2;
            if (index >= elements.size() && !isFinished){
                index = 1;
                isFinished = true;
            }
            return currentElement;
        }
    }

}
