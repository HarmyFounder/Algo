package encryption;

public class KeyPair {

    public final byte[] key1;
    public final byte[] key2;

    public KeyPair(byte[] key1, byte[] key2) {
        this.key1 = key1;
        this.key2 = key2;
    }
}
