/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaelevador;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class ExecutaElevador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    Scanner sLer = new Scanner(System.in);
    int nPe, nTot, nCap;
    //objeto Elevador
    Elebador elev[]=new Elebador[1]; 
 
    elev[0]=new Elebador(0,0,0,0); 
 
    //Inicializando
    System.out.printf("Capacidade total de pessoas?\n"
            + ": ");
    nCap=sLer.nextInt();
    System.out.printf("Quantos andares?\n"
            + ": ");
    nTot=sLer.nextInt();
    elev[0].Inicializa(nTot,nCap);
 
    while(true){
      pintaMenu();
      nPe = sLer.nextInt();
       
 
      System.out.printf("\n\n");
      switch (nPe) {
       case 1:
        //só sobe se o andar atual for menor que o total
        if (elev[0].getAndar_atual()<elev[0].getAndar_total())
         elev[0].Sobe();
        else{
            System.out.println("Já está no último andar");
            //espera 2 segundos=
            try { Thread.sleep (1000); }
        catch (InterruptedException ex) {}
        }
       break;
       case 2:
        //só desce se o andar atual for maior que o terreo
        if (elev[0].getAndar_atual()>0)
         elev[0].Desce();
        else{
            System.out.println("Já está no terreo");
             try { Thread.sleep (1000); }
        catch (InterruptedException ex) {}
        }
       break;
       case 3:
        //só entra, se não tiver atingido a capacidade
        if (elev[0].getnPessoas()<elev[0].getCapacidade())
         elev[0].Entra();
        else{
            System.out.println("Número máximo de pessoas atingidas");
             try { Thread.sleep (1000); }
        catch (InterruptedException ex) {}
        }
       break; 
       case 4:
        //só sai, se houverem pessoas (>0)
        if (elev[0].getnPessoas()>0)
         elev[0].Sai();
        else{
            System.out.println("Não tem pessoas");
             try { Thread.sleep (1000); }
        catch (InterruptedException ex) {}
        }
       break;
       case 5:
        System.out.printf("Quantidade de Pessoas: %d\n",elev[0].getnPessoas());
        System.out.printf("Capacidade Suportada: %d\n",elev[0].getCapacidade());
        System.out.printf("Andar Atual: %d\n",elev[0].getAndar_atual());
        System.out.printf("Quantidade de Andares: %d\n",elev[0].getAndar_total());
        try { Thread.sleep (2000); }
        catch (InterruptedException ex) {}
       break;
       case 6:
        System.out.printf("Quantidade de Pessoas: %d\n",elev[0].getnPessoas());
        System.out.printf("Capacidade Suportada: %d\n",elev[0].getCapacidade());
        System.out.printf("Andar Atual: %d\n",elev[0].getAndar_atual());
        System.out.printf("Quantidade de Andares: %d\n",elev[0].getAndar_total());
        break;
       default:
        System.out.printf("\n --> Valor Incorreto <--");
       break;
      }
    if(nPe==0 || nPe==6)
        break; 
}
    System.out.printf("\n\nPrograma Finalizado!\n\n");
  } 
 
  //função mostra menu
  private static void pintaMenu(){
    System.out.printf("\n > Menu ");
    System.out.printf("\n  1- Sobe de Andar ");
    System.out.printf("\n  2- Desce de Andar ");
    System.out.printf("\n  3- Entra Pessoa ");
    System.out.printf("\n  4- Sai Pessoa ");
    System.out.printf("\n  5- Mostrar dados ");
    System.out.printf("\n  6- Mostrar dados e finalizar ");
    System.out.printf("\n  0- Sair ");
    System.out.printf("\n > Resposta: ");
  }
    }
    

