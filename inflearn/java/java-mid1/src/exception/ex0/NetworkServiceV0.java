package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessag(String data){
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
