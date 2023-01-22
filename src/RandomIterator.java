import java.util.Iterator;
import java.util.function.Consumer;

public class RandomIterator implements Iterator<Integer> {
    protected int min;
    protected int max;

    public RandomIterator(int min, int max) {
        this.min = min;
        this.max = ++max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            if (min >= 0 && max >= 1) {
                return (int) ((Math.random() * (max - min)) + min);
            } else if (min < 0 && max >= 1) {

            } else if (min < 0 && max < 0) {

            }
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Integer> action) {
        Iterator.super.forEachRemaining(action);
    }
}
