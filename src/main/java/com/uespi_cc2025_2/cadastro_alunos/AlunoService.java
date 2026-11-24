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

    // Consultar lista de alunos
    public List<Aluno> getAlunos() {
        return alunos;
    }

}
