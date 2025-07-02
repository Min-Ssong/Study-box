package exception.ex0;

public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address){
        this.address = address;
    }

    public String connect(){
        System.out.println(address + " server connect Ok");
        return "success";
    }

    public String send(String data){
        System.out.println(address + " send server data: " + data);
        return "success";
    }

    public void disconnect(){
        System.out.println(address + " server disconnect");
    }
}
