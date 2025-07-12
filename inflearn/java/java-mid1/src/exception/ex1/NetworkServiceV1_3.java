package exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data){
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String defaultMsg = "[NetworkException] errorCode: ";
        String conRslt = client.connect();
        if(isError(conRslt)){
            System.out.println(defaultMsg + conRslt);
        } else {
            String sendResult = client.send(data);
            if(isError(sendResult)){
                System.out.println(defaultMsg + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !"success".equals(resultCode);
    }
}
