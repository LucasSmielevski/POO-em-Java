/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledefrota;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Carro {

    private String placa;
    private float hodometro;
    private float consumo;
    private float capacidadeTanque;
    private float dispoCombustivel;
    private float abastecer;
    private float percorrer;

// Construtor da classe Carro
    public Carro(String placa, float hodometro, float consumo, float capacidadeTanque, float dispoCombustivel) {
        this.placa = placa;
        this.hodometro = hodometro;
        this.consumo = consumo;
        this.capacidadeTanque = capacidadeTanque;
        this.dispoCombustivel = dispoCombustivel;
    }


    // getters e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getHodometro() {
        return hodometro;
    }

    public void setHodometro(float hodometro) {
        this.hodometro = hodometro;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public float getDispoCombustivel() {
        return dispoCombustivel;
    }

    public void setDispoCombustivel(float dispoCombustivel) {
        this.dispoCombustivel = dispoCombustivel;
    }

    // Método para abastecer o carro
    public void abastecer(float quantCombsutivel) {
        if (quantCombsutivel > 0) {
            float totalCombustivel = this.dispoCombustivel + quantCombsutivel;
            if (totalCombustivel > this.capacidadeTanque) {
                JOptionPane.showMessageDialog(null, "Quantidade de combustível maior que a capacidade do tanque");
            } else {
                this.dispoCombustivel = totalCombustivel;
                JOptionPane.showMessageDialog(null, "Tanque abastecido com sucesso! Disponibilidade de combustível atual: " + this.dispoCombustivel);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantidade de combustível inválida");
        }
    }

    // Método para percorrer 
    public void percorrer(float distancia) {
        if (distancia > 0) {
            float combustivelUsado = distancia / this.consumo;
            if (combustivelUsado > this.dispoCombustivel){
                JOptionPane.showMessageDialog(null, "Não há combustível suficiente para percorrer essa distância");
            }
            else{
                this.dispoCombustivel -= combustivelUsado;
                this.hodometro += distancia;
                JOptionPane.showMessageDialog(null, "O carro percorreu essa distância com sucesso! Nova quilometragem : " + this.hodometro);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Distância inválida");
        }
    }
    // Método que mostra todas as informações
    public void informacoes(){
        JOptionPane.showMessageDialog(null, " Placa : " + this.placa + "\n Hodometro : " + this.hodometro + "\n Consumo do veículo : " + this.consumo
                + "\n Capacidade do tanque do veículo : " + this.capacidadeTanque + "\n uantidade de combustível disponível : " + this.dispoCombustivel);
    }
}
