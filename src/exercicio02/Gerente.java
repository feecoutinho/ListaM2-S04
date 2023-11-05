package exercicio02;

//b) Crie uma classe Gerente que herde de Funcionário, sobrescrevendo o método de obter cargo com o texto "Sou Gerente".
//c) Transforme a classe Gerente numa classe que não pode mais ser extendida (ou seja, que não pode ter subclasses).
public final class Gerente extends Funcionario {

    @Override
    public String obterCargo() {
        return "Sou gerente";
    }

}