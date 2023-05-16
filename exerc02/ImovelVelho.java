package poo.lista04.exerc02;

public class ImovelVelho extends Imovel{
    private double valorDesconto;

    public ImovelVelho() {
    }

    public ImovelVelho(double valorDesconto, int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public double calcularValorImovel(){
        return this.getValor() - this.getValorDesconto();
    }
    
    public String imprimir(){
        return "Codigo: " + this.getCodigo() +
                "\nEndereco: " + this.getEndereco() +
                "\nValor: " + this.getValor() + 
                "\nValor Descontado: " + this.calcularValorImovel() ;
    }

}
