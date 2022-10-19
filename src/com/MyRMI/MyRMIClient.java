package com.MyRMI;

import java.rmi.*;
import com.MyRMI.MyRemoteInterface;

public class MyRMIClient {
    public static void main(String[] args) {
        new MyRMIClient().go();
    }

    public void go() {
        try {
            MyRemoteInterface service = (MyRemoteInterface) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String s = service.sayHello();
    
            System.out.println(s);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }   
}