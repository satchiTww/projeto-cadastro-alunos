package com.uespi_cc2025_2.cadastro_alunos;

import java.util.List;

public class RemocaoAlunoDAO implements AlunoDAO {

    @Override
    public List removerAluno(List alunos, Aluno a) {
        alunos.remove(a);
        return alunos;
    }
}