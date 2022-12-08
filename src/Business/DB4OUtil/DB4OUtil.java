package Business.DB4OUtil;

import Business.EcoSystem;
import Business.Configuration;
import com.db4o.ObjectContainer;
import com.db4o.Db4oEmbedded;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ObjectSet;
import java.nio.file.Paths;
import com.db4o.ta.TransparentPersistenceSupport;


/**
 *
 * @author anirudhnegi
 **/
public class DB4OUtil {
    private static DB4OUtil dB4OUtil;
    // path to the data
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) 
        {
            dB4OUtil = new DB4OUtil();
        }
        
        return dB4OUtil;
    }
    protected synchronized static void shutdown (ObjectContainer conn) {
        if (conn != null) 
        {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            
            config.common().add(new TransparentPersistenceSupport());
         
            config.common().activationDepth(Integer.MAX_VALUE);
           
            config.common().updateDepth(Integer.MAX_VALUE);

           // Change to the object which is to be saved
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); 

            ObjectContainer db=  Db4oEmbedded.openFile(config, FILENAME);
            
            return db;
        } catch (Exception ex) 
        {
            
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem (EcoSystem system) {
        
        ObjectContainer conn = createConnection();
        
        conn.store(system);
        
        conn.commit();
        
        conn.close();
    
    }

    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        
        // Change to the object which is to be saved
        ObjectSet<EcoSystem>  systems =  conn.query(EcoSystem.class); 
        
        EcoSystem system;
        
        if (systems.size() == 0)
        {
           // If no record present in the system, a new record will be added
            system = Configuration.configure();  
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        
        return system;
    }
}
