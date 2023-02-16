public class Utils {
    public static boolean[][] randomField(int X, int Y, double p) {
        boolean[][] a = new boolean[X][Y];
        for (int i = 0; i < X; i++)
            for (int j = 0; j < Y; j++)
                a[i][j] = StdRandom.bernoulli(p);
        return a;
    }
}
