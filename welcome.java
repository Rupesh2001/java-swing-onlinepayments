import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class welcome extends JFrame implements ActionListener
{   
    JLabel w;
    JButton login;
    JButton signup;
    public welcome()
        {
            
            w=new JLabel("WELCOME TO PAYMENT");
            login=new JButton("LOGIN");
            login.setBackground(Color.green);
            signup=new JButton("SIGNUP");
            login.setBounds(0,0,100,150);
            signup.setBounds(800,500,100,150);
            signup.setBackground(Color.green);
            login.addActionListener(this);
            signup.addActionListener(this);

            add(w);
            add(login);
            add(signup);

            setSize(200,200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
            setVisible(true);
            setLocationRelativeTo(null);
            setTitle("welcome to dish home bill payment");

        }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==login)
            {
                new Login();
            }
            if(e.getSource()==signup)
            {
                new SignUp();
            }
        }
        public static void main(String[] args) {
            new welcome();
        }

    
}
