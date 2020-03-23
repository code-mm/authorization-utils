

public class Main {


    public static void main(String[] args) throws Exception {

        String name = "xxxxxx@xxxx.com";

        String password = "xxxxxx";

        String authString = name + ":" + password;

        System.out.println("auth string: " + authString);

        byte[] authEncBytes = EncryptionUtilsImpl.Base64.encode(authString.getBytes("utf-8"));

        String authStringEnc = new String(authEncBytes);

        System.out.println(authStringEnc);



        // Authorization
        // Basic bWh3ODI4QHNpbmEuY29tOm1o

    }

}
