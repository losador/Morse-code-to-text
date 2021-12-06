package com.losador;

import com.losador.back.Parser;
import com.losador.front.Window;

public class Main {

    public static void main(String[] args) {
        Window window = new Window(600, 700);
        Parser parser = new Parser(window.getInputArea());
        while(true){
            String res = parser.parseCode();
            window.getOutputArea().setText(res);
        }
    }

}
