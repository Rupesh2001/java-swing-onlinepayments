import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {
    //email
    JLabel jlemail;
    JTextField jfemail;
    
    //password
    JLabel jlpwd;
    JTextField jfpwd;
    
    //name
    JLabel jlname;
    JTextField jfname;

    //dob
    String []months={"jan","feb","mar","apr","may","june","july","aug","sept","oct","nov","dec"};
    JLabel jldob;
    JComboBox<String> jcm;
    JTextField jfd;
    JTextField jfy;

    //gender
    JLabel jlgender;
    JRadioButton r1;
    JRadioButton r2;
    ButtonGroup gender;

    //terms and condition
    JLabel jlterms;
    JCheckBox jchterms;

    //submit
    JButton submit;

    public SignUp(){        
        //email
        jlemail = new JLabel("email : ");
        jfemail = new JTextField(30);
        add(jlemail);
        add(jfemail);

        //password
        jlpwd = new JLabel("password : ");
        jfpwd = new JTextField(20);
        add(jlpwd);
        add(jfpwd);

        //name
        jlname = new JLabel("name : ");
        jfname= new JTextField(20);
        add(jlname);
        add(jfname);
        
        //dob
        jldob = new JLabel("date of birth : ");
        jcm = new JComboBox<>(months);
        jfd = new JTextField(2);
        jfy = new JTextField(4);
        add(jldob);
        add(jcm);
        add(jfd);
        add(jfy);

        //gender
        jlgender = new JLabel("gender : ");
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        gender = new ButtonGroup();
        gender.add(r1);
        gender.add(r2);
        add(jlgender);
        add(r1);
        add(r2);

        //terms & conditon
        jlterms = new JLabel("terms & condition : ");
        jchterms =  new JCheckBox(" accept ");
        add (jlterms);
        add (jchterms);

        //submit
        submit = new JButton("submit");
        add (submit);

        setSize(400,600);
        setVisible(true);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String []a){
        new SignUp();
    }
}
