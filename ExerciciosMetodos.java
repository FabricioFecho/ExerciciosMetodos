import java.util.Scanner;

public class ExerciciosMetodos {

    public static void main(String[] args) {
//        SomaDoisNumeros();
//         calcularPrestacaoEmAtraso();
//            Palavras();
//             maiorEMenor();

    }

    static void SomaDoisNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2 ;

        System.out.println("A soma é: " + resultado);

        scanner.close();
    }

    static void calcularPrestacaoEmAtraso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (%): ");
        double taxa = scanner.nextDouble();

        System.out.print("Digite o tempo de atraso (em meses): ");
        int tempo = scanner.nextInt();

        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.println("\nO valor da prestação em atraso é: R$ " + prestacao);

        scanner.close();
    }



    static void Palavras()  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas letras a palavra terá? ");
        int quantidade = scanner.nextInt();

        String[] letras = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a " + (i + 1) + "ª letra: ");
            letras[i] = scanner.next(); // lê uma letra
        }

        StringBuilder palavra = new StringBuilder();
        for (String letra : letras) {
            palavra.append(letra);
        }

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("\nPalavra formada: " + palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);

        scanner.close();
    }

    static void maiorEMenor(){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
    int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
    int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
    int n3 = scanner.nextInt();

    // Descobre o maior número
    int maior = n1;
        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;

    // Descobre o menor número
    int menor = n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;

        System.out.println("\nO menor número é: " + menor);
        System.out.println("O maior número é: " + maior);

        scanner.close();
}
    }

