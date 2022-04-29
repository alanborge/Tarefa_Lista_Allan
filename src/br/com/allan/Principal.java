package br.com.allan;

import br.com.allan.Pessoas;

import java.util.*;

public class Principal {
    /**
     *
     * classe main
      * @param args LerRegistroDeDados()
     */
    public static void main(String[] args) {
        LerRegistroDeDados();

    }

    /**
     * metodo que cria o registro das pessoas
     */
    private static void LerRegistroDeDados() {

        Pessoas pessoas = new Pessoas();

        System.out.println("informe o nome e sexo:");
        Scanner input = new Scanner(System.in);
        Set<Pessoas> colect = new TreeSet<Pessoas>();
        for (int i = 0; i <= 3; i++) {
            System.out.printf("Nome: ");
            pessoas.setNome(input.next());
            pessoas.getNome();
            System.out.printf("Sexo: ");
            pessoas.setSexo(input.next());
            pessoas.getSexo();
            Pessoas pessoa1 = new Pessoas(pessoas.getNome(), pessoas.getSexo());
            Pessoas pessoa2 = new Pessoas(pessoas.getNome(), pessoas.getSexo());
            Pessoas pessoa3 = new Pessoas(pessoas.getNome(), pessoas.getSexo());
            Pessoas pessoa4 = new Pessoas(pessoas.getNome(), pessoas.getSexo());
            colect.add(pessoa1);
            colect.add(pessoa2);
            colect.add(pessoa3);
            colect.add(pessoa4);

        }
        /**
         * imprime a lista de pessoas
         */
        System.out.println("******** lista do Sexo das br.com.allan.Pessoas *************");
        System.out.println(colect + "\n");
        String sexo= " masculino ; feminino ";

        /**
         * separador da lista por vetor de String
         */
        String[] sexos = sexo.split(" ; ");
        System.out.println("********* grupo masculino *****************");
            for (Pessoas pessoa : colect) {
                if (pessoa.getSexo().equalsIgnoreCase("masculino")){
                    System.out.println(pessoa.getNome() + " / " + sexos[0]);
                }
            }
        System.out.println();
        System.out.println("************ grupo feminino ******************");
        for (Pessoas pessoa: colect) {
             if (pessoa.getSexo().equalsIgnoreCase("feminino")){
                System.out.println(pessoa.getNome() + " / " + sexos[1]);
            }
        }


    }


}





