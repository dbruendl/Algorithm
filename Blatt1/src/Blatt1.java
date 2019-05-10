import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Blatt1 {

    private static int[] getArrayFromFile(String filename){
        Path path = Paths.get(filename);
        List<Integer> intList = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String x;
            while((x = reader.readLine()) != null){
                intList.add(Integer.parseInt(x));
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        int[] a = new int[intList.size()];
        for(int i=0; i < intList.size(); i++){
            a[i] = intList.get(i);
        }
        return a;
    }


    private static void printArray(int[] a){
        for(int i: a){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }



    public static int[] runSort(int[] a){
        long startTime = System.currentTimeMillis();
        a = sort(a);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Laufzeit n=" +a.length + ": " + duration + "ms");
        return a;
    }

    private static void testSortAlg(){
        int[] testArray = {7,2,5,9,1,9,3,2};
        int[] sortiertesArray = runSort(testArray);
        printArray(sortiertesArray);
    }

    private static void readAndSortRandomSequence() {
        // zufällige Zahlenfolgen einlesen
        int[] r1000 = getArrayFromFile("data/rand1k.txt");
        int[] r2000 = getArrayFromFile("data/rand2k.txt");
        int[] r4000 = getArrayFromFile("data/rand4k.txt");
        int[] r8000 = getArrayFromFile("data/rand8k.txt");
        int[] r16000 = getArrayFromFile("data/rand16k.txt");
        int[] r32000 = getArrayFromFile("data/rand32k.txt");
        int[] r64000 = getArrayFromFile("data/rand64k.txt");
        int[] r128000 = getArrayFromFile("data/rand128k.txt");
        int[] r256000 = getArrayFromFile("data/rand256k.txt");
        int[] r512000 = getArrayFromFile("data/rand512k.txt");
        int[] r1024000 = getArrayFromFile("data/rand1024k.txt");

        System.out.println("Sortiere zufällige Zahlenfolgen:");
        runSort(r1000);
        runSort(r2000);
        runSort(r4000);
        runSort(r8000);
        runSort(r16000);
        runSort(r32000);
        runSort(r64000);
        runSort(r128000);
        runSort(r256000);
        runSort(r512000);
        runSort(r1024000);

    }

    private static void readAndSortAscSequence() {
        // aufsteigend sortierte Zahlenfolgen einlesen
        int[] a1000 = getArrayFromFile("data/asc1k.txt");
        int[] a2000 = getArrayFromFile("data/asc2k.txt");
        int[] a4000 = getArrayFromFile("data/asc4k.txt");
        int[] a8000 = getArrayFromFile("data/asc8k.txt");
        int[] a16000 = getArrayFromFile("data/asc16k.txt");
        int[] a32000 = getArrayFromFile("data/asc32k.txt");
        int[] a64000 = getArrayFromFile("data/asc64k.txt");
        int[] a128000 = getArrayFromFile("data/asc128k.txt");
        int[] a256000 = getArrayFromFile("data/asc256k.txt");
        int[] a512000 = getArrayFromFile("data/asc512k.txt");
        int[] a1024000 = getArrayFromFile("data/asc1024k.txt");

        System.out.println("Sortiere aufsteigend sortierte Zahlenfolgen:");
        runSort(a1000);
        runSort(a2000);
        runSort(a4000);
        runSort(a8000);
        runSort(a16000);
        runSort(a32000);
        runSort(a64000);
        runSort(a128000);
        runSort(a256000);
        runSort(a512000);
        runSort(a1024000);
    }


    private static void readAndSortDescSequence() {
        // absteigend sortierte Zahlenfolgen einlesen
        int[] d1000 = getArrayFromFile("data/desc1k.txt");
        int[] d2000 = getArrayFromFile("data/desc2k.txt");
        int[] d4000 = getArrayFromFile("data/desc4k.txt");
        int[] d8000 = getArrayFromFile("data/desc8k.txt");
        int[] d16000 = getArrayFromFile("data/desc16k.txt");
        int[] d32000 = getArrayFromFile("data/desc32k.txt");
        int[] d64000 = getArrayFromFile("data/desc64k.txt");
        int[] d128000 = getArrayFromFile("data/desc128k.txt");
        int[] d256000 = getArrayFromFile("data/desc256k.txt");
        int[] d512000 = getArrayFromFile("data/desc512k.txt");
        int[] d1024000 = getArrayFromFile("data/desc1024k.txt");

        System.out.println("Sortiere absteigend sortierte Zahlenfolgen:");
        runSort(d1000);
        runSort(d2000);
        runSort(d4000);
        runSort(d8000);
        runSort(d16000);
        runSort(d32000);
        runSort(d64000);
        runSort(d128000);
        runSort(d256000);
        runSort(d512000);
        runSort(d1024000);

    }


    private static int[] sort(int[] a) {

        // TODO: Sortieralgorithmus hier implementieren
        int key;
        int i;
        for( int j=1; j < a.length ;j++){
            key = a[j];
            i = j-1;
            while(i >= 0 && a[i] > key){
                a[i+1] = a[i];
                i=i-1;
            }
            a[i+1] = key;
        }
        // return sortiertes Array
        return a;
    }

    public static void main(String[] args) {
        // Schritt 1: Testen Sie Ihre Implementierung mit dem folgenden Methodenaufruf.
        // Die Console sollte folgenden Output liefern, die Laufzeit kann variieren.

        // Laufzeit n=8: 0ms
        // 1 2 2 3 5 7 9 9

        //testSortAlg();

        // Schritte 2-4: Jeweils vorherige Methode auskommentieren, nächste Methode ausführen.
        // Laufzeiten enstprechend Übungsblatt 1 notieren.

        //readAndSortRandomSequence();

        //readAndSortAscSequence();

        //readAndSortDescSequence();
    }

}
