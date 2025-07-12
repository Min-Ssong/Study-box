package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch(){
        try {
            client.call();
        } catch (MyCheckedException e){
            System.out.println("Exception, message=" + e.getMessage());
        }
        System.out.println("Normal Flow");
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
