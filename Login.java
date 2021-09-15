import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Login extends JFrame implements ActionListener
{
    JLabel user;
    JLabel password;
    JLabel email;
    JTextField jel;
    JTextField usertext;
    JTextField userpassword;
    JButton btn;
    public Login(){
        user = new JLabel("NAME");
        password = new JLabel("PASSWORD");
        email=new JLabel("ENTER YOUR EMAIL");
        jel=new JTextField(10);
        usertext = new JTextField(10);
        userpassword = new JTextField(10);
        btn = new JButton("LOGIN ");
        
        add(user);
        add (usertext);
        add(email);
        add(jel);
        add(password);
        add (userpassword);
        add (btn);

        btn.addActionListener(this);
        setSize(200,200);
        setVisible(true);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent fg)
    {
        new billpayment();
       
    }
    public static void main(String [] args){
        new Login();
    }
}