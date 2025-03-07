package edu.ifba.repository;

import java.util.List;

import edu.ifba.model.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class AlunoRepository implements AlunoRepositoryInterface {
    private static EntityManagerFactory fabrica = FabricaConexao.getEntityManagerFactory();
    private EntityManager em;

    @Override
    public void salvar(Aluno aluno) {
        em = fabrica.createEntityManager();
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deletar(int id) {
        em = fabrica.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Aluno.class, id));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void atualizar(Aluno aluno) {
        em = fabrica.createEntityManager();
        em.getTransaction().begin();
        em.merge(aluno);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Aluno> buscarTodos() {
        em = fabrica.createEntityManager();
        List<Aluno> alunos = em.createQuery("SELECT a FROM Aluno a", Aluno.class).getResultList();
        em.close();

        return alunos;
    }

    @Override
    public Aluno buscarPorId(int id) {
        em = fabrica.createEntityManager();
        Aluno alunoEncontrado = em.find(Aluno.class, id);
        em.close();
        return alunoEncontrado;
    }

    @Override
    public Aluno buscarPorMatricula(String matricula) {
        em = fabrica.createEntityManager();
        Aluno alunoEncontrado = em.createQuery("SELECT a FROM Aluno a WHERE a.matricula = :matricula", Aluno.class)
                .setParameter("matricula", matricula)
                .getSingleResultOrNull();

        em.close();
        return alunoEncontrado;
    }

    @Override
    public List<Aluno> buscarPorNomeComLike(String nome) {
        em = fabrica.createEntityManager();
        List<Aluno> alunos = em.createQuery("SELECT a FROM Aluno a WHERE a.nome LIKE :nome", Aluno.class)
                .setParameter("nome", nome)
                .getResultList();
        em.close();
        return alunos;
    }

}
