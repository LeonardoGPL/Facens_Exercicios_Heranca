package poo.lista04.exerc01;


public class FuncionarioHorista extends Funcionario{
    private int qtdeHoras;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int qtdeHoras, double valorHora, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public String imprimir(){
        return  "\n------------------------" +
                "\nNumero do Cracha: " + getNumeroCracha() +
                "\nNome: " + getNome() +
                "\nSetor: " + getSetor() +
                "\nFuncao: " + getFuncao() +
                "\nQuantidade de Horas: " + this.qtdeHoras +
                "\nValor Hora: " + this.valorHora + "\n";
    }

   
    
    
}
