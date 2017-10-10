package prime.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class EncriptaSenha {

    public static String encripta(String senha) {
        try {
            //digester criado com o algoritmo MD5.
            //Além desse, o Java suporta ainda MD2, SHA, SHA-1, SHA-256, SHA-384 e SHA-512
            MessageDigest digest = MessageDigest.getInstance("MD5");

            //o método update adiciona bytes a mensagem a ser criptografada
            digest.update(senha.getBytes());

            //cria-se um encoder para impedir que a senha encriptada apareca
            //com caracteres que costumam causar problemas em xml e alguns bancos de dados
            BASE64Encoder encoder = new BASE64Encoder();

            //o método digest.digest () retorna a mensagem encriptada
            //o método encoder.encode () substitui os caracteres problemáticos
            return encoder.encode(digest.digest());

        } catch (NoSuchAlgorithmException ns) {
            ns.printStackTrace();
            return senha;
        }
    }
}
