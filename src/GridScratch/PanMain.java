package GridScratch;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanMain extends JPanel {
JButton[][] grid;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
 private int width, length;
    public PanMain() {
       
        width = 12;
        length = 12;
        int i = 0;
        setLayout(new GridLayout(width, length)); 
        //http://www.wikihow.com/Make-a-GUI-Grid-in-Java
        grid = new JButton[width][length]; 
        for (int y = 0; y < length; y++) {
            for (int x = 0; x < width; x++) {
                i++;
                grid[x][y] = new JButton("" + i);
                add(grid[x][y]);
            }
        }
        
        
        }
    }