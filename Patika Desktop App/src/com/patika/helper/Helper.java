package com.patika.helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static int calculateScreenCenter(String point, Dimension dimension){
        return switch (point) {
            case "x" -> (Toolkit.getDefaultToolkit().getScreenSize().width- dimension.width) / 2;
            case "y" -> (Toolkit.getDefaultToolkit().getScreenSize().height- dimension.height) / 2;
            default -> 0;
        };
    }
    public static void setLayout() {
        for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
            if(info.getName().equals("Nimbus")) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
