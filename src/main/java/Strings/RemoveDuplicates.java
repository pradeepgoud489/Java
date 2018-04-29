package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public void duplicate(String str) {
        char[] c = str.toCharArray();
        HashSet<Character> s = new LinkedHashSet<Character>();
        for (char cc : c) {
            s.add(cc);
        }
        for (char ca:s) {
            System.out.print(ca);
        }
    }
    public static void main(String[] args) {
        RemoveDuplicates r=new RemoveDuplicates();
        r.duplicate("deep");
    }
}
