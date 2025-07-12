package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data){
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("[NetworkException] errorCode: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[NetworkException] errorCode: " + sendResult);
            return;
        }

        client.disconnect();
    }

    private boolean isError(String resultCode) {
        return !"success".equals(resultCode);
    }
}
