/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package daos.singletons;

import daos.Informe.DaoInforme;


/**

 @author Fernando
 */
public class InformeSingleton
{
     private final static String CLASS_NAME_PARAMETER = DaoInforme.class.getName();
    private static DaoInforme dao = null;


    private InformeSingleton() {

    }

    @SuppressWarnings("rawtypes")
    private static DaoInforme getInstance() {
        try {
 
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return new DaoInforme();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    
     public synchronized static DaoInforme getDao() {

        if (dao == null) {
            dao = getInstance();
        }
        return dao;
    }
}

