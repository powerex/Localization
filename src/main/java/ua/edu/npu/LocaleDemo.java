package ua.edu.npu;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {

        for (Locale locale: Locale.getAvailableLocales()) {
            System.out.println(locale);
        }

        Locale localeDefault = Locale.getDefault();
        Locale localeEN = new Locale("en", "US");
        Locale localeEN_UK = new Locale("en", "GB");
        Locale localePL = new Locale("pl", "PL");

        System.out.println("\n========= Currency =============");
        System.out.println(NumberFormat.getCurrencyInstance(localeDefault).format(1500));
        System.out.println(NumberFormat.getCurrencyInstance(localeEN).format(1500));
        System.out.println(NumberFormat.getCurrencyInstance(localeEN_UK).format(1500));
        System.out.println(NumberFormat.getCurrencyInstance(localePL).format(1500));

        System.out.println("\n========= Date =============");
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, localeDefault).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, localeEN).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, localeEN_UK).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, localePL).format(new Date()));
    }

}
