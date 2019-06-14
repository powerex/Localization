package ua.edu.npu;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class BundleDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("strings");
        ResourceBundle resourceBundleUA = ResourceBundle.getBundle("strings", new Locale("uk", "UA"));
        ResourceBundle resourceBundleDE = ResourceBundle.getBundle("strings", new Locale("de", "GR"));

        System.out.println(resourceBundle.getString("greeting"));
        System.out.println(new String(resourceBundleUA.getString("greeting").getBytes("ISO-8859-1"), "UTF-8"));
        System.out.println(resourceBundleDE.getString("greeting"));

    }
}
