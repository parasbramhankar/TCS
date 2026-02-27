public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        int survivor = josephus(n, k);

        System.out.println("Survivor position (0-based): " + survivor);
        System.out.println("Survivor position (1-based): " + (survivor + 1));
    }

    public static int josephus(int n, int k) {
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }

        return result;
    }
}
