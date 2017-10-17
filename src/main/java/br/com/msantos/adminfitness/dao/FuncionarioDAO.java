package br.com.msantos.adminfitness.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import br.com.msantos.adminfitness.domain.Funcionario;
import br.com.msantos.adminfitness.util.HibernateUtil;

public class FuncionarioDAO extends GenericDAO<Funcionario>{

	@SuppressWarnings("unchecked")
	public List<Funcionario> listarOrdenado() {

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Funcionario.class);
			consulta.createAlias("pessoa", "p");
			consulta.addOrder(Order.asc("p.nome"));
			List<Funcionario> resultado = consulta.list();
			return resultado;

		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
}
