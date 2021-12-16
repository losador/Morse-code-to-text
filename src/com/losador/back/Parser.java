package com.losador.back;

import javax.swing.*;
import java.awt.*;

public class Parser {

    private TextArea inputArea;
    char[] enAlpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', '0'};
    char[] ruAlpha = { 'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й',
            'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х',
            'ц', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '1', '2', '3',
            '4', '5', '6', '7', '8', '9', '0'};
    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----"};
    String[] ruMorse = { ".-", "-...", ".--", "--.", "-..", ".", "...-",
            "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            ".-.", "...", "-", "..-", "..-.", "....", "-.-.",
            "---.", "----", "--.-", ".--.-.", "-.--", "-..-", "...-...",
            "..--", ".-.-", ".----", "..---", "...--", "....-", ".....", "-....",
            "--...", "---..", "----.", "-----"};

    public Parser(TextArea inputArea){
        this.inputArea = inputArea;
    }

    public String parseCode(JComboBox lang){
        String text = this.inputArea.getText();
        String[] letters = text.split("\\s");
        String res = "";

        char[] alpha = new char[0];
        String[] morse = new String[0];

        if(lang.getSelectedIndex() == 1){
            alpha = this.ruAlpha;
            morse = this.ruMorse;
        }
        else if(lang.getSelectedIndex() == 0){
            alpha = this.enAlpha;
            morse = this.morse;
        }

        int l = letters.length;
        if(l == 1){
            for(int i = 0; i < morse.length; i++) {
                if (letters[0].equals(morse[i])) {
                    res += alpha[i];
                    break;
                }
            }
        }
        else if(l > 1) {
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < morse.length; j++) {
                    if (letters[i].equals(morse[j])) {
                        res += alpha[j];
                        break;
                    }
                }
            }
        }
        return res;
    }
}
