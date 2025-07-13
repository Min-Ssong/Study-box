package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data){
        String address = "https://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try{
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e){
            System.out.println("[Exception] Address: " + e.getAddress() + ", Message: " + e.getMessage());
        } catch (SendExceptionV3 e){
            System.out.println("[Exception] Send Data: " + e.getSendData() + " , Message: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
