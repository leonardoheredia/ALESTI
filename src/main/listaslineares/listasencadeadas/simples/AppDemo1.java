package listasencadeadas.simples;

public class AppDemo1 {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista1 = new ListaSimplesmenteEncadeada();

        lista1.adicionar(300);
        lista1.adicionar(120);
        lista1.adicionar(900);

        lista1.adicionar(1, 777);
        lista1.adicionar(0, 666);
        int p = lista1.retornarPosicao(900);

    }
}
