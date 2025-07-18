package exception.ex4.exception;

public class NetworkServiceV5 {
    public void sendMessage(String data){
        String address = "https://example.com";

        try(NetworkClientV5 client = new NetworkClientV5(address)){
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[Exception Check]: " + e.getMessage());
            throw e;
        }
    }
}
