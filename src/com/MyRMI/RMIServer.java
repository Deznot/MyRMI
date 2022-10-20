package com.MyRMI;

import com.MyRMI.MyRemoteInterface;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Properties;
import java.rmi.registry.*;

public class RMIServer {
    /*  Need to do available to remote clients. To do this by instantiating it and putting it into the RMI
        registry (which must be running or this line of code fails). When register the implementation object, the RMI system actually puts the stub in
        the registry, since that's what the client really needs. Register service using the static rebind() method of the java.rmi.Naming class
    */
    public static void main(String[] args) {
        try {
            //Set hostname for the server using javaProperty
            Properties p = System.getProperties();
            p.put("java.rmi.server.hostname", "127.0.0.1");
            System.setProperties(p);

            MyRemoteInterface service = new MyRemoteImpl();

            MyRemoteInterface stub1 = (MyRemoteInterface) UnicastRemoteObject.exportObject(service, 0);

            /*
             * register the exported class in RMI registry with some name 
             * client will use that name to get refetence of this exported object
             */

            //Get the registry  to register the object.
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8000);

            registry.rebind("first", stub1);

        }catch(Exception ex) {
            System.out.println("Some server error "+ ex);
            
        }
    }          
}
