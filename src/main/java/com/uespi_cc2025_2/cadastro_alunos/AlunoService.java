package com.uespi_cc2025_2.cadastro_alunos;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    private List<Aluno> alunos = new ArrayList<>();

    // Cadastrar aluno
    public void cadastrarAluno(Aluno aluno) {

        // Verificar matriculas duplicadas
        for (Aluno a : alunos) {

            if (a.getMatricula().equals(aluno.getMatricula())) {

                throw new IllegalArgumentException(
                    "Matrícula já cadastrada!"
                );

            }
        }

        // Adicionar aluno na lista
        alunos.add(aluno);
    }

    //consultar quantidade de alunos
    public int getQtdAlunos() {
        return alunos.size();
    }
    
    // Consultar lista de alunos
    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    //receber string com informacoes de um aluno
    public String getAlunoInfo(Aluno a) {
        return "Matricula: " + a.getMatricula() + 
            "\nNome: " + a.getNome() +
            "\nIdade: " + a.getIdade() +
            "\nData de nascimento: " + a.getDataNascimento() +
            "\nTelefone: " + a.getTelefone() +
            "\nCPF: " + a.getCpf()
        ;
    }
}
