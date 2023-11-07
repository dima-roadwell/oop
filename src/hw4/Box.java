package hw4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<T>{
    
    List<T> box;

    private int boxWeight;

    public Box() {
        box = new ArrayList<>();
        this.boxWeight = 0;
    }

    public void add(T t) {
        box.add(t);
    }

    public int getWeight() {
        this.boxWeight = 0;

        for (T t : box) {
            this.boxWeight += t.getWeight();
        }

        return this.boxWeight;
      }
  
      public void move(Box<? super T> box) { 
        
        for(int i = 0; i < this.box.size(); i++) {
            box.add(this.box.get(i));
            this.box.remove(i);
        }
      }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}
