package GenericBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> value;

    public Box() {
        this.value = new ArrayList<>();
    }

    public void add(T element) {
        value.add(element);
    }

    public void swap(int firstIndex , int secondIndex){
        Collections.swap(value,firstIndex,secondIndex);
    }


    public void printElements(){
        value.forEach(element ->{
            System.out.printf("%s: %s%n",element.getClass().getName(), element);
        });
    }

    public List<T> getValue() {
        return value;
    }

    public int compareTo(T element) {
        int count = 0;
        for (T listElement : value) {
            if (listElement.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

}
