package edu.ifba.app;

import java.util.List;

import edu.ifba.model.Aluno;
import edu.ifba.repository.AlunoRepository;

// Testando o respository SEM a camada service
public class App2 {
    public static void main(String[] args) {
        AlunoRepository alunoRepository = new AlunoRepository();

        // TESTANDO SALVAR...
        Aluno aluno = new Aluno(0, "Maria", "1234");
        alunoRepository.salvar(aluno); 

        // TESTANDO BUSCAR TODOS
        // List<Aluno> lista = alunoRepository.buscarTodos();
        // for (Aluno a : lista) {
        //     System.out.println(a);
        // }

        // TESTANDO BUSCAR POR ID
        // Aluno alunoBuscado = alunoRepository.buscarPorId(4);
        // System.out.println("Aluno buscado pelo ID: " + alunoBuscado);

        // TESTANDO BUSCAR POR MATRICULA
        // Aluno alunoBuscado = alunoRepository.buscarPorMatricula("123456");
        // System.out.println("Aluno buscado pela matricula: " + alunoBuscado);

        // TESTANDO BUSCAR POR NOME COM LIKE
        // List<Aluno> lista = alunoRepository.buscarPorNomeComLike("%d%");
        // for (Aluno a : lista) {
        // System.out.println(a);
        // }

        // TESTANDO EXISTÊNCIA
        // boolean existe = alunoRepository.buscarPorId(4) != null;
        // System.out.println("Aluno existe? " + existe);

        // TESTANDO DELETAR
        // alunoRepository.deletar(2);
        // System.out.println("Aluno deletado com sucesso!");

        // TESTANDO ATUALIZAR
        // Aluno alunoBuscado = alunoRepository.buscarPorId(5);
        // alunoBuscado.setNome("Alana Alterada");
        // alunoRepository.atualizar(alunoBuscado);
        // System.out.println("Aluno atualizado com sucesso!");

    }
}