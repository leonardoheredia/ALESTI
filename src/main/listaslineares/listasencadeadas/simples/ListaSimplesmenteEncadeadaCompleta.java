package listasencadeadas.simples;

public class ListaSimplesmenteEncadeadaCompleta {
    private Nodo inicio;
    private Nodo fim;
    private int quantidade;

    public ListaSimplesmenteEncadeadaCompleta() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    public void adicionar(int elemento) {
        Nodo novoNodo = new Nodo(elemento);
        if(this.inicio==null) { //lista esta vazia --> insere no inicio
            this.inicio = novoNodo;
            this.fim = novoNodo;
        }
        else { //lista nao esta vazia --> insere no final
            Nodo paux = this.fim;
            this.fim = novoNodo;
            paux.proximo = novoNodo;
        }
        quantidade++;
    }

    public void adicionar(int posicao, int elemento) {
        if ((posicao < 0) || (posicao >= quantidade)) {
            throw new IndexOutOfBoundsException("Não é possível inserir na posição " + posicao);
        }
        Nodo novoNodo = new Nodo(elemento);
        if(posicao==0) { //inserindo no inicio
            novoNodo.proximo = this.inicio;
            this.inicio = novoNodo;
            //this.inicio = novoNodo;
            //this.fim = novoNodo;
            quantidade++;
        }
        else if (posicao==quantidade-1) { //insere no final
            this.adicionar(elemento);
        }
        else { //insere no meio
            Nodo pant = null;
            Nodo paux = this.inicio;
            for(int i=0;i<posicao;i++) {
                pant = paux;
                paux = paux.proximo;
            }
            pant.proximo = novoNodo; //liga o anterior ao novo Nodo
            novoNodo.proximo = paux;
            quantidade++;
        }
    }

    public void remover(int elemento) {
        //implementar
    }

    public void removerPelaPosicao(int posicao) {
        //implementar
    }

    public int ler(int posicao) {
        Nodo paux = this.inicio;
        int p = 0;
        for(int i=0; i<posicao; i++) {
            paux = paux.proximo;
        }
        return paux.elemento;
    }

    public void escrever(int elemento) {
        //implementar
    }

    public int tamanho() {
        return this.quantidade;
    }

    public boolean estaVazia() {
        return this.quantidade==0;
    }

    public boolean contem(int elemento) {
        return (this.retornarPosicao(elemento)>-1);
    }

    public int retornarPosicao(int elemento) {
        //indexOf metodo
        //retorna a posicao na lista do elemento ou -1 se nao existir
        Nodo paux = this.inicio;
        for (int posicao = 0; posicao < this.quantidade; posicao++) {
            if(paux.elemento==elemento) return posicao;
            paux = paux.proximo; //remover para exercicio
        }
        return -1;
    }

    @Override
    public String toString() {
        String aux = "[ ";
        Nodo paux = inicio;
        while (paux != null) {
            aux = aux + paux.elemento + " ";
            paux = paux.proximo; // avanca para proximo novo
        }
        aux += "]";
        return aux;
    }


}
