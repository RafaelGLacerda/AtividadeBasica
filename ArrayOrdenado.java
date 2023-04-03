Scanner scanner = new Scanner(System.in);
        
        // Lê o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        // Cria o vetor com o tamanho informado
        int[] vetor = new int[tamanho];
        
        // Preenche o vetor com os números digitados pelo usuário
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        
        // Ordena o vetor em ordem crescente utilizando o algoritmo Bubble Sort
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        
        // Exibe o vetor ordenado em ordem crescente
        System.out.print("Vetor ordenado em ordem crescente: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scanner.close();
    }
}
