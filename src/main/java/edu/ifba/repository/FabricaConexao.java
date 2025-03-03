package edu.ifba.repository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FabricaConexao {

    private static final EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");

    public static EntityManagerFactory getEntityManagerFactory() {
        return fabrica;
    }

}