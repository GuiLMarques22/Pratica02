public class Calcinvestimentos {
    import java.util.Scanner;

        private double investimentoInicial;
        private double taxaRendimento;
        private int numeroMeses;

        public Investimento(double investimentoInicial, double taxaRendimento, int numeroMeses) {
            this.investimentoInicial = investimentoInicial;
            this.taxaRendimento = taxaRendimento;
            this.numeroMeses = numeroMeses;
        }

        public void calcularRendimento() {
            double montante = investimentoInicial * Math.pow(1 + taxaRendimento, numeroMeses);
            double rendimento = montante - investimentoInicial;
            System.out.printf("O rendimento após %d meses é de R$ %.2f\n", numeroMeses, rendimento);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor do investimento inicial: R$ ");
            double investimentoInicial = scanner.nextDouble();

            System.out.print("Digite a taxa de rendimento mensal (%): ");
            double taxaRendimento = scanner.nextDouble() / 100.0;

            System.out.print("Digite o número de meses: ");
            int numeroMeses = scanner.nextInt();

            Investimento investimento = new Investimento(investimentoInicial, taxaRendimento, numeroMeses);
            investimento.calcularRendimento();

            scanner.close();
        }
    }

}
