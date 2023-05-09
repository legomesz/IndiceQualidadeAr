import java.util.Scanner;

public class IQA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do IQA: ");
        int iqa = scanner.nextInt();
        String classificacao = "";
        String efeito = "";
        if (iqa >= 0 && iqa <= 50) {
            classificacao = "Boa";
            efeito = "Ausência de sintomas.";
        } else if (iqa >= 51 && iqa <= 100) {
            classificacao = "Regular";
            efeito = "Leve agravamento dos sintomas de pessoas susceptíveis, ...";
        } else if (iqa >= 101 && iqa <= 199) {
            classificacao = "Inadequada";
            efeito = "Decréscimo da resistência física e significativo agravamento ...";
        } else if (iqa >= 200 && iqa <= 299) {
            classificacao = "Má";
            efeito = "Aparecimento prematuro de certas doenças, ...";
        } else if (iqa >= 300 && iqa <= 399) {
            classificacao = "Péssima";
            efeito = "Morte prematura de pessoas doentes e pessoas idosas ...";
        } else if (iqa >= 400) {
            classificacao = "Crítica";
            efeito = "Morte prematura de pessoas doentes e pessoas idosas ...";
        }
        System.out.println("A classificação do ar é: " + classificacao);
        System.out.println("O efeito sobre a população é: " + efeito);
    }
}
