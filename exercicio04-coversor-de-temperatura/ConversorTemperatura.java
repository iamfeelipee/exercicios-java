import java.util.Scanner;

/**
 * Exercício 04 - Conversor de Temperatura
 * 
 * Objetivo: Praticar fórmulas matemáticas e formatação
 * Conceitos: Fórmulas de conversão, operações matemáticas, formatação
 * 
 * Fórmulas:
 * - Fahrenheit = (Celsius × 9/5) + 32
 * - Kelvin = Celsius + 273.15
 * 
 * @author Felipe Leonardo
 * @since 30/09/2024
 */
public class ConversorTemperatura {
    public static void main(String[] args) {
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Exibindo cabeçalho
        System.out.println("===== CONVERSOR DE TEMPERATURA =====");
        System.out.println();
        
        // Solicitando temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Realizando conversões
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kelvin = celsius + 273.15;
        
        // Exibindo resultados
        System.out.println();
        System.out.println("===== RESULTADOS =====");
        System.out.printf("%.1f°C equivale a:%n", celsius);
        System.out.println();
        System.out.printf("🌡️  %.1f°F (Fahrenheit)%n", fahrenheit);
        System.out.printf("❄️  %.2fK (Kelvin)%n", kelvin);
        System.out.println();
        
        // Informações extras
        System.out.println("📊 Tabela de Referência:");
        System.out.println("Água congela: 0°C = 32°F = 273.15K");
        System.out.println("Água ferve: 100°C = 212°F = 373.15K");
        System.out.println();
        
        System.out.println("======================");
        System.out.println("✅ Exercício 04 concluído com sucesso!");
        
        // Fechando o scanner
        scanner.close();
    }
}
