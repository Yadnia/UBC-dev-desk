package org.Yaed.services;


import org.Yaed.dao.IGenericDAO;

import java.io.Serializable;
import java.util.List;

public interface IGenericService <T> extends IGenericDAO <T> {
    List<T> getAll();
    void deleteAll();
    T getById (Serializable id);

    T getId (Long i);
    T getByName(String name);

}
