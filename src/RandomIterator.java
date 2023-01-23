import java.util.Iterator;
import java.util.function.Consumer;

public class RandomIterator implements Iterator<Integer> {
    protected int min;
    protected int max;

    public RandomIterator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            if (min >= 0 && max >= 0) {
                int newMax = max;
                return (int) ((Math.random() * ((newMax + 1) - min)) + min);

            } else if (min < 0 && max >= 0) {
                int range = max + Math.abs(min) + 1;
                return (int) (Math.random() * range) - max;

            } else if (min < 0 && max < -1) {
                if (min < max) {
                    int newMax = Math.abs(min);
                    int newMin = Math.abs(max);
                    ++newMax;
                    int result = (int) ((Math.random() * (newMax - newMin)) + newMin);
                    return result * -1;
                } else {
                    throw new IllegalStateException("Неверный диапазон. Минимум должен быть меньше максимума.");
                }
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
