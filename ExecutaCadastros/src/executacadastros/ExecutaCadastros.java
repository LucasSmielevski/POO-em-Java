/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executacadastros;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Lucas
 */
public class ExecutaCadastros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> cidades= new ArrayList<>();
        
        Scanner ler= new Scanner(System.in);
        Scanner lerString= new Scanner(System.in);
        String nome="",cidade,sexo="";
        int Nmulheres=0;
        int Nhomens=0;
        int demenor=0;
        int fone=0,ano_nascimento=0;
        int nPe;
                
        Cadastro ec= new Cadastro();
        
        while (true) {            
            Menu();
            nPe= ler.nextInt();
            
            System.out.println("\n");
            switch (nPe){
                case 1:
                    System.out.println("Informe o Nome:");
                    nome= lerString.next();
                    System.out.println("Informe o telefone:");
                    fone= ler.nextInt();
                    ec.visitante();
                    System.out.println("Informe a cidade:");
                    cidade= lerString.next();
                    if (cidades.contains(cidade)){
                    }
                    else{
                        cidades.add(cidade);
                    }
                    System.out.println("Informe o sexo (M ou F):");
                    sexo= lerString.next();
                    System.out.println("Informe ano de nascimento:");
                    ano_nascimento= ler.nextInt();
                    break;
                case 2:     
                    System.out.println("Número total de visitantes: " + ec.getFone());
                    System.out.println("Número de homens: " + Nhomens );
                    System.out.println("Número de mulheres: " + Nmulheres);
                    System.out.println("Percentual de homens: " + (Nhomens*100)/ec.getFone()+"%");
                    System.out.println("Percentual de mulheres: " +(Nmulheres*100)/ec.getFone()+"%");
                    System.out.println("Número de visitantes com menos de 18 anos: " + demenor);
                    System.out.println("Número de cidades: " + cidades.size());
                    System.out.println("\n--Programa Finalizado--\n");
                    break;
                default:
                    System.out.println("\n ---Número Inválido---");
                    break;
            }
           
            
       if(nPe==2)
                break; 
        if( "F".equals(sexo))
            Nmulheres++;
        else if("M".equals(sexo))
            Nhomens++;
        if(ano_nascimento>=2005)
            demenor++;
}
        
        
    }
    
     private static void Menu(){
    System.out.printf("\n > Menu ");
    System.out.printf("\n  1- Adiciona Cadastro ");
    System.out.printf("\n  2- Terminar e mostrar dados ");
    System.out.printf("\n > Resposta: ");
  }
}
