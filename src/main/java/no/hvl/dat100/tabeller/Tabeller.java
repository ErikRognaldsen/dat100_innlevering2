package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.println(tabell[i] + " ");
        }
	}

	// b)
	public static String tilStreng(int[] tabell) {

        if(tabell.length == 0) {
            return "[]";
        }

        StringBuilder result = new StringBuilder();

        result.append("[");

        for (int i = 0; i < tabell.length; i++) {

            result.append(tabell[i]);

            if (i < tabell.length - 1) {
                result.append(",");
            }
        }
        result.append("]");

        return result.toString();
	}

	// c)
	public static int summer(int[] tabell) {
        int result = 0;
        for (int i = 0; i < tabell.length; i++) {
            result += tabell[i];
        }
        return result;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {return i;}
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] result = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            result[i] = tabell[tabell.length - i - 1];
        }
        return result;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {return false;}
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] result = new int[tabell1.length +  tabell2.length];
        int k = 0;
        for (int i = 0; i < tabell1.length; i++) {
            result[i] = tabell1[i];
            k++;
        }
        for (int i = 0; i < tabell2.length; i++) {
            result[k + i] = tabell2[i];
        }
        return result;

	}
}
