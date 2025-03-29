package probA;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class NbrOpposes {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("in.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        int n = Integer.parseInt(in.readLine());
        String[] nbrs = in.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(String nbr :nbrs) {
            int x = Integer.parseInt(nbr);
            set.add(x);
        }
        for(int i :set) {
            if(i>0 && set.contains(-i)) {
                count++;
            }
        }
        out.println(count);
        System.out.println(count);
        out.close();
        in.close();

    }
}
