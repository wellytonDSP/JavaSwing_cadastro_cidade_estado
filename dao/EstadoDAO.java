/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senaccadastros.dao;

import br.pr.senaccadastros.model.Estado;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rsdav
 */
public class EstadoDAO extends AbstractDAO {

    public List<Estado> buscarTodos() throws Exception {
        Criteria criteria = getSession().createCriteria(Estado.class);
        //criteria.addOrder(Order.asc("codigo_estado"));
        criteria.addOrder(Order.asc("nomeEstado"));
        return criteria.list();
    }

    public List<Estado> buscarPorNome(String nome) throws Exception {
        Criteria criteria = getSession().createCriteria(Estado.class);
        criteria.add(Restrictions.ilike("nomeEstado", "%" + nome + "%"));
        criteria.addOrder(Order.asc("nomeEstado"));
        return criteria.list();
    }

}
