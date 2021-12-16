package com.losador;

import com.losador.back.Parser;
import com.losador.front.Window;

public class Main {

    private static Window window;

    public static void main(String[] args) {
        window = new Window(600, 700);
        Parser parser = new Parser(window.getInputArea());
        while(true){
            String text = parser.parseCode(window.getLang());
            window.getOutputArea().setText(text);
        }
    }

}
