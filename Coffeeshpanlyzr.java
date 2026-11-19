// idinedeklara ang pampublikong klase na tinatawag na Coffeeshpanlyzr
public class Coffeeshpanlyzr {
    //pangunahing method kung saan nagsisimulang tumakbo ang Java program
    public static void main(String[] args) {
        // Gumagawa at naglalagay ng data sa array para sa benta sa loob ng pitong araw
        int wklysales[] = {120, 145, 130, 155, 180, 210, 195};
        // mga pangalan ng araw sa isang linggo
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Nagpi-print ng pamagat para sa listahan ng pang-araw-araw na benta
        System.out.println("DAILY SALES");

        // Umiikot sa bawat element ng weeklySales array gamit ang for loop
        for (int i = 0; i < wklysales.length; i++) {

            // Nagpi-print ng pangalan ng araw at ang katumbas nitong bilang ng nabentang kape
            System.out.println(daysOfWeek[i] + " sales: " + wklysales[i]);

            // Dito tumitigil basahin ang loop
        }

        // nag declare ng variable na totalSales at binibigyan ito ng panimulang halaga na 0
        int totalSales = 0;

        // Gumagamit ng enhanced for-each loop upang kunin ang bawat benta sa weeklySales
        for (int dailySale : wklysales) {

            // Idinadagdag ang benta ng kasalukuyang araw sa kabuuang benta (totalSales)
            totalSales += dailySale;
            // Isinasara ang enhanced for-each loop
        }

        // Kinakalkula ang average na benta gamit ang type casting sa double upang hindi mawala ang decimal
        double averageSales = (double) totalSales / wklysales.length;

        // Nagpi-print ng blangkong linya at title para sa summary ng lingguhang benta
        System.out.println("Weekly Summary");

        // Nagpi-print ng kabuuang bilang ng nabentang kape sa buong linggo
        System.out.println("Total Sales: " + totalSales + " cups");

        // Nagpi-print ng karaniwang (average) bilang ng nabentang kape bawat araw
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // Itinatakda ang unang elemento ng array bilang panimulang pinakamataas na benta
        int maxSales = wklysales[0];

        // Itinatakda ang unang elemento ng array bilang panimulang pinakamababang benta
        int minSales = wklysales[0];

        // Itinatakda ang unang araw (Monday) bilang panimulang pinakamabentang araw
        String bestDay = daysOfWeek[0];

        // Itinatakda ang unang araw (Monday) bilang panimulang pinakamatumal na araw
        String worstDay = daysOfWeek[0];

        // Umiikot sa array simula sa index 1 dahil naitakda na ang index 0 bilang panimula
        for (int i = 1; i < wklysales.length; i++) {
            // Sinusuri kung ang benta sa kasalukuyang araw ay mas mataas kaysa sa maxSales
            if (wklysales[i] > maxSales) {
                // Pinapalitan ang maxSales ng bagong pinakamataas na halaga ng benta
                maxSales = wklysales[i];
                // Pinapalitan ang bestDay ng pangalan ng kasalukuyang araw
                bestDay = daysOfWeek[i];
                // Isinasara ang if statement para sa pinakamataas na benta
            }
            // Sinusuri kung ang benta sa kasalukuyang araw ay mas mababa kaysa sa minSales
            if (wklysales[i] < minSales) {
                // Pinapalitan ang minSales ng bagong pinakamababang halaga ng benta
                minSales = wklysales[i];
                // Pinapalitan ang worstDay ng pangalan ng kasalukuyang araw
                worstDay = daysOfWeek[i];
                // Isinasara ang if statement para sa pinakamababang benta
            }
            // Isinasara ang for loop na naghahanap ng pinakamataas at pinakamababang benta
        }

        // Nagpi-print ng blangkong linya at pamagat para sa pinakamataas at pinakamababang araw
        System.out.println("Bests and Worsts");
        // Nagpi-print ng araw na may pinakamataas na benta at ang bilang ng tasa nito
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        // Nagpi-print ng araw na may pinakamababang benta at ang bilang ng tasa nito
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
        // Isinasara ang main method
    }
// Dito nagtatapos ang pagbabasa sa buong programm
}