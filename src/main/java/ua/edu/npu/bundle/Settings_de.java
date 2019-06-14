package ua.edu.npu.bundle;

import javafx.scene.paint.Color;

import java.util.ListResourceBundle;

public class Settings_de extends ListResourceBundle {
    private static final Object[][] settings = {
            {"color", Color.GREEN},
            {"size", 220D}
    };

    protected Object[][] getContents() {
        return settings;
    }
}
