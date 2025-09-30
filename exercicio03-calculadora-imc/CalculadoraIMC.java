import java.util.Scanner;

/**
 * Exercício 03 - Calculadora de IMC
 * 
 * Objetivo: Usar Scanner para entrada de dados e realizar cálculos
 * Conceitos: Scanner, tipos double, formatação de saída, printf
 * 
 * Fórmula do IMC: peso (kg) / altura² (m)
 * 
 * @author Felipe Leonardo
 * @since 30/09/2024
 */
public class CalculadoraIMC {
    public static void main(String[] args) {
        // Criando objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Exibindo cabeçalho
        System.out.println("===== CALCULADORA DE IMC =====");
        System.out.println();
        
        // Solicitando dados ao usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();
        
        // Calculando o IMC
        double imc = peso / (altura * altura);
        
        // Exibindo resultado
        System.out.println();
        System.out.println("===== RESULTADO =====");
        System.out.printf("%s, seu IMC é: %.2f%n", nome, imc);
        System.out.println();
        
        // Informações adicionais
        System.out.println("📋 Informações:");
        System.out.printf("Peso: %.1f kg%n", peso);
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("IMC: %.2f%n", imc);
        System.out.println();
        
        System.out.println("=====================");
        System.out.println("✅ Exercício 03 concluído com sucesso!");
        
        // Fechando o scanner
        scanner.close();
    }
}
