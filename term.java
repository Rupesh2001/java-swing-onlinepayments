import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class term extends JFrame implements ActionListener //ItemListener
{
    JLabel lgender;
    JRadioButton r1;
    JRadioButton r2;
    ButtonGroup gender;
    JLabel te;
    JTextField tac;
    JButton submit;
    public term()
    {
        lgender = new JLabel("TERM AND CONDITION: ");
        r1 = new JRadioButton("AGREE");
        r2 = new JRadioButton("NOT AGREE");
        gender = new ButtonGroup();
        gender.add(r1);
        gender.add(r2);
        te=new JLabel("FEEDBACK:");
        tac=new JTextField(20);
        submit=new JButton("submit");
        add(lgender);
        add(r1);
        add(r2);
        add(te);
        add(tac);
        add(submit);
        submit.addActionListener(this);
        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new term();
    }
    public void actionPerformed(ActionEvent fg)
    {
       
                if(r2.isSelected())
                {
                    JOptionPane.showMessageDialog(this,"you cannot transfer amount if you click NOT AGREE button");
                }
                
                if(r1.isSelected())
                {
                    JOptionPane.showMessageDialog(this,"congrulation! your amount is successfully transfer in ");
                }


      
    }
}