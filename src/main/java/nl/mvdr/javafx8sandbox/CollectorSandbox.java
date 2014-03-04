package nl.mvdr.javafx8sandbox;

import java.util.Arrays;
import java.util.List;

/**
 * Playing around with Collectors for fun. (Not really related to JavaFX.)
 * 
 * @author Martijn van de Rijdt
 */
public class CollectorSandbox {
    /**
     * Main method.
     * 
     * @param args command line parameters; these are ignored
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jan", "Klaas", "Piet", "Ton", "Kees", "Sjaak", "Herman", "en", "nog", "meer", "namen");

        long start = System.currentTimeMillis();
        
        String string = names
                .parallelStream()
                .collect(CollectorSandbox::supply, CollectorSandbox::accumulate, CollectorSandbox::combine)
                .toString();
        System.out.println(string);
        
        System.out.println("Time spent: " + (System.currentTimeMillis() - start) + "milliseconds.");
    }
    
    /**
     * Supplies a new string builder.
     * 
     * @return
     */
    private static StringBuilder supply() {
        System.out.println(Thread.currentThread().getName() + " - Creating new string buffer.");
        return new StringBuilder();
    }
    
    /**
     * Accumulates the given string into the given string builder.
     * 
     * @param builder builder
     * @param string string
     */
    private static void accumulate(StringBuilder builder, String string) {
        System.out.println(Thread.currentThread().getName() + " - Appending to " + builder + ": " + string);
        
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        builder.append(string);
    }
    
    /**
     * Accumulates the given string into the given string builder.
     * 
     * @param builder builder
     * @param string string
     */
    private static void combine(StringBuilder builder0, StringBuilder builder1) {
        System.out.println(Thread.currentThread().getName() + " - Combining " + builder0 + " and " + builder1);
        builder0.append(builder1);
    }
}
