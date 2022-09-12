package listaduplamenteencadeada;

// Interface ListTAD:
// Define os métodos que qualquer implementação
// de lista deve ter
// (isto é, eles PRECISAM ser implementados)
//
public interface ListTAD {
    public void add(int element);
    public void add(int index, int element);
    public int get(int index);
    public int set(int index, int element);
    public boolean remove(int element);
    public int removeByIndex(int index);
    public boolean isEmpty();
    public int size();
    public boolean contains(int element);
    public int indexOf(int element);
    public void clear();
    public void addFirst(int e);
    public int getFirst();
    public int getLast();
    public int removeFirst();
    public int removeLast();

}
