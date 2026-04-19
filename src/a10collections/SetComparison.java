package a10collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {

	private static final char[] yes = null;

	public static void main(String[] args) {
		//Create a list of question numbers (as Strings) with deliberate duplicates
           List<String> questions = Arrays.asList("Q3", "Q1", "Q4", "Q1", "Q2", "Q3", "Q5", "Q2");
         
           //HashSet (no duplicates but random order)
          
           Set<String> hashSet = new HashSet<>(questions);
           System.out.println("HashSet (No duplicates, Random order):");
           System.out.println(hashSet);
           
           // LinkedHashSet(no duplicates with insertion order)
           Set<String> linkedHashSet = new LinkedHashSet<>(questions);
           System.out.println("\nLinkedHashSet (No duplicates, Insertion order):");
           System.out.println(linkedHashSet);

           // TreeSet (observe sorted alphabetical order)
            Set<String> treeSet = new TreeSet<>(questions);
            System.out.println("\nTreeSet(No dupilcates,Sorted order):");
            System.out.println(treeSet);
            
            //LinkedHashSet:if "Q3" is attempted using contains()
            linkedHashSet.contains("Q3");
            System.out.println("\nIs Q3 attempted? " + linkedHashSet.contains("Q3"));
            
            //removing linkedHashSe 
            linkedHashSet.remove("Q4");
            System.out.println("\nLinkedHashSet after removing Q4:");
            System.out.println(linkedHashSet);
            
            // size of each Set 
            System.out.println("\nSize of HashSet: " + hashSet.size());
            System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());
            System.out.println("Size of TreeSet: " + treeSet.size());

            
          
	}

}
