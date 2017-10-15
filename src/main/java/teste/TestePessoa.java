package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.entity.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crudHibernatePU");
		
		EntityManager em = emf.createEntityManager();
		
		List<Pessoa> lista = em.createQuery("FROM Pessoa", Pessoa.class).getResultList();
		for(Pessoa pessoa: lista){
			System.out.println("Pessoa no Banco "+ pessoa.hashCode()+" "+ pessoa.getNome());
		}
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Cleiton");
		pessoa.setPessoacol("iniciante");
			
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();

		em.close();
		emf.close();


	}

}
