package h3;


	import java.util.HashMap;
	
	public class H3_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		  
		        // Bsp
		        int[] a = {1, 2, 3};
		        int[] b = {1, 2, 4};
		        int[] c = {1, 3, 2};
		        int[] d = {1, 2};
		        int[] e = {1, 2, 3};
		        int[] f = {1, 1, 2};

		        //compareArraysVal mit verschiedenen Arrays
		        System.out.println(compareArraysVal(a, b)); // false
		        System.out.println(compareArraysVal(a, e)); // true
		        System.out.println(compareArraysVal(a, c)); // true
		        System.out.println(compareArraysVal(a, d)); //false
		        System.out.println(compareArraysVal(e, f)); //  false
		    }

		    // Vergleichen der Arrays basierend auf Werten und Häufigkeiten
		    public static boolean compareArraysVal(int[] a, int[] b) {
		        // Wenn die Arrays unterschiedliche Längen haben, sind sie nicht gleich
		        if (a.length != b.length) {
		            return false;
		        }

		        // HashMaps für  Häufigkeit der Werte in Arrays
		        HashMap<Integer, Integer> countA = new HashMap<>();
		        HashMap<Integer, Integer> countB = new HashMap<>();

		        // Zählen Häufigkeit der Werte Array a
		        for (int num : a) {
		            countA.put(num, countA.getOrDefault(num, 0) + 1);
		        }

		        // Zählen Häufigkeit der Werte Array b
		        for (int num : b) {
		            countB.put(num, countB.getOrDefault(num, 0) + 1);
		        }

		        // Vergleich beider HashMaps
		        return countA.equals(countB);
		    
		

		
	}}


