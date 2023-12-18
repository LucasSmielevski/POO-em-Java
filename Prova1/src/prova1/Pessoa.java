/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author patyx
 */
public class Pessoa {

    String nome, sexo, ano_nascimentoo;
    Date ano_nascimento;
    float salario, peso, altura;

    public Pessoa(String nome, String sexo, String ano_nascimentoo, float salario, float peso, float altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.ano_nascimentoo = ano_nascimentoo;
        this.salario = salario;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa() {

    }

    private List<Pessoa> Tpessoas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAno_nascimento() {
        return ano_nascimento;
    }

    public void convertAno_nascimento() throws ParseException {
        Date niver = new SimpleDateFormat("dd/MM/yyyy").parse(this.ano_nascimentoo);
        this.ano_nascimento = niver;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String printInformaçoes() {
        return String.format(" Nome: %s \n Nascimento: %s \n Salario: %.2f \n Peso: %.2f \n Altura: %.2f \n", this.nome, this.ano_nascimentoo, this.salario, this.peso, this.altura);
    }

    public String getIdade() throws ParseException {
        convertAno_nascimento();
        LocalDate dataAtual= LocalDate.now();
        LocalDate nascimento = ano_nascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period periodo = Period.between(nascimento, dataAtual);
        return String.format(" Idade: %s", periodo.getYears());
    }

    public float getCalculaImc() {
        float imc = this.peso / (altura * altura);
        return imc;
    }

    public int getNcadastros() {
        return Tpessoas.size();
    }

    public String getHomensMulheres() {
        int qntdMulheres = 0;
        int qntdHomens = 0;
        for (int i = 0; i < Tpessoas.size(); i++) {
            if (Tpessoas.get(i).getSexo().equals("F")) {
                qntdMulheres++;
            } else if (Tpessoas.get(i).getSexo().equals("M")) {
                qntdHomens++;
            }
        }
        return String.format(" Número de homens: %s \n Número de mulheres: %s", qntdHomens, qntdMulheres);
    }

    public String getTodosSalariosEMedia() {
        float salários = 0;
        float media_Salarial;
        for (int i = 0; i < Tpessoas.size(); i++) {
            salários += Tpessoas.get(i).salario;
        }

        media_Salarial = salários / Tpessoas.size();
        return String.format(" Acumulo de salario: %.2f \n Media Salarial: %.2f ", salários, media_Salarial);
    }

    public void addObject(Pessoa pessoa) {
        Tpessoas.add(pessoa);
    }

    public Pessoa getPessoa(int index) {
        return Tpessoas.get(index);
    }

}
