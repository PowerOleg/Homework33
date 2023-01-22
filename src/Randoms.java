import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    protected int min;
    protected int max;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
