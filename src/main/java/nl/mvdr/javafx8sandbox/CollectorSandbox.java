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
        List<String> names = Arrays.asList("Jan", "Klaas", "Piet");

        String string = names
                .parallelStream()
                .collect(CollectorSandbox::supply, CollectorSandbox::accumulate, CollectorSandbox::combine)
                .toString();
        System.out.println(string);
    }
    
    /**
     * Supplies a new string builder.
     * 
     * @return
     */
    private static StringBuilder supply() {
        System.out.println("Creating new string buffer.");
        return new StringBuilder();
    }
    
    /**
     * Accumulates the given string into the given string builder.
     * 
     * @param builder builder
     * @param string string
     */
    private static void accumulate(StringBuilder builder, String string) {
        System.out.println("Appending to " + builder + ": " + string);
        builder.append(string);
    }
    
    /**
     * Accumulates the given string into the given string builder.
     * 
     * @param builder builder
     * @param string string
     */
    private static void combine(StringBuilder builder0, StringBuilder builder1) {
        System.out.println("Combining " + builder0 + " and " + builder1);
        builder0.append(builder1);
    }
}
