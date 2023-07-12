package encryption;

import java.util.Arrays;
import java.util.Random;

public class Encryption {

    public static void main(String[] args) {

        String original = "opelka4056";
        System.out.println(original);

        KeyPair kp = encrypt(original);

        String decOriginal = decrypt(kp);
        System.out.println(decOriginal);

    }

    public static byte[] randomKey(int length){

        byte[] dummy = new byte[length];
        Random random = new Random();
        random.nextBytes(dummy);

        return dummy;
    }


    public static KeyPair encrypt(String original){

        byte[] originalBytes = original.getBytes();
        byte[] dummy = randomKey(originalBytes.length);
        byte[] encryptedKey = new byte[originalBytes.length];

        for(int i = 0; i< originalBytes.length; i++){

            encryptedKey[i] = (byte) (originalBytes[i] ^ dummy[i]);

        }

        System.out.println(new String(encryptedKey));
        return new KeyPair(dummy,encryptedKey);
    }

    public static String decrypt(KeyPair kp){

        if(kp == null){
            return "";
        }

        byte[] dummy = kp.key1;
        byte[] encryptedKey = kp.key2;
        byte[] decrypted = new byte[kp.key1.length];

        for(int i = 0; i < decrypted.length; i++){

            decrypted[i] = (byte) (dummy[i] ^ encryptedKey[i]);

        }

        return new String(decrypted);
    }



}
