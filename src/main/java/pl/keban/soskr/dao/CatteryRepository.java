package pl.keban.soskr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import pl.keban.soskr.domain.Cattery;

@Repository
public class CatteryRepository {

	@PersistenceContext
	private EntityManager em;

	public Long save(Cattery cattery) {
		em.merge(cattery);
		return cattery.getId();
	}

	public List<Cattery> getCatteryList() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Cattery> searchQuery = cb.createQuery(Cattery.class);
        Root<Cattery> searchRoot = searchQuery.from(Cattery.class);
        searchQuery.select(searchRoot);
        TypedQuery<Cattery> list = em.createQuery(searchQuery);
        return list.getResultList();
	}

	public Cattery findCatteryById(long id) {
		Cattery cattery = (Cattery) em.find(Cattery.class, id);
		return cattery;
	}

	public void delete(long id) {
		Cattery cattery = findCatteryById(id);
		em.remove(cattery);
	}

}
