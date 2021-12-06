package com.losador.back;

import java.awt.*;

public class Parser {

    private TextArea inputArea;
    char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', '0'};
    String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----"};

    public Parser(TextArea inputArea){
        this.inputArea = inputArea;
    }

    public String parseCode(){
        String text = this.inputArea.getText();
        String[] letters = text.split("\\s");
        String res = "";
        int l = letters.length;
        if(l == 1){
            for(int i = 0; i < this.dottie.length; i++) {
                if (letters[0].equals(this.dottie[i])) {
                    res += alpha[i];
                    break;
                }
            }
        }
        else if(l > 1) {
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < this.dottie.length; j++) {
                    if (letters[i].equals(this.dottie[j])) {
                        res += alpha[j];
                        break;
                    }
                }
            }
        }
        return res;
    }
}
