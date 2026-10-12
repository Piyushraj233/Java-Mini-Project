
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class GuiLoginPage extends JFrame{
    // decalare the label
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    // declare the buttom 
    JButton b1, b2, b3;

     GuiLoginPage(String s1) {
        super(s1);

    }

     GuiLoginPage()  {
    }
    void setComponent(){
        l1 = new JLabel("LET'S US START CODEX LEARNING PLATFORM:");
        l2 = new JLabel("Username:");
        l3 = new JLabel("Password");
        l4 = new JLabel("Login");
        // set text
        t1 = new JTextField();
        t2 = new JPasswordField();
        // set bottom 
        b1 = new JButton("Login");
        b2 = new JButton("Clear");
        b3 = new JButton("Add");

        setLayout(null);
        // add layout
        add(l1);
        add(l2);
        add(l3);
        add(l4); 
         // add text
        add(t1);
        add(t2);
           // add buttom
        add(b1);
        add(b2);
        add(b3);
              l1.setBounds(100,50,300,100);
              l2.setBounds(100,200,100,40);
              l3.setBounds(100,300,200,40);
              l4.setBounds(100,390,200,40);
              // set text bounds
              t1.setBounds(250,200,100,40);
              t2.setBounds(250,300,100,40);

              b1.setBounds(200,450,100,40);
              b2.setBounds(400,450,100,40);
              b3.setBounds(500,550,100,40);
             // add ActionListener interface
             b1.addActionListener(new Login());
             b2.addActionListener(new Clear());
             b3.addActionListener(new Add());
    }
    public static void main(String[] args) {
        GuiLoginPage s1 = new GuiLoginPage("Welocome To Coding Platform");
        s1.setVisible(true);
        s1.setSize(700,700);
        s1.setComponent();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    class Login implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            String s2 = t1.getText();
            String s3 = new String(t2.getPassword());
            if(s2.equals("piyush")&& s3.equals("1234") ){
                l4.setText("Login Successfull");

            }else{
                l4.setText("Login Unsuccessfull");
            }
        }
    }
    class Clear implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            t1.setText("");
            t2.setText("");

        }
    }
    class Add implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(new String (t2.getPassword()));
                int c = a+b;
                l4.setText("Addition is:" +c);

            } catch (Exception e) {
               l4.setText("Please inter number only:");
            }
        }
    }
    
    
}
