/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaelevador;

/**
 *
 * @author Lucas
 */
public class Elebador {
    
//Variaveis 
  private int andar_atual, andar_total, capacidade, nPessoas; 
 
  //Classe principal
  public Elebador(int andar_atual, int andar_total, int capacidade, int nPessoas) {
    this.andar_atual   = andar_atual;
    this.andar_total   = andar_total;
    this.capacidade   = capacidade;
    this.nPessoas = nPessoas;
  } 
 
  //Get - Capacidade
   public int getCapacidade() {
        return capacidade;
    }
  //Get - Pessoas presentes
   public int getnPessoas() {
        return nPessoas;
    }
  //Get - Total de andares
  public int getAndar_total() {
        return andar_total;
    }
  //Get - Andar Atual
     public int getAndar_atual() {
        return andar_atual;
    }


 
 
 
    //Inicializa
    public void Inicializa(int andar_total, int capacidade) {
        this.andar_total = andar_total;
        this.capacidade = capacidade;
    }
    //Entra pessoa
        public void Entra(){
            this.nPessoas+=1;
        }
    //Sai pessoa
        public void Sai(){
            this.nPessoas-=1;
        }
    //Sobe de andar
        public void Sobe(){
            this.andar_atual+=1;
        }
    //Desce de andar
        public void Desce(){
            this.andar_atual-=1;
        }
    
    
    
}
