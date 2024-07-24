public class ContaCorrente extends ContaBancariaBase {
    private static final double LIMITE_DESC_ORD = 500.0; // Limite de descoberto

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void saque(double valor) {
        if (valor > 0 && (getSaldo() - valor) >= -LIMITE_DESC_ORD) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente para saque ou limite de descoberto excedido.");
        }
    }
}

