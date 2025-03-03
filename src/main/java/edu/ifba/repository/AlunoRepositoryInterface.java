package edu.ifba.repository;

import java.util.List;

import edu.ifba.model.Aluno;


public interface AlunoRepositoryInterface {
   void salvar(Aluno aluno);

   void deletar(int id);

   void atualizar(Aluno aluno);

   List<Aluno> buscarTodos();

   Aluno buscarPorId(int id);

   Aluno buscarPorMatricula(String matricula);

   List<Aluno> buscarPorNomeComLike(String nome);

}