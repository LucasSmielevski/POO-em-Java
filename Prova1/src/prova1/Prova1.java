/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author patyx
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);
        Pessoa pe = new Pessoa();
        int i;
        int nAux;

        System.out.println("Informe o número de cadastros:");
        nAux = ler.nextInt();

        for (i = 0; i < nAux; i++) {
            System.out.println("Informe o nome:");
            String nome = ler.next();
            System.out.println("Informe o sexo (M ou F)");
            String sexo = ler.next().toUpperCase();
            if (sexo.equalsIgnoreCase("m")) { // Verifica se o sexo é "m" (ignorando maiúsculas/minúsculas)
                sexo = "M"; // Atribui "M" caso seja "m"
            } else if (sexo.equalsIgnoreCase("f")) { // Verifica se o sexo é "f" (ignorando maiúsculas/minúsculas)
                sexo = "F"; // Atribui "F" caso seja "f"
            } else {
                System.out.println("Sexo inválido. Utilizando valor padrão.");
                sexo = "N/A"; // Valor padrão.
            }
            System.out.println("Informe o ano de nascimento (dd/mm/yyyy):");
            String nascimento = ler.next();
            System.out.println("Informe o sálario da pessoa:");
            float salario = ler.nextFloat();
            System.out.println("Informe o peso:");
            float peso = ler.nextFloat();
            System.out.println("Informe a altura:");
            float altura = ler.nextFloat();

            Pessoa ps = new Pessoa(nome, sexo, nascimento, salario, peso, altura);

            pe.addObject(ps);
        }

        for (i = 0; i < pe.getNcadastros(); i++) {
            System.out.println((i != 0) ? "--------------------------------------" : "---------Listagem de Pessoas----------");
            System.out.print(pe.getPessoa(i).printInformaçoes());
            System.out.println(pe.getPessoa(i).getIdade());
            System.out.println("Imc: " + Math.round(pe.getPessoa(i).getCalculaImc() * 100.0) / 100.0f);
        }

        System.out.println("-------------Dados Gerais-------------");
        System.out.println(" Numero de cadastros: " + nAux);
        System.out.println(pe.getHomensMulheres());
        System.out.println(pe.getTodosSalariosEMedia());
        System.out.println("--------------------------------------");

        ler.close();

    }

}
