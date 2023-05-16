package poo.lista04.exerc02;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Exerc02 {

    public static void main(String[] args) {
       
        // TODO code application logic here
        Scanner bat = new Scanner(System.in);bat.useLocale(Locale.US);
        ArrayList<Imovel> imovel = new ArrayList();
       
        ImovelNovo in = new ImovelNovo();
        ImovelVelho iv = new ImovelVelho();
        int opcao = 0;
        int oi = 0;

        while (opcao != 3) {
            System.out.println("-----MENU-----");
            System.out.println("1 - Inserir Imovel ");
            System.out.println("2 - Exibir Imoveis ");
            System.out.println("3 - Sair ");
            opcao = Integer.parseInt(bat.next());
            switch (opcao) {
                case 1:
                    System.out.println("-----Inserir Imovel Selecionado-----");
                    System.out.println(" O Imovel e: \n 1 - Novo \n 2 - Velho ");
                    oi = bat.nextInt();
                    if (oi == 1) {
                        System.out.println("-----Imovel Novo-----");
                        System.out.println("Digite o Codigo do Imovel Novo:");
                        in.setCodigo(bat.nextInt());
                        System.out.println("Digite o Endereco do Imovel Novo: ");
                        in.setEndereco(bat.next());
                        System.out.println("Digite o Valor do Imovel: ");
                        in.setValor(Double.parseDouble(bat.next()));
                        System.out.println("digite o Valor Adicional: ");
                        in.setValorAdicional(Double.parseDouble(bat.next()));
                        imovel.add(in);
                        

                    } else if (oi == 2) {
                        System.out.println("-----Imovel Velho-----");
                        System.out.println("Digite o Codigo do Imovel Velho:");
                        iv.setCodigo(bat.nextInt());
                        System.out.println("Digite o Endereco do Imovel Velho: ");
                        iv.setEndereco(bat.next());
                        System.out.println("Digite o Valor do Imovel: ");
                        iv.setValor(bat.nextDouble());
                        System.out.println("digite o Valor para Desconto: ");
                        iv.setValorDesconto(bat.nextDouble());
                        imovel.add(iv);
                    } else {
                        System.out.println("Valor Digitado Incorreto!");
                    }
                    break;
                case 2:
                    System.out.println("-----Exibir Imoveis-----");
                    for (Imovel imoveis : imovel) {
                        System.out.println(in.imprimir());

                        System.out.println(iv.imprimir());

                    }
                    break;
                case 3:
                    System.out.println(" O programa sera fechado!");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }

        }
        bat.close();
    
    }

}
