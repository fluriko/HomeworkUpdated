package mate.academy.hw10;

// task 3: https://stepik.org/lesson/14513/step/8?unit=4147
public final class AsciiCharSequence implements CharSequence {
    private byte[] arrayOfBytes;
    private final int length;

    public AsciiCharSequence(byte[] arrayOfBytes) {
        this.arrayOfBytes = arrayOfBytes;
        this.length = arrayOfBytes.length;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public char charAt(int index) {
        return (char) arrayOfBytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int newLength = end - start;
        byte[] subSequence = new byte[newLength];
        for (int i = 0; i < subSequence.length; i++, start++) {
            subSequence[i] = arrayOfBytes[start];
        }
        return new AsciiCharSequence(subSequence);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append((char) arrayOfBytes[i]);
        }
        return result.toString();
    }
}
