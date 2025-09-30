/**
 * Exercício 02 - Calculadora de Dados Pessoais
 * 
 * Objetivo: Trabalhar com variáveis e operações matemáticas básicas
 * Conceitos: Variáveis, tipos de dados (int), operadores aritméticos
 * 
 * @author Felipe Leonardo
 * @since 30/09/2024
 */
public class CalculadoraDados {
    public static void main(String[] args) {
        // Declarando variáveis iniciais
        int idade = 20;
        int anoAtual = 2024;
        
        // Realizando cálculos
        int anoNascimento = anoAtual - idade;
        int mesesDeVida = idade * 12;
        int diasDeVida = idade * 365;
        int anoAos65 = anoNascimento + 65;
        int anoAos100 = anoNascimento + 100;
        int anosFaltamPara65 = 65 - idade;
        
        // Cálculos extras (desafios)
        int horasDeVida = diasDeVida * 24;
        int minutosDeVida = horasDeVida * 60;
        
        // Exibindo resultados
        System.out.println("===== CALCULADORA DE DADOS PESSOAIS =====");
        System.out.println();
        System.out.println("📊 Dados Básicos:");
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Meses de vida: " + mesesDeVida);
        System.out.println("Dias de vida: " + diasDeVida);
        System.out.println();
        
        System.out.println("🎂 Projeções Futuras:");
        System.out.println("Aos 65 anos será em: " + anoAos65);
        System.out.println("Aos 100 anos será em: " + anoAos100);
        System.out.println("Faltam " + anosFaltamPara65 + " anos para os 65");
        System.out.println();
        
        System.out.println("⏰ Desafios Extras:");
        System.out.println("Horas de vida: " + horasDeVida);
        System.out.println("Minutos de vida: " + minutosDeVida);
        System.out.println();
        
        System.out.println("=========================================");
        System.out.println("✅ Exercício 02 concluído com sucesso!");
    }
}
