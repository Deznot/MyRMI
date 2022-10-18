package com.MyRMI;

import java.rmi.*;
import java.rmi.server.*;

import com.MyRMI.MyRMIClient.MyRemote;

public class MyRMIServer {
    public static void main(String[] args) {
        
    }

    public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
        public String sayHello() {
            return "Server saying Hi";
        }
    }
}
