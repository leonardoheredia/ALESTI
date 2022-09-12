package listaduplamenteencadeada;


public class App {
    public static void main(String[] args) {
        ListDoubleLinked lista = new ListDoubleLinked();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        lista.add(12);

        lista.add(0, 1);

        System.out.println("Lista:");
        System.out.println(lista);

        System.out.println();
        int valor = lista.removeFirst();
        System.out.println("Removendo primeiro elem: " + valor);
        System.out.println(lista);

        System.out.println();
        System.out.println("Testando acesso com get:");
        for (int pos = 0; pos < lista.size(); pos++)
            System.out.println(pos + ": " + lista.get(pos));

        System.out.println();
        System.out.println("Posição do elemento 8:" + lista.indexOf(8));
        System.out.println("Posição do elemento 22:" + lista.indexOf(22));
        System.out.println("Existe o elemento 22? " + lista.contains(22));

        // System.out.println();
        // System.out.println("Alterando o terceiro elemento para 30");
        // lista.set(2, 30);

        // System.out.println(lista);

        // System.out.println();
        // System.out.println("Inserindo o 7 na quinta posição");
        // lista.add(4, 7);
        // System.out.println(lista);

        // System.out.println();
        // System.out.println("Inserindo o 11 na última posição");
        // lista.add(lista.size() - 1, 11);
        // System.out.println(lista);

        // int elem = lista.removeByIndex(0);
        // System.out.println();
        // System.out.println("Removendo o primeiro");
        // System.out.println("removido: " + elem);
        // System.out.println(lista);

        // System.out.println();
        // elem = lista.removeByIndex(4);
        // System.out.println("Removendo o quinto elemento");
        // System.out.println("removido: " + elem);
        // System.out.println(lista);

        // System.out.println();
        // elem = lista.removeByIndex(lista.size() - 1);
        // System.out.println("Removendo o último elemento");
        // System.out.println("removido: " + elem);
        // System.out.println(lista);

        // Descomente para apagar a lista inteira
        /*
         * while (!lista.isEmpty()) {
         * lista.removeByIndex(0);
         * System.out.println(lista);
         * }
         */

        /*
         * // Tentando remover o número 6
         * boolean ok = lista.remove(6);
         * System.out.println();
         * if (ok)
         * System.out.println("OK! Consegui remover!");
         * else
         * System.out.println("Elemento não existe");
         * System.out.println(lista);
         *
         * // Invertendo a lista
         * System.out.println();
         * lista.reverse();
         * System.out.println(lista);
         *
         * // Inserindo em ordem crescente
         * System.out.println();
         * System.out.println("Testando inserção em ordem crescente");
         * ListArray lista2 = new ListArray();
         * for (int i = 1; i < 20; i += 4)
         * lista2.addIncreasingOrder(i);
         * System.out.println();
         * System.out.println(lista2);
         * lista2.addIncreasingOrder(11);
         * lista2.addIncreasingOrder(30);
         * System.out.println(lista2);
         *
         * // Inserindo em ordem decrescente
         * System.out.println();
         * System.out.println("Testando inserção em ordem decrescente");
         * ListArray lista3 = new ListArray();
         * for (int i = 1; i < 20; i += 4)
         * lista3.addDecreasingOrder(i);
         * System.out.println();
         * System.out.println(lista3);
         * lista3.addDecreasingOrder(11);
         * lista3.addDecreasingOrder(30);
         * System.out.println(lista3);
         */
    }
}
