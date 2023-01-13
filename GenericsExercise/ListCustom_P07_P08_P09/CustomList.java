package ListCustom_P07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> customList;

    public CustomList() {
        this.customList = new ArrayList<>();
    }

    public T get (int index){
        return customList.get(index);
    }

    public void add(T element){
        customList.add(element);
    }
    public void remove(int index){
        customList.remove(index);
    }

    public boolean contains(T element){
        return customList.contains(element);
    }
    public void swap(int firstIndex, int secondIndex){
        Collections.swap(customList,firstIndex,secondIndex);
    }
    public int greater(T element){
        int count = 0;
        for (T currentElement : customList) {
            if (currentElement.compareTo(element) > 0){
                count++;

            }
        }
        return count;
    }
    public int size (){
        return customList.size();
    }
    public T max(){
       return customList.stream().max(Comparable::compareTo).get();
    }
    public T min() {
       return customList.stream().min(Comparable::compareTo).get();
    }
    public void Print(){
        customList.forEach(System.out::println);
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < customList.size();
            }

            @Override
            public T next() {
                T element = customList.get(index);
                index++;
                return element;
            }
        };
    }
}
