import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Sort {

	// Hilfsarray B
	private static int[] b;

	public static int[] runSort(int array[]) {
		int length = array.length;
		b = new int[length];
		long startTime = System.currentTimeMillis();
		sortiere(array, 0, length - 1);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Laufzeit n=" + length + ": " + duration + "ms");
		return array;
	}

	public static int[] getFromFile(String filename) {
		Path path = Paths.get(filename);
		List<Integer> intList = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String x;
			while ((x = reader.readLine()) != null) {
				intList.add(Integer.parseInt(x));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		int[] a = new int[intList.size()];
		for (int i = 0; i < intList.size(); i++) {
			a[i] = intList.get(i);
		}
		return a;
	}

	private static void testSortAlg() {
		int[] testarray = new int[] {5,6,3};//7,1,5,3,9,2,9,2};
		System.out.println("Sortiere Testarray:");
		int[] sortiert = runSort(testarray);
		for(int i=0; i<sortiert.length; i++){
			System.out.print(sortiert[i]);
			if(i < sortiert.length-1) System.out.print(", ");
		}
	}
	
	private static void readAndSort1M() {
		System.out.println("Lese rand1M.txt ein");
		int[] r1M = getFromFile("data/rand1M.txt");
		System.out.println("Sortiere rand1M.txt");
		runSort(r1M);
	}

	private static void readAndSort2M() {
		System.out.println("Lese rand2M.txt ein");
		int[] r2M = getFromFile("data/rand2M.txt");
		System.out.println("Sortiere rand2M.txt");
		runSort(r2M);
	}

	private static void readAndSort4M() {
		System.out.println("Lese rand4M.txt ein");
		int[] r4M = getFromFile("data/rand4M.txt");
		System.out.println("Sortiere rand4M.txt");
		runSort(r4M);
	}

	private static void readAndSort8M() {
		System.out.println("Lese rand8M.txt ein");
		int[] r8M = getFromFile("data/rand8M.txt");
		System.out.println("Sortiere rand8M.txt");
		runSort(r8M);
	}

	private static void readAndSort16M() {
		System.out.println("Lese rand16M.txt ein");
		int[] r16M = getFromFile("data/rand16M.txt");
		System.out.println("Sortiere rand16M.txt");
		runSort(r16M);
	}

	private static void readAndSort32M() {
		System.out.println("Lese rand32M.txt ein");
		int[] r32M = getFromFile("data/rand32M.txt");
		System.out.println("Sortiere rand32M.txt");
		runSort(r32M);
	}

	private static void readAndSort65M() {
		System.out.println("Lese rand65M.txt ein");
		int[] r65M = getFromFile("data/rand65M.txt");
		System.out.println("sortiere rand65M.txt");
		runSort(r65M);
	}

	
	private static int[] sortiere(int[] array, int l, int r) {
		int m;
		// TODO
		if(l < r) {
			m = (int) Math.floor((l+r)/2);
			sortiere(array,l,m);
			sortiere(array,m+1,r);
			fuegezusammen(array,l,m,r);
		}
        return array;
	}

	private static void fuegezusammen(int[] array, int l, int m, int r) {

		// TODO
		int i = l;
		int j = m + 1;
		int k = l;

		while (i<= m && j <= r) {
			if (array[i] <= array[j]) {
				b[k] = array[i];
				i = i + 1;
			} else {
				b[k] = array[j];
				j = j + 1;
			}
			k = k + 1;
		}

		if (i > m) {
			for (int h = j; h <= r; h++) {
				b[k + h - j] = array[h];
			}
		} else {
			for (int h = i; h <= m; h++) {
				b[k + h - i] = array[h];
			}
		}

		for (int h = l; h <= r; h++) {
			array[h] = b[h];
		}
	}

	public static void main(String[] args) {

		// Schritt 1: Testen Sie Ihre Implementierung mit dem folgenden
		// Methodenaufruf.
		// Die Console sollte folgenden Output liefern, die Laufzeit kann
		// variieren.

		// Sortiere Testarray:
		// Laufzeit n=8: 0ms
		// 1, 2, 2, 3, 5, 7, 9, 9

		testSortAlg();
		// Schritte 2-4: Jeweils vorherige Methode auskommentieren, nächste
		// Methode ausführen.
		// Laufzeiten enstprechend Übungsblatt 1 notieren.

		//readAndSort1M();
		// readAndSort2M();
		// readAndSort4M();
		// readAndSort8M();
		// readAndSort16M();
		// readAndSort32M();
		 //readAndSort65M();

	}

}