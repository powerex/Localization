package ua.edu.npu.bundle;

import javafx.scene.paint.Color;

import java.util.ListResourceBundle;

public class Settings_en extends ListResourceBundle {
    private static final Object[][] settings = {
            {"color", Color.YELLOW},
            {"size", 700D}
    };

    protected Object[][] getContents() {
        return settings;
    }
}
