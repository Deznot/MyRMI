package com.MyRMI;

import java.rmi.*;
import java.rmi.server.*;

import com.MyRMI.MyRMIClient.MyRemote;

public class MyRMIServer {
    public static void main(String[] args) {
        
    }

    public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
        /*In order to work as a remote service object, object needs some
            functionality related to 'being remote'. The simplest way is to extend
            UnicastRemoteObject 
        */
        public String sayHello() {
            return "Server saying Hi";
        }
    }
}
