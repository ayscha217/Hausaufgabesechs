package h2;

public class H2_main {


	    public static void main(String[] args) {
	       
	        int[] a = {1, 2, 3};
	        int[] b = {1, 2, 4};
	        int[] c = {1, 3, 2};
	        int[] d = {1, 2};
	        int[] e = {1, 2, 3};
	        
	        // Teste compareArrays mit verschiedenen Arrays
	        System.out.println(compareArrays(a, b)); // false
	        System.out.println(compareArrays(a, e)); // true
	        System.out.println(compareArrays(a, c)); //  false
	        System.out.println(compareArrays(a, d)); //false
	        System.out.println(compareArrays(e, a)); // true
	    }

	    // Methode Vergleich der Arrays
	    public static boolean compareArrays(int[] a, int[] b) {
	        // Wenn die Arrays unterschiedliche Längen haben, sind sie nicht gleich
	        if (a.length != b.length) {
	            return false;
	        }

	        // Vergleich jedes Element in den Arrays an gleicher Position
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] != b[i]) {
	                return false; // Wenn ein Element an derselben Position unterschiedlich ist
	            }
	        }

	        // Wenn alle Vergleiche erfolgreich sind, sind die Arrays gleich
	        return true;
	    }
	}

	
