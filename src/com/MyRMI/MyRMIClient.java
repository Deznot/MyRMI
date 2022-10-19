package com.MyRMI;

import java.rmi.*;

public class MyRMIClient {
    public static void main(String[] args) {
        new MyRMIClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote Hello");

            String s = service.sayHello();
    
            System.out.println(s);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public interface MyRemote extends Remote {
        /*remote - interface-marker it has'nt methods 
         * the interface must announce that it's for remote method calls. An interface can't implement anything
         * but it can extend other interface
        */
        public String sayHello() throws RemoteException;
    }
   
}