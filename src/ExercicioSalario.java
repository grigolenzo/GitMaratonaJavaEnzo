public class ExercicioSalario {
    public static void main(String[] args) {
        // dado um determinado salário anual qual o valor que tem que pagar de taxa
        // 0 - 34,712 paga 9.70% / 34,713 -> 68,507 paga 37,35% / 68,508 -> [] paga 49,50%
        double salarioAnual = 100000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;

        if(salarioAnual <= 34712){
            salarioAnual = salarioAnual * primeiraFaixa;
        }else if(salarioAnual <= 68507){
            salarioAnual = salarioAnual * segundaFaixa;
        }else {
            salarioAnual = salarioAnual * terceiraFaixa;
        }

        System.out.println(salarioAnual);
    }
}
