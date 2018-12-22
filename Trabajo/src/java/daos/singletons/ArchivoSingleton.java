package daos.singletons;

import daos.Archivo.DaoArchivo;

/**

 @author Rodrigo
 */
public class ArchivoSingleton
{
    private final static String CLASS_NAME_PARAMETER = DaoArchivo.class.getName();
    private static DaoArchivo dao = null;

    private ArchivoSingleton()
    {
    }

    @SuppressWarnings("rawtypes")
    private static DaoArchivo getInstance()
    {
        try
        {
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return new DaoArchivo();
        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public synchronized static DaoArchivo getDao()
    {
        if(dao == null)
            dao = getInstance();
        return dao;
    }
}
