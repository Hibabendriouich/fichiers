package probB;

import java.io.*;
import java.util.logging.*;

public class bin {
    private static final Logger logger = Logger.getLogger(bin.class.getName());

    public static void main(String[] args) {
        File inputFile = new File("bin.in.txt");
        File outputFile = new File("bin.out.txt");

        try (BufferedReader bf = new BufferedReader(new FileReader(inputFile))) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {

                int n = Integer.parseInt(bf.readLine().trim());

                for (int i = 1; i <= n; i++) {
                    String[] binaires = bf.readLine().split(" ");

                    int nbr1 = Integer.parseInt(binaires[0], 2);
                    int nbr2 = Integer.parseInt(binaires[1], 2);
                    int somme = nbr1 + nbr2;
                    String sommeBinaire = Integer.toBinaryString(somme);

                    pw.println(i + " " + sommeBinaire);
                }

            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred while processing the file.", e);
        }

    }
}
