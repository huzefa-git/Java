import java.awt.*;
import java.awt.event.*;

public class AWTCounterWithClose extends Frame implements ActionListener {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public AWTCounterWithClose() {
        setLayout(new FlowLayout());

        lblCount = new Label("Counter");
        add(lblCount);

        tfCount = new TextField("0", 10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("Count");
        add(btnCount);

        btnCount.addActionListener(this);

        setTitle("AWT Counter with Close");
        setSize(250, 100);
        setVisible(true);

        // Add window listener to handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Release resources
                System.exit(0); // Terminate the application
            }
        });
    }

    public static void main(String[] args) {
        new AWTCounterWithClose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tfCount.setText(count + "");
    }
}
