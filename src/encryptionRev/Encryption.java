package encryptionRev;

import java.util.Random;

public class Encryption {

    public static byte[] getDummy(int length){
        Random random = new Random();
        byte[] dummy = new byte[length];
        random.nextBytes(dummy);
        return dummy;
    }

    public static KeyPair encrypt(String original){
        byte[] originalBytes = original.getBytes();
        byte[] dummyKey = getDummy(originalBytes.length);
        byte[] encryptedKey = new byte[originalBytes.length];

        for(int i = 0; i < originalBytes.length; i++){

            encryptedKey[i] = (byte) (originalBytes[i] ^ dummyKey[i]);

        }
        System.out.println(new String(encryptedKey));
        return new KeyPair(dummyKey, encryptedKey);

    }

    public static String decrypt(KeyPair kp){
        byte[] dummyKey = kp.k1;
        byte[] encryptedKey = kp.k2;
        byte[] decrypted = new byte[encryptedKey.length];

        for(int i = 0; i < encryptedKey.length; i++){

            decrypted[i] = (byte) (dummyKey[i] ^ encryptedKey[i]);

        }
        return new String(decrypted);
    }

    public static void main(String[] args) {

        String original = "password";
        System.out.println(original);

        KeyPair kp = encrypt(original);

        String decrypt = decrypt(kp);
        System.out.println(decrypt);


    }


}
