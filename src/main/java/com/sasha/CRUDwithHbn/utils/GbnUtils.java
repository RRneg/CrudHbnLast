package com.sasha.CRUDwithHbn.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GbnUtils {

    private static SessionFactory sessionFactory;

    private static SessionFactory getSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }

    private static void closeSessionFectory() {
        sessionFactory.close();
    }

}
