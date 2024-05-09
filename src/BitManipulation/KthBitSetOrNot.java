package BitManipulation;

class KthBitSetOrNot {
    public static void isKthBitSet(int n, int k) {
        if ((n & (1 << k)) != 0)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }

    public static void main(String[] args) {
        int n = 5, k = 1;

        isKthBitSet(n, k);
    }
}
