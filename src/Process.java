import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Process extends JPanel {
    static int counter = 1;  // shared counter for all processes
    int id;                 // each process's unique id
    String state;
    int arraivaltime;
    int burstTime;
    int priority;
    JLabel lname = new JLabel();
    JLabel lstate = new JLabel();

    public Process(int arraivaltime, int burstTime, int priority) {
        setSize(150, 150);
        setLayout(new FlowLayout());

        this.id = counter++;  // assign then increment counter
        this.state = "Not Arraived";  // Not Arraived, Arraived, Running, Interrupt, Finished
        this.arraivaltime = arraivaltime;
        this.burstTime = burstTime;
        this.priority = priority;

        lname.setText("P" + this.id);
        lstate.setText(state);
        add(lname);
        add(lstate);
    }
}
