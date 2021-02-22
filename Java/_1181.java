import java.util.Scanner;  
import java.util.Arrays; 
import java.util.LinkedHashSet; 
import java.util.Iterator; 
import java.util.Comparator; 

public class _1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
        String[] words = new String[N];
        sc.nextLine();
        for (int i=0; i<N; i++) 
            words[i] = sc.nextLine(); 

        Arrays.sort(words, new CustomComparator()); 

        // Remove duplicates
        LinkedHashSet<String> unique_words = new LinkedHashSet<String>();
        for (int i=0; i<words.length; i++) 
            unique_words.add(words[i]);

        Iterator itr = unique_words.iterator();
        while (itr.hasNext())
            System.out.println(itr.next()); 
    }

    private static void swap(String[] words, int a, int b) {
        String temp = words[a];
        words[a] = words[b];
        words[b] = temp; 
    }
}
class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) 
            return -1; 
        else if (s1.length() == s2.length() && s1.compareTo(s2) < 0)  
            return -1;
        else if (s1.compareTo(s2) == 0)
            return 0;
        else 
            return 1; 
    }
}