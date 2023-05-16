package poo.lista04.exerc02;

public class ImovelNovo extends Imovel{
    private double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(double valorAdicional, int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public double calcularValorImovel(){
        return this.getValor() + this.getValorAdicional();
    }
    
    public String imprimir(){
       return   "Codigo: " + this.getCodigo() +
                "\nEndereco: " + this.getEndereco() +
                "\nValor: " + this.getValor() + 
                "\nValor Descontado: " + this.calcularValorImovel() ;
    }

}
