package poo.lista04.exerc01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        Scanner bat = new Scanner(System.in);
        ArrayList<Funcionario> funcionario = new ArrayList();

        FuncionarioHorista fh = new FuncionarioHorista();
        FuncionarioMensalista fm = new FuncionarioMensalista();
        int opcao = 0;
        int tc = 0;

        while (opcao != 3) {
            System.out.println("\n-----Menu-----");
            System.out.println("1 - Inserir Funcionario ");
            System.out.println("2 - Exibir Funcionario ");
            System.out.println("3 - Sair ");
            opcao = Integer.parseInt(bat.next());

            switch (opcao) {
                case 1:
                    System.out.println("\n ---Inserir Funcionario---\n");

                    System.out.println("Qual o Tipo de Contratacao: \n1 - Horista\n2 - Mensalista");
                    tc = bat.nextInt();
                    if (tc == 1) {
                        System.out.println("\n ---Horista Selecionado---\n");

                        System.out.println("Digite o Numero do Cracha: ");
                        fh.setNumeroCracha(bat.nextInt());
                        System.out.println("Digite o Nome: ");
                        fh.setNome(bat.next());
                        System.out.println("Digite o Setor: ");
                        fh.setSetor(bat.next());
                        System.out.println("Digite a Funcao: ");
                        fh.setFuncao(bat.next());
                        System.out.println(" Digite a Quantidade de Horas: ");
                        fh.setQtdeHoras(bat.nextInt());
                        System.out.println("Digite o Valor Hora: ");
                        fh.setValorHora(bat.nextDouble());
                        funcionario.add(fh);

                    } else if (tc == 2) {
                        System.out.println("\n ---Mensalista Selecionado---\n");

                        System.out.println("Digite o Numero do Cracha: ");
                        fm.setNumeroCracha(bat.nextInt());
                        System.out.println("Digite o Nome: ");
                        fm.setNome(bat.next());
                        System.out.println("Digite o Setor: ");
                        fm.setSetor(bat.next());
                        System.out.println("Digite a Funcao: ");
                        fm.setFuncao(bat.next());
                        System.out.println("Digite o Salario: ");
                        fm.setSalario(bat.nextDouble());
                        funcionario.add(fm);

                    } else {
                        System.out.println("Valor Digitado Incorreto!");
                    }

                    break;
                case 2:
                    System.out.println("\n ---Exibir Funcionario---\n");

                    for (Funcionario Funcionario : funcionario) {
                        System.out.print(fh.imprimir());

                        System.out.println(fm.imprimir());
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
