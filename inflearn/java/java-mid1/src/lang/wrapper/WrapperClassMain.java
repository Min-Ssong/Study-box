package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("Read");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("equals");
        System.out.println("==:" + ( newInteger == integerObj ));
        System.out.println("equals:" + newInteger.equals(integerObj));
    }
}
//newInteger = 10
//integerObj = 10
//longObj = 100
//doubleObj = 10.5
//Read
//intValue = 10
//longValue = 100
//equals
//==:false
//equals:true