package ejercicioJavaInterfaces;

import java.util.List;

public interface CocheCRUD {

    public void save(Coche coche);
    List<Coche> findAll();

    void delete(Coche coche);
}
