package exception.ex3.exception;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if(connectError) {
            throw new ConnectExceptionV3(address, address + " server connection fail");
        }

        System.out.println(address + " server connection success");
    }

    public void send(String data) throws SendExceptionV3 {
        if(sendError) {
            throw new SendExceptionV3(data, address + " Failed to send data to server: " + data);
//            throw new RuntimeException("ex");
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
