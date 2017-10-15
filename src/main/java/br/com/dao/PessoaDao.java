package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.entity.Pessoa;

public class PessoaDao {
	
	private static PessoaDao instance;
    protected EntityManager entityManager;
    
    public static PessoaDao getInstance(){
              if (instance == null){
                       instance = new PessoaDao();
              }
              
              return instance;
    }

    private PessoaDao() {
              entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
              EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
              if (entityManager == null) {
                       entityManager = factory.createEntityManager();
              }

              return entityManager;
    }

    public Pessoa getById(final int idPessoa) {
              return entityManager.find(Pessoa.class, idPessoa);
    }

    @SuppressWarnings("unchecked")
    public List<Pessoa> findAll() {
              return entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
    }

    public void persist(Pessoa pessoa) {
              try {
                       entityManager.getTransaction().begin();
                       entityManager.persist(pessoa);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }

    public void merge(Pessoa pessoa) {
              try {
                       entityManager.getTransaction().begin();
                       entityManager.merge(pessoa);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }

    public void remove(Pessoa pessoa) {
              try {
                       entityManager.getTransaction().begin();
                       pessoa = entityManager.find(Pessoa.class, pessoa.getId());
                       entityManager.remove(pessoa);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }

    public void removeById(final int id) {
              try {
                       Pessoa pessoa = getById(id);
                       remove(pessoa);
              } catch (Exception ex) {
                       ex.printStackTrace();
              }
    }


}
