import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Test;

public class PropertiesEncode {

    @Test
    public void encode(){
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        //盐值
        standardPBEStringEncryptor.setPassword("n*YBh&*yGBYUG7g*TYNHJHJ89");
        //加密明文
        String code = standardPBEStringEncryptor.encrypt("123456");
        System.out.println("code=" + code);
        String code1 = standardPBEStringEncryptor.encrypt("admin");
        System.out.println("code1=" + code1);
        String code2 = standardPBEStringEncryptor.encrypt("http://admin:123456@127.0.0.1:11552/eureka");
        System.out.println("code2=" + code2);
    }

}
