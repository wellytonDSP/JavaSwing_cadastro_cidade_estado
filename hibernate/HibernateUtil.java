/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senaccadastros.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author wellyton.0957
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory
            = buildSessionFactory();
    private static Session session = null;
    
    private static SessionFactory buildSessionFactory(){
        return new Configuration().configure().buildSessionFactory();
    }
    
    public static Session getSession(){
        if(session == null || !session.isOpen()){
            session = sessionFactory.openSession();
        }
        return session;
    }
    
}
