package com.losador.front;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    private TextArea inputArea;
    private TextArea outputArea;
    private JLabel inLabel;
    private JLabel description;
    private JLabel outLabel;
    private JFrame frame;

     public Window(int width, int height){
         this.frame = new JFrame("Morse to text");
         this.inLabel = new JLabel();
         inLabel.setText("Input area(Morse code)");
         this.outLabel = new JLabel();
         outLabel.setText("Output area(Text)");
         this.description = new JLabel();
         description.setText("It`s a morse code to text converter. Enter the code separated by a spaces.");
         frame.setSize(width, height);
         inLabel.setBounds(frame.getWidth()/20, frame.getHeight()/20 + 70, 200, 20);
         outLabel.setBounds(frame.getWidth()/20, frame.getHeight()/2 + 20, 200, 20);
         description.setBounds(frame.getWidth()/ 20, frame.getHeight()/20, 500, 30);
         this.inputArea = new TextArea();
         inputArea.setFont(new Font("TimesRoman", Font.PLAIN, 20));
         inputArea.setBounds(frame.getWidth()/20, frame.getHeight()/10 + 70, frame.getWidth() - frame.getWidth()/8, frame.getHeight()/4);
         this.outputArea = new TextArea();
         outputArea.setFont(new Font("TimesRoman", Font.PLAIN, 20));
         outputArea.setBounds(frame.getWidth()/20, frame.getHeight()/2 + 50, frame.getWidth() - frame.getWidth()/8, frame.getHeight()/4);
         frame.add(description);
         frame.add(inputArea);
         frame.add(outLabel);
         frame.add(inLabel);
         frame.add(outputArea);
         frame.setLayout(null);
         frame.setVisible(true);
     }

     public TextArea getInputArea(){
         return this.inputArea;
     }
     public TextArea getOutputArea(){
        return this.outputArea;
     }

     public JLabel getInLabel(){
         return this.inLabel;
     }
     public JLabel getOutLabel(){
        return this.outLabel;
     }

     public JFrame getFrame(){
         return this.frame;
     }
}
