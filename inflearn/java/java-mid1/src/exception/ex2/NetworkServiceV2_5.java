package exception.ex2;

public class NetworkServiceV2_5 {
    public void sendMessage(String data){
        String address = "https://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try{
            client.connect();
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[Exception] Code: " + e.getErrorCode() + " , Message: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
