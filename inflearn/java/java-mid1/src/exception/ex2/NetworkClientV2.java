package exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if(connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " server connection fail");
        }

        System.out.println(address + " server connection success");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if(sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " Failed to send data to server");
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
