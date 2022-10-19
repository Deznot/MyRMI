package com.MyRMI;

import java.rmi.*;
import java.rmi.server.*;

import com.MyRMI.MyRMIClient.MyRemote;

public class MyRMIServer {
    public static void main(String[] args) {
        /*
         *  Need to do available to remote clients. To do this by instantiating it and putting it into the RMI
            registry (which must be running or this line of code fails). When register the implementation object, the RMI system actually puts the stub in
            the registry, since that's what the client really needs. Register service using the static rebind() method of the java.rmi.Naming class
         */
        try {
            MyRMIServer service = new MyRMIServer();
            Naming.rebind("Remote Hello", service);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        
    }

    public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
        /*In order to work as a remote service object, object needs some
            functionality related to 'being remote'. The simplest way is to extend
            UnicastRemoteObject 
        */
        /*
         * Need to declare a constructor for remote implementation,
         * just so that have a place to declare the RemoteException
         */
        public MyRemoteImpl() throws RemoteException{};
        public String sayHello() {
            return "Server saying Hi";
        }
    }
}
