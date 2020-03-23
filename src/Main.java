import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String kv[] = AuthorizationUtils.authKV("自己的用户名", "自己的密码");
        System.out.println(kv[0]+" "+kv[1]);
    }
}
