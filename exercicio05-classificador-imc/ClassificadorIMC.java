import java.util.Scanner;

/**
 * Exercício 05 - Classificador de IMC
 * 
 * Objetivo: Usar estruturas condicionais (if-else) para classificar dados
 * Conceitos: if-else, operadores relacionais, estruturas de decisão
 * 
 * Classificação do IMC:
 * - Abaixo de 18.5: Abaixo do peso
 * - 18.5 a 24.9: Peso normal
 * - 25.0 a 29.9: Sobrepeso
 * - 30.0 a 34.9: Obesidade Grau I
 * - 35.0 a 39.9: Obesidade Grau II
 * - 40.0 ou mais: Obesidade Grau III
 * 
 * @author Felipe Leonardo
 * @since 30/09/2024
 */
public class ClassificadorIMC {
    public static void main(String[] args) {
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Exibindo cabeçalho
        System.out.println("===== CLASSIFICADOR DE IMC =====");
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
        
        // Variável para armazenar a classificação
        String classificacao;
        String emoji;
        
        // Estruturas condicionais para classificar o IMC
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
            emoji = "⚠️";
        } else if (imc < 25.0) {
            classificacao = "Peso normal";
            emoji = "✅";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
            emoji = "⚠️";
        } else if (imc < 35.0) {
            classificacao = "Obesidade Grau I";
            emoji = "🔴";
        } else if (imc < 40.0) {
            classificacao = "Obesidade Grau II";
            emoji = "🔴";
        } else {
            classificacao = "Obesidade Grau III";
            emoji = "🔴";
        }
        
        // Exibindo resultados
        System.out.println();
        System.out.println("===== RESULTADO =====");
        System.out.printf("%s, seu IMC é: %.2f%n", nome, imc);
        System.out.printf("Classificação: %s %s%n", emoji, classificacao);
        System.out.println();
        
        // Tabela de referência
        System.out.println("📊 Tabela de Classificação:");
        System.out.println("├─ Abaixo de 18.5: Abaixo do peso");
        System.out.println("├─ 18.5 a 24.9: Peso normal");
        System.out.println("├─ 25.0 a 29.9: Sobrepeso");
        System.out.println("├─ 30.0 a 34.9: Obesidade Grau I");
        System.out.println("├─ 35.0 a 39.9: Obesidade Grau II");
        System.out.println("└─ 40.0 ou mais: Obesidade Grau III");
        System.out.println();
        
        System.out.println("=====================");
        System.out.println("✅ Exercício 05 concluído com sucesso!");
        System.out.println();
        System.out.println("💡 Dica: Consulte um profissional de saúde");
        System.out.println("   para uma avaliação completa!");
        
        // Fechando o scanner
        scanner.close();
    }
}
