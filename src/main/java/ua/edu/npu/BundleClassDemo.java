package ua.edu.npu;

import java.util.Locale;
import java.util.ResourceBundle;

public class BundleClassDemo {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("ua.edu.npu.bundle.Settings");
        ResourceBundle resourceBundleUK = ResourceBundle.getBundle("ua.edu.npu.bundle.Settings", new Locale("en"));
        ResourceBundle resourceBundleDE = ResourceBundle.getBundle("ua.edu.npu.bundle.Settings", new Locale("de"));

        System.out.println(resourceBundle.getObject("color") + " " + resourceBundle.getObject("size"));
        System.out.println(resourceBundleUK.getObject("color") + " " + resourceBundleUK.getObject("size"));
        System.out.println(resourceBundleDE.getObject("color") + " " + resourceBundleDE.getObject("size"));
    }
}
