/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senaccadastros.dao;

import static br.pr.senaccadastros.hibernate.HibernateUtil.getSession;
import br.pr.senaccadastros.model.Cidade;
import br.pr.senaccadastros.model.Estado;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rsdav
 */
public class CidadeDAO extends AbstractDAO {

    public List<Cidade> buscarTodos() throws Exception {
        Criteria criteria = getSession().createCriteria(Cidade.class);
        //criteria.addOrder(Order.asc("codigo_estado"));
        criteria.addOrder(Order.asc("nomeCidade"));
        return criteria.list();
    }

    public List<Cidade> buscarPorNome(String nome) throws Exception {
        Criteria criteria = getSession().createCriteria(Cidade.class);
        criteria.add(Restrictions.ilike("nomeCidade", "%" + nome + "%"));
        criteria.addOrder(Order.asc("nomeCidade"));
        return criteria.list();
    }

}
