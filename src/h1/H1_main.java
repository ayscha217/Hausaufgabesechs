package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        int[] c = {2, 4, 6};
        int[] d = {6, 4, 9};
        
        System.out.println(isMirrorArray(a, b)); 
        System.out.println(isMirrorArray(c, d));
        System.out.println(isMirrorArray(a, c));
        System.out.println(isMirrorArray(b, a));
	}
public static boolean isMirrorArray(int[] a, int[] b) {
	
	if (a.length != b.length) {
        return false;
	}
	
	for (int i = 0; i < a.length; i++) {
        if (a[i] != b[b.length - 1 - i]) {
            return false;
        }}
	
	return true;
        	
        	
        	
	}

}
