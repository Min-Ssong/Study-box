package exception.ex2;

public class NetworkServiceV2_4 {
    public void sendMessage(String data){
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try{
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[Exception] Code: " + e.getErrorCode() + " , Message: " + e.getMessage());
        }

        client.disconnect();
    }
}
