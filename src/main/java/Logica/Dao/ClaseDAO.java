package Logica.Dao;

import Logica.Entidades.Clase;
import Logica.Entidades.Recurso;
import java.util.List;

/**
 *
 * @author Esteban
 */
public interface ClaseDAO { // FIXME corregir
    
    public void save(Clase c) throws PersistenceException;
    
    public Clase load(int id) throws PersistenceException;
    
    public List<Clase> loadClasesPA(int anio, int semestre) throws PersistenceException;
    
    public List<Recurso> loadRecursosConcedidos(int idCl) throws PersistenceException;
    
    public void saveRecursoConcedido(int idCl, int idRe) throws PersistenceException;
}
