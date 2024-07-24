public interface ContaBancaria {
    void deposito(double valor);
    void saque(double valor);
    void transferencia(ContaBancaria destino, double valor);
}
