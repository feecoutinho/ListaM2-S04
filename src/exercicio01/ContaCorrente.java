package exercicio01;

public class ContaCorrente extends Conta {

    @Override
    protected double obterSaldoAtual() {
        return super.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }
}