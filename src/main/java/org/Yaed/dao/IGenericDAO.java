package org.Yaed.dao;



import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface IGenericDAO <T>{
    public T get (Class<T> cl, Integer id);
    T get (Class <T> cl, Long id );
    public T save (T object);
    public void update (T object);
    public void delete (T object);
    public List<T> query (String hsql, Map<String, Objects> params);

}
