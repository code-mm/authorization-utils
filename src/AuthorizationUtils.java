

public class AuthorizationUtils {


    public static String auth(String username, String password) throws Exception {
        String authString = username + ":" + password;
        byte[] authEncBytes = EncryptionUtilsImpl.Base64.encode(authString.getBytes("utf-8"));
        String authStringEnc = new String(authEncBytes);
        return authStringEnc;
    }

    public static String[] authKV(String username, String password) throws Exception {
        String[] strings = new String[2];
        String auth = auth(username, password);
        strings[0] = "Authorization";
        strings[1] = "Basic " + auth;
        return strings;
    }
}
