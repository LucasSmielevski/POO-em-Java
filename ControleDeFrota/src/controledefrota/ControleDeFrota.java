/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledefrota;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ControleDeFrota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();
        int opcao = 0;
        int opcaoCarro = 0;

        menuPrincipal:
        while (opcao != 3) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção \n"
                    + "1 Adicionar carro\n"
                    + "2 Gerenciar carro existente\n"
                    + "3 Sair"));

            switch (opcao) {
                case 1:
                    String placa = JOptionPane.showInputDialog("Digite a placa do carro:");
                    Float hodometro = Float.parseFloat(JOptionPane.showInputDialog("Digite o hodômetro do carro:"));
                    Float consumo = Float.parseFloat(JOptionPane.showInputDialog("Digite o consumo do carro:"));
                    Float capacidadeTanque = Float.parseFloat(JOptionPane.showInputDialog("Digite a capacidade do tanque do carro:"));
                    Float dispoCombustivel = Float.parseFloat(JOptionPane.showInputDialog("Digite a disponibilidade de combustivel do carro:"));
                    Carro carro = new Carro(placa, hodometro, consumo, capacidadeTanque, dispoCombustivel);
                    carros.add(carro);
                    JOptionPane.showMessageDialog(null, "Carro adicionado com sucesso");
                    break;

                case 2:
                    if (carros.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Não existe carro adicionado na frota");
                    } else {
                        String placaGerenciar = JOptionPane.showInputDialog("Digite a placa do carro que deseja gerenciar");
                        boolean carroEncontrado = false;

                        for (Carro c : carros) {
                            if (c.getPlaca().equals(placaGerenciar)) {
                                carroEncontrado = true;

                                while (true) {
                                    String gerenciarCarro = "Selecione uma opção para o carro: " + c.getPlaca()
                                            + "\n1 - Abastecer \n"
                                            + "2 - Percorrer \n"
                                            + "3 - Mostrar informações \n"
                                            + "4 - Voltar ao menu principal";
                                    opcaoCarro = Integer.parseInt(JOptionPane.showInputDialog(gerenciarCarro));

                                    switch (opcaoCarro) {
                                        case 1:
                                            float quantCombustivel = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de combustível que deseja abastecer:"));
                                            c.abastecer(quantCombustivel);
                                            break;
                                        case 2:
                                            float distancia = Float.parseFloat(JOptionPane.showInputDialog("Digite a distância que deseja percorrer:"));
                                            c.percorrer(distancia);
                                            break;
                                        case 3: 
                                            c.informacoes();
                                            break;
                                        case 4:
                                            JOptionPane.showMessageDialog(null, "Voltando ao menu principal");
                                            continue menuPrincipal;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                                            break;
                                    }
                                }
                            }
                        }
                        if (!carroEncontrado) {
                            JOptionPane.showMessageDialog(null, "Carro não encontrado na frota.");
                        }
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Encerrando programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }

}
