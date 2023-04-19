Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
       
        int[] vetor = new int[tamanho];
        
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        
        
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        
        
        System.out.print("Vetor ordenado em ordem crescente: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scanner.close();
    }
}
