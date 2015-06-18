package com.br.questquadirx.util.infra;




import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

public abstract interface Dao<T> extends Serializable
{
  public abstract String countFindByFilters(Object[] paramArrayOfObject);

  public abstract void delete(Serializable paramSerializable);

  public abstract List<?> find(String paramString, Object[] paramArrayOfObject);

  public abstract List<?> find(String paramString, Paginacao paramPaginacao, Object[] paramArrayOfObject);

  public abstract List<T> findAll();

  public abstract List<T> findAll(Paginacao paramPaginacao);

  public abstract List<T> findByFilters(Object[] paramArrayOfObject);

  public abstract T findById(Serializable paramSerializable);

  public abstract List<T> findByNamedParams(String paramString, Map<String, Object> paramMap);

  public abstract List<T> findByNamedParams(String paramString, Paginacao paramPaginacao, Map<String, Object> paramMap);

  public abstract List<?> findByNamedParamsHql(String paramString, Map<String, Object> paramMap);

  public abstract List<T> findByNamedQuery(String paramString, Object[] paramArrayOfObject);

  public abstract List<T> findByNamedQuery(String paramString, Paginacao paramPaginacao, Object[] paramArrayOfObject);

  public abstract List<T> findByNativeQuery(String paramString, Object[] paramArrayOfObject);

  public abstract List<?> findObjectsByNativeQuery(String paramString, Object[] paramArrayOfObject);

  public abstract List<T> findByNativeQuery(String paramString, Paginacao paramPaginacao, Object[] paramArrayOfObject);

  public abstract List<T> findByNativeQueryNamedParams(String paramString, Map<String, Object> paramMap);

  public abstract List<T> findByNativeQueryNamedParams(String paramString, Paginacao paramPaginacao, Map<String, Object> paramMap);

  public abstract Object findSingleResult(String paramString, Object[] paramArrayOfObject);

  public abstract Object findSingleResultByNamedQuery(String paramString, Object[] paramArrayOfObject);

  public abstract EntityManager getEntityManager();

  public abstract void refresh(T paramT);

  public abstract void save(T paramT);

  public abstract void setHint(String paramString, boolean paramBoolean);

  public abstract void setMaxResults(Integer paramInteger);

  public abstract void setPersistentClass(Class<T> paramClass);

  public abstract void setStartingFrom(Integer paramInteger);

  public abstract void update(T paramT);

  public abstract void updateWithNativeQuery(String paramString, Object[] paramArrayOfObject);
}

