package com.uespi_cc2025_2.cadastro_alunos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    //metodos
    private String matricula;
    private String nome;
    private int idade;
    private Date dataNascimento;
    private String telefone;
    private String cpf;
    
    //constructor
    Aluno() {
        
    }
    
    //setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //getters
    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getDataNascimento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.dataNascimento);
    }

    public String getTelefone() {
        return this.telefone;
    }
    
    public String getCpf() {
        return this.cpf;
    }
}
