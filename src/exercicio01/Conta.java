package exercicio01;

//a) Crie a interface "Operavel", com os métodos depositar(double valor) e sacar(double valor).
//b) Crie a classe Abstrata Conta com o atributo "saldo" (double) e um método protegido (protected) "ObterSaldoAtual()".
//c) Crie uma classe "ContaCorrente" que implemente a interface Operavel e herde da classe Conta. Faça uma implementação dos métodos herdados.

public abstract class Conta {
    protected double saldo;

    protected abstract double obterSaldoAtual();

    public abstract void depositar(double valor);

    public abstract double sacar(double valor);
}
