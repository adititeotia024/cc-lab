import java.awt.*;
import java.awt.event.*;

public class formFrame01 extends Frame implements ActionListener {
    Label L1, L2, L3, L4;
    List gl;
    TextField T1, T2, T4;
    Button B1, OK;

    int clickCount = 0; 
    String msg = "";   // message to draw on screen

    public formFrame01() {
        super("User Form");
        setLayout(null);

        L1 = new Label("Name:");
        L2 = new Label("Age:");
        L3 = new Label("Gender:");
        L4 = new Label("Password:");

        T1 = new TextField();
        T2 = new TextField();
        T4 = new TextField();
        T4.setEchoChar('*');

        gl = new List(3, false);
        gl.add("Male");
        gl.add("Female");
        gl.add("Other");

        B1 = new Button("SUBMIT");
        OK = new Button("OK");

        L1.setBounds(80, 80, 100, 25);
        T1.setBounds(200, 80, 150, 25);

        L2.setBounds(80, 120, 100, 25);
        T2.setBounds(200, 120, 150, 25);

        L3.setBounds(80, 160, 100, 25);
        gl.setBounds(200, 160, 150, 60);

        L4.setBounds(80, 240, 100, 25);
        T4.setBounds(200, 240, 150, 25);

        B1.setBounds(150, 290, 100, 30);
        OK.setBounds(270, 290, 100, 30);

        add(L1); add(T1);
        add(L2); add(T2);
        add(L3); add(gl);
        add(L4); add(T4);
        add(B1);
        add(OK);

        B1.addActionListener(this);
        OK.addActionListener(this);

        setSize(450, 380);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == OK) {
            clickCount++;
            msg = "You clicked me " + clickCount + " times";
            repaint();   // redraw the form
        }

        if (e.getSource() == B1) {
            String name = T1.getText();
            String age = T2.getText();
            String gender = gl.getSelectedItem();
            String password = T4.getText();
        }
    }

    // Draw message on the form
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString(msg, 100, 330); // draw message at bottom
    }

    public static void main(String args[]) {
        new formFrame01();
    }
}
