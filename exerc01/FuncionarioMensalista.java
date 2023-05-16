package poo.lista04.exerc01;


public class FuncionarioMensalista extends Funcionario{
    private double salario;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(double salario, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String imprimir(){
        return  "------------------------" +
                "\nNumero do Cracha: " + this.getNumeroCracha() +
                "\nNome: " + this.getNome() +
                "\nSetor: " + this.getSetor() +
                "\nFuncao: " + this.getFuncao() +
                "\nSalario: " + this.salario + "\n";
    }
    
}
