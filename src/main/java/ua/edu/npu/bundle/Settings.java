package ua.edu.npu.bundle;

import javafx.scene.paint.Color;

import java.util.ListResourceBundle;

public class Settings extends ListResourceBundle {

    private static final Object[][] settings = {
        {"color", Color.BLUE},
        {"size", 200D}
    };

    protected Object[][] getContents() {
        return settings;
    }
}
