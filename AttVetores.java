import java.util.Scanner;
public class AttVetores {
    public static void main(String[] args) {
        int tamanho, soma1 = 0,soma2 = 0, maior, menor;
        int Posi1, Posi2;
        float media1, media2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um tamanho para o vetor: ");
        tamanho = scanner.nextInt();

        int [] vet = new int [tamanho];

        for (int i = 0; i < tamanho; i++) { //Fazer o scaneamento para cada espaço
            System.out.println("Agora, selecione um valor para o vetor " + i);
            vet[i] = scanner.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {
           soma1 += vet[i]; //somando todos os espaços do vetor
        }
        System.out.println("A soma de todos os vetores juntos seria: " + soma1);
        media1 = soma1 / tamanho; //fazendo a média do vetor
        System.out.println("A média dos valores todos juntos dão: " + media1);


        menor = vet[0]; //validando o MENOR valor descrito no vetor para uma variável
        for (int i = 0; i < tamanho; i++) {
            if (menor > vet[i]) {
                menor = vet[i];
                }
            }
        maior = vet[0]; //validando o MAIOR valor descrito no vetor para uma variável
        for (int i = 0; i < tamanho; i++) {
            if (maior < vet[i]) {
                maior = vet[i];
            }
        }
            System.out.println("O maior vetor é: " + maior + " e o menor é: " + menor);

        System.out.println("Por final, escolha uma posição do vetor para alterar: ");
        Posi1 = scanner.nextInt(); //Escolhendo uma posição do vetor
        System.out.println("Agora, a segunda posição: ");
        Posi2 = scanner.nextInt(); //Escolhendo a segunda posição do vetor

        System.out.println("Qual o valor que deseja substituir no vetor "+ Posi1);
        vet[Posi1] = scanner.nextInt(); //Escolhendo um valor para a posição selecionada acima
        System.out.println("Agora, o segundo valor para o vetor "+ Posi2);
        vet[Posi2] = scanner.nextInt(); //Escolhendo o segundo valor para a posição selecionada acima
        System.out.println("O primeiro valor do vetor "+ Posi1 + " virou o valor "+ vet[Posi1] +" e valor do vetor "+ Posi2 + " virou o valor "+ vet[Posi2]);

        for (int i = 0; i < tamanho; i++) {
            soma2 += vet[i]; //novamente, a soma de todos os espaços do vetores após a substituição
        }
        media2 = soma2 / tamanho; //média após a alteração dos números
        System.out.println("Finalmente, a soma dos valores após a substituição ficaria: "+ soma2 +" e a média seria "+ media2);


    }
}
