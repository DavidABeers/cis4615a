import java.math.BigInteger;

public class R04_STR03_J {

    public static void main(String []args){

        //noncompliant solution, attemps to convert bigint to string
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
    }

}
