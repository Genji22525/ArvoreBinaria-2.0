import java.util.Scanner;

class Executora {
    ArvoreBinaria arvore;
    Scanner scanner;

    Executora() {
        arvore = new ArvoreBinaria();
        scanner = new Scanner(System.in);
    }

    void executar() {
        arvore.insert(50);
        arvore.insert(30);
        arvore.insert(20);
        arvore.insert(40);
        arvore.insert(70);
        arvore.insert(60);
        arvore.insert(80);

        System.out.println("Árvore binária após inserção:");
        arvore.printTree(); // Exibe a árvore organizada verticalmente com a raiz no topo
        System.out.println();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Remover nó folha");
            System.out.println("2. Remover nó com um filho");
            System.out.println("3. Remover nó com dois filhos");
            System.out.println("4. Remover a raiz");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 4) {
                System.out.print("Digite o valor do nó a ser removido: ");
                int valor = scanner.nextInt();

                // Remover o nó escolhido
                arvore.remove(valor);

                // Exibir a árvore após remoção
                System.out.println("Árvore binária após a remoção:");
                arvore.printTree();
            } else if (escolha == 5) {
                continuar = false;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
