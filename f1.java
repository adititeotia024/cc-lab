import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// amity university
public class f1 extends Frame implements ActionListener {
    Label L1;
    TextField T1;
    Button B1;

    public f1() {
        super("Frame 1");
        setLayout(null);

        L1 = new Label("Name:");
        T1 = new TextField();
        B1 = new Button("OK");

        L1.setBounds(100, 100, 80, 25);
        T1.setBounds(180, 100, 150, 25);
        B1.setBounds(150, 150, 80, 30);

        add(L1);
        add(T1);
        add(B1);

        B1.addActionListener(this);

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = T1.getText();

        f2 obj = new f2(name);  
        obj.setVisible(true);
        this.dispose();   
    }

    public static void main(String args[]) {
        new f1();
    }
}
