public class TEMPERATUREARRAY { // Idedeklara ang pangunahing klase (class) ng program
    public static void main (String[] args){ // Pangunahing method kung saan magsisimula ang pagrurun ng program

        double temp[] = new double[5]; // Ideklara ang 1D array na may sukat na may limang element

        temp[0] = 32.5; // Ilalagay ang halagang 32.5 sa index 0 (unang araw)
        temp[1] = 34.0; // Ilalagay ang halagang 34.0 sa index 1 (pangalawang araw)
        temp[2] = 31.8; // Ilalagay ang halagang 31.8 sa index 2 (pangatlong araw)
        temp[3] = 33.2; // Ilalagay ang halagang 33.2 sa index 3 (pang-apat na araw)
        temp[4] = 35.1; // Ilalagay ang halagang 35.1 sa index 4 (pang-limang araw)

        System.out.println("Temperature in 5 days: "); // Magpi-print ng simula ng listahan
        for (int i = 0; i < temp.length; i++) { // Gagamit ng for loop at .length property para sukatin ang buong array
            System.out.println("Araw " + (i + 1) + ": " + temp[i]); // Ipi-print ang bawat temperatura depende sa bawat index
        } // Katapusan ng for loop block

        temp[2] = 32.0; // Ia-update ang temperatura sa index 2 (pangatlong araw) mula 31.8 patungong 32.0

        System.out.println("Na-update na temperatura para sa ikatlong araw:"); // Magpi-print ng bagong linya para sa bagong halaga
        System.out.println("Araw 3: " + temp[2]); // Ipi-print ang updated na temperature ng ikatlong araw
    } // Katapusan ng program
    }
