package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect(){
        if(connectError){
            System.out.println(address + " server connection fail");
            return "connectError";
        }

        System.out.println(address + " server connection success");
        return "success";
    }

    public String send(String data){
        if(sendError){
            System.out.println(address + " server send data fail: " + data);
            return "sendError";
        }

        System.out.println(address + " server send data: " + data);
        return "success";
    }

    public void disconnect(){
        System.out.println(address + " server disconnect");
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
