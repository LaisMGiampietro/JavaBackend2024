public abstract class ContaBancariaBase implements ContaBancaria {
    private double saldo;

    public ContaBancariaBase(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void deposito(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    @Override
    public void saque(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    @Override
    public void transferencia(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            saque(valor);
            destino.deposito(valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }
}

