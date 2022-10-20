package com.MyRMI;

import java.rmi.*;
import com.MyRMI.MyRemoteInterface;
import java.rmi.registry.*;

public class MyRMIClient {
    public static void main(String[] args) {
        new MyRMIClient().go();
    }

    public void go() {
        try {
            //Locate the registry
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8010);
                
            //Get the reference of exported object from RMI Registry
            MyRemoteInterface first = (MyRemoteInterface) registry.lookup("first");

            //Now we can invoke the method of the referenced objects
            String response = first.sayHello();
            System.out.print(response);
        }catch(Exception ex) {
            System.out.println("Client side error " + ex);
        }
    }   
}