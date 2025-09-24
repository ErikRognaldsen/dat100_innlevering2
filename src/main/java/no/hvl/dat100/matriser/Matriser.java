package no.hvl.dat100.matriser;

public class Matriser {
// GAYGAYGAY
	// a)
	public static void skrivUt(int[][] matrise) {

        for (int[] ints : matrise) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder result = new StringBuilder();

        for (int[] ints : matrise) {
            for (int anInt : ints) {
                result.append(anInt).append(" ");
            }
            result.append("\n");
        }
        System.out.println(result.toString()); //debug
        return result.toString();
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] result = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                result[i][j] = tall * matrise[i][j];
            }
        }
        return result;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if(a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {return false;}
            }
        }
        return true;
	}

    /*
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}

     */

}
