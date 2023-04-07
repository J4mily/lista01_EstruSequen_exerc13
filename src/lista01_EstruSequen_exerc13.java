import java.util.Scanner;

/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Peso idela de homem e de mulher.
* Descrição:13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
    +> Para homens: (72.7*h) - 58
    +> Para mulheres: (62.1*h) - 44.7
* Data: 07/04/2023 */

public class lista01_EstruSequen_exerc13 {
    public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Qual a sua altura? ");
    double altura = entrada.nextDouble();

    System.out.printf("O seu peso ideal caso você seja HOMEM é: %.2f" , ((72.7 * altura) - 58));
    System.out.println();
    System.out.printf("O seu peso ideal caso você seja MULHER é: %.2f" , ((62.1 * altura) - 44.7));
    entrada.close();

    }
}
