import java.util.Scanner;
public class attvetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho,  maior,maiorqnt=0, menor,menorqnt=0;
        int subtitui1, subtitui2;
        float media, soma =0,soma2=0,media2;
        int [] vet1;


        // Limitando a matriz
        System.out.println("Usuário, digite o tamanho do vetor");
        System.out.println("Coloque o tamanho sendo >=2, para que tenha as substituições.");
        tamanho = scanner.nextInt();
        while(tamanho<2){
            System.out.println("Por favor coloque um tamanho valido.");
            System.out.println("Coloque o tamanho sendo >=2 para que ocorra as substituições.");
            tamanho = scanner.nextInt();
        }
        vet1 = new int[tamanho];
        System.out.println("O tamanho definido para o vetor foi "+tamanho);


        // Preenchendo as posições
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Preencha as posições do vetor com números inteiros" +
                    " a posição atual do vetor é "+(i+1));
            vet1 [i] = scanner.nextInt();
        }


        // Verificando as posições
        for (int i = 0; i < tamanho; i++) {
            if (i==0){
                System.out.println("O vetor atual, possui os números de: ");
            }
            System.out.print(vet1 [i]+ " ");
        }
        System.out.println("\n");


        //Soma dos números
        for (int i = 0; i < tamanho; i++) {
            soma = soma+vet1[i];
        }
        System.out.println("\nA soma do Vetor é: "+soma);


        //Média dos valores, considerando a soma do vetor
        media = soma / tamanho;
        //usei média (float) para ficar mais correto.
        System.out.println("A média do vetor é "+media);
        System.out.println(".");


        //maior valor do vetor
        maior = vet1 [1];
        //Aqui é para não definir um valor
        //(imagine que esse valor seja maior que toda matriz)
        for (int i = 0; i < tamanho; i++) {
            //Laço+if para ver o maior
            if (maior <= vet1[i]){
                maior = vet1[i];
            }
        }
        for (int i = 0; i < tamanho; i++) {
            //laço + if para ver a quantidade de "maiores."
            if (maior == vet1[i]) {
                maiorqnt++;
            }
        }
        System.out.println("O maior valor número no vetor é "+maior+
                ", além disso existe apenas "+maiorqnt+" dessa quantidade.");


        //menor valor do vetor
        menor = vet1 [1];
        //Aqui é para não definir um valor
        //(imagine que esse valor seja menor que toda matriz)
        for (int i = 0; i < tamanho; i++) {
            //Laço+if para ver o menor
            if (menor >= vet1[i]){
                menor = vet1[i];
            }
        }
        for (int i = 0; i < tamanho; i++) {
            //laço + if para ver a quantidade de "menores"
            if (maior == vet1[i]) {
                menorqnt++;
            }
        }
        System.out.println("O menor valor número no vetor é "+menor+
                ", além disso existe apenas "+menorqnt+" dessa quantidade.");
        System.out.println(".");


        //substituição valor 1
        do {
            System.out.println("Usuário, escolha algum valor entre 1 à " + tamanho
                    + " para substituir no vetor por outro valor");
            subtitui1 = scanner.nextInt();
        } while (subtitui1<1||subtitui1>tamanho);
        for (int i = 0; i < subtitui1; i++) {
            if ((i+1)==subtitui1){
                System.out.println("O valor atual é "+vet1[i]);
                System.out.println("substitua-o: ");
                vet1[i] = scanner.nextInt();
            }
        }
        System.out.println("O valor substituido ficou "+ vet1[(subtitui1-1)]);


        //substituição valor 2
        do {
            System.out.println("Usuário, escolha algum valor entre 1 à " + tamanho
                    + " para substituir no vetor por outro valor");
            subtitui2 = scanner.nextInt();
        }while (subtitui2<1|| subtitui2>tamanho);
        for (int i = 0; i < subtitui2; i++) {
            if ((i+1)==subtitui2){
                System.out.println("O valor atual é "+vet1[i]);
                System.out.println("substitua-o: ");
                vet1[i] = scanner.nextInt();
            }
        }
        System.out.println("O valor substituido ficou "+ vet1[(subtitui2-1)]);


        // Verificando as posições após a atualização.
        for (int i = 0; i < tamanho; i++) {
            if (i==0){
                System.out.println("O vetor atual, possui os números de: ");
            }
            System.out.print(vet1 [i]+ " ");
        }
        System.out.println("\n");


        //Soma2 após a atualização.
        for (int i = 0; i < tamanho; i++) {
            soma2 = soma2+vet1[i];
        }
        System.out.println("\nA soma após a modificação é : "+soma2);


        //Média dos valores, considerando a soma do vetor
        media2 = soma2 / tamanho;
        System.out.println("A média do vetor é "+media2);
    }
}


