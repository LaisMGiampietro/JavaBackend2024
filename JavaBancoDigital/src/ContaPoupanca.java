public class ContaPoupanca extends ContaBancariaBase {
    private static final double JUROS_ANUAL = 0.03; // 3% de juros anual

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    public void aplicarJuros() {
        double juros = getSaldo() * JUROS_ANUAL;
        deposito(juros);
    }
}
