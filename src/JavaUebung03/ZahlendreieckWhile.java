package JavaUebung03;

public class ZahlendreieckWhile {
    public static void main(String[] args) {
        int zeile = 0;
        int max = 9;

        while (zeile <= max){
            int zahl = 0;
            while (zahl <= zeile) {
                System.out.print(zahl + " ");
                zahl++;
            }

            System.out.println();
            zeile++;
        }
    }
}
