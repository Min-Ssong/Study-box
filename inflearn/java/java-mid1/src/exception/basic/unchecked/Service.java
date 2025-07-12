package exception.basic.unchecked;

import exception.basic.checked.MyCheckedException;

public class Service {
    Client client = new Client();

    public void callCatch(){
        try{
            client.call();
        } catch (MyUncheckedException e){
            System.out.println("Exception, message=" + e.getMessage());
        }
        System.out.println("Normal Logic");
    }

    public void callThrow(){
        client.call();
    }
}
