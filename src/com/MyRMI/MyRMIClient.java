package com.MyRMI;

import java.rmi.*;

public class MyRMIClient {
    public static void main(String[] args) {
        
    }
    public interface MyRemote extends Remote {
        public String sayHello() throws RemoteException;
    }
   
}