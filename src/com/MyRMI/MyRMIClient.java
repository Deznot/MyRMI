package com.MyRMI;

import java.rmi.*;

public class MyRMIClient {
    public static void main(String[] args) {
        
    }
    public interface MyRemote extends Remote {
        /*remote - interface-marker it has'nt methods 
         * the interface must announce that it's for remote method calls. An interface can't implement anything
         * but it can extend other interface
        */
        public String sayHello() throws RemoteException;
    }
   
}