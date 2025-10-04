
package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    JButton b1;
    About(){
        setBounds(450, 100, 750,600);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel windowIcon = new JLabel(i3);
        windowIcon.setBounds(150, 40, 400, 80);
        add(windowIcon);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(60, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel notepadIcon = new JLabel(i6);
        notepadIcon.setBounds(40, 180, 60, 70);
        add(notepadIcon);
        
        
        JLabel l3 = new JLabel("<html>Microsoft Windows<br>version 22H2 (OS Build 19045.3086)<br>&copy; Microsoft Corporation. All rights reserved.<br><br>The Windows 1 Home Single Lanaguage operationg system and its user interface are protected by trademark and other pending or existing intellectual property rights in the United states and other Countries/regions.<br><br><br> This prduct is Licensed under the <a href=\"https://support.microsoft.com/en-us\">Microsoft Software License Terms to: </a><br>   Windows User </html>");
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l3.setBounds(120, 135, 500, 350);
        add(l3);
        
        b1 = new JButton("OK");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
}