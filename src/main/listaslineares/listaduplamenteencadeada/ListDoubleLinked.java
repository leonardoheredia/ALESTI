package listaduplamenteencadeada;

public class ListDoubleLinked implements ListTAD {

    private Node header;
    private Node trailer;
    private int count;

    private class Node {
        public int item;
        public Node next;
        public Node prev;

        public Node(int element) {
            this.item = element;
            this.next = null;
        }
    }

    public ListDoubleLinked() {
        clear();
    }

    @Override
    public void add(int element) {
        Node n = new Node(element);
        Node last = trailer.prev;
        n.prev = last;
        n.next = trailer;
        last.next = n;
        trailer.prev = n;
        count++;
    }

    @Override
    public void add(int index, int element) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        Node n = new Node(element);
        Node atual = header.next; // 1o. elem
        for (int pos = 0; pos < index; pos++)
            atual = atual.next;
        Node ant = atual.prev;
        ant.next = n;
        n.prev = ant;
        atual.prev = n;
        n.next = atual;
        count++;
    }

    /**
     * Retorna o elemento de uma determinada posicao da lista.
     *
     * @param index a posicao da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    @Override
    public int get(int index) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        Node ptr = header.next;
        for (int pos = 0; pos < index; pos++)
            ptr = ptr.next;
        return ptr.item;

    }

    /**
     * Substitui o elemento armazenado em uma determinada posicao da lista pelo
     * elemento passado por parametro, retornando o elemento que foi substituido.
     *
     * @param index   a posicao da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posicao da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    @Override
    public int set(int index, int element) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        Node ptr = header.next;
        for (int pos = 0; pos < index; pos++)
            ptr = ptr.next;
        int temp = ptr.item; // salva o valor armazenado lá...
        ptr.item = element;
        return temp; // ...e retorna ele
    }

    @Override
    public boolean remove(int element) {
        int pos = indexOf(element);
        if (pos == -1)
            return false; // não existe na lista
        removeByIndex(pos);
        return true;
    }

    @Override
    public int removeByIndex(int index) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        Node atual = header.next;
        for (int pos = 0; pos < index; pos++)
            atual = atual.next;
        Node ant = atual.prev;
        Node prox = atual.next;
        ant.next = prox;
        prox.prev = ant;
        count--;
        return atual.item;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int element) {
        return indexOf(element) != -1;
    }

    @Override
    public int indexOf(int element) {
        Node ptr = header.next;
        for (int pos = 0; pos < count; pos++) {
            if (ptr.item == element)
                return pos;
            ptr = ptr.next;
        }
        return -1; // não encontrou
    }

    @Override
    public void clear() {
        header = new Node(0);
        trailer = new Node(0);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

    /**
     * Retorna o conteúdo da lista como uma string
     *
     * @return uma string com os elementos da lista
     */
    @Override
    public String toString() {

        String aux = "[ ";
        // Começa no header.next (primeiro elem)
        Node ptr = header.next;
        // Se chegar no trailer, termina
        while (ptr != trailer) {
            aux = aux + ptr.item + " ";
            ptr = ptr.next; // avança para o próximo nodo
        }
        aux += "]";
        return aux;

    }

    @Override
    public void addFirst(int e) {
        Node n = new Node(e);
        Node first = header.next;
        n.next = first;
        first.prev = n;
        n.prev = header;
        header.next = n;
        count++;
    }

    @Override
    public int getFirst() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        return header.next.item;
    }

    @Override
    public int getLast() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        return trailer.prev.item;
    }

    @Override
    public int removeFirst() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        Node aux = header.next;
        Node prox = aux.next;
        header.next = prox;
        prox.prev = header;
        count--;
        return aux.item;
    }

    @Override
    public int removeLast() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        Node aux = trailer.prev;
        Node ant = aux.prev;
        ant.next = trailer;
        trailer.prev = ant;
        count--;
        return aux.item;
    }

}

