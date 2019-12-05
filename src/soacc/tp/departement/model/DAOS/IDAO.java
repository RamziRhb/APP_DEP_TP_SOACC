package soacc.tp.departement.model.DAOS;

import java.util.LinkedList;

public interface IDAO {
    boolean ajouter(Object o);
    boolean modifier(Object o);
    boolean supprimer(Object o);
    Object getById(int id);
    LinkedList<Object> getAll();
}
