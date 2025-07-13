package exception.ex4.exception;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV4 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect(){
        if(connectError) {
            throw new ConnectExceptionV4(address, address + " server connection fail");
        }

        System.out.println(address + " server connection success");
    }

    public void send(String data){
        if(sendError) {
            throw new SendExceptionV4(data, address + " Failed to send data to server: " + data);
        }
        System.out.println(address + " Success to send data to server: " + data);
    }

    public void disconnect(){
        System.out.println(address + " disconnection to server");
    }

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }

        if(data.contains("error2")){
            sendError = true;
        }
    }
}