import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class billpayment extends JFrame implements ActionListener
{
    JLabel cid;
    JTextField ci;
    JLabel ecn;
    JTextField cn;
    JLabel ea;
    JTextField a;
    JButton pay;
    JButton tran; 


    public billpayment()
    {
        cid=new JLabel("ENTER CUSTOMER ID");
        ci=new JTextField(20);
        ecn=new JLabel("ENTER CUSTOMER NAME");
        cn=new JTextField(20);
        ea=new JLabel("ENTER AMOUNT IN RS.");
        a=new JTextField(10);
        pay=new JButton("payment");
        tran=new JButton("TRANSACTION");


          add(cid); 
          add(ci); 
          add(ecn); 
          add(cn);
         
          add(ea); 
          add(a); 
          add(pay); 
          add(tran);
        pay.addActionListener(this);
        tran.addActionListener(this);
        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent pay)
    {
        new term();
    }
   /* public void actionPerformed(ActionEvent tran)
    {
        
    }*/
    
    public static void main(String [] args)
    {
        new billpayment();
    }
}
