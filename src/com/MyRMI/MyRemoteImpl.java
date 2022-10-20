package com.MyRMI;

import java.rmi.*;
import java.rmi.server.*;
import com.MyRMI.MyRemoteInterface;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemoteInterface {
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

    public static void main(String[] args) {
    }
}
