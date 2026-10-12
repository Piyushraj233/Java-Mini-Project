import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;


public class DigitalClock{
    public static void main(String[] args){
      JFrame frame = new JFrame("⏲️ Digital Clock");
      frame.setSize(300,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setBackground(Color.BLACK);
      frame.setLayout(new FlowLayout());

      JLabel l1 = new JLabel();
      l1.setFont(new Font("Helvetica", Font.BOLD, 35));
      l1.setForeground(Color.CYAN);
      frame.add(l1);

      Timer time = new Timer(1000, e ->{
          String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
          l1.setText(currentTime);
      });
      time.start();
      frame.setVisible(true);
    }
}
