package chapters.chapter14;

public final class Storage<T> {
    private Object[] objects = new Object[10];
    private int size = 0;

    public void add(T obj) {
        if (size == objects.length) {
            extend();
        }
        objects[size++] = obj;
    }


    private void extend() {
        Object[] temp = new Object[objects.length + 10];
        System.arraycopy(objects, 0, temp, 0, size);
        objects = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
    }

    public T getByIndex(int index) {
        return (T) objects[index];
    }
}
