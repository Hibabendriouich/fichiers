package probB2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class good {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new FileReader("good.in"));
        PrintWriter w = new PrintWriter(new FileWriter("good.out"));

        int n = Integer.parseInt(r.readLine());
        System.out.println(System.getProperty("user.dir"));

        for (int i = 1; i <= n; i++) {
            int points = Integer.parseInt(r.readLine());
            long weightedSum = calculateWeightedSum(points);
            w.println(String.format("%d %d %d", i, points, weightedSum));
        }
        r.close();
        w.close();
    }

    public static long calculateWeightedSum(int points) {
        long somme = 0;
        for (int n = 1; n <= points; n++) {
            long triangularNumber = (long) (n + 1) * (n + 2) / 2;
            somme += (long) n * triangularNumber;
        }
        return somme;
    }
}
