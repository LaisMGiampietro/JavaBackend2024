public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente(1000.00);
        ContaBancaria conta2 = new ContaPoupanca(500.00);

        conta1.deposito(200.00);
        conta1.saque(150.00);
        conta1.transferencia(conta2, 100.00);

        ((ContaPoupanca) conta2).aplicarJuros();

        System.out.println("Saldo Conta Corrente: " + ((ContaCorrente) conta1).getSaldo());
        System.out.println("Saldo Conta Poupança: " + ((ContaPoupanca) conta2).getSaldo());
    }
}
