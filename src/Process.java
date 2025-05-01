import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Process extends JPanel {
    static int counter = 1;  // shared counter for all processes
    int id;                 // each process's unique id
    private String state;
    int arraivaltime;
    public int burstTime;
    int priority;
    int remainingTime;
    JLabel lname = new JLabel();
    private JLabel lstate = new JLabel();

    public Process(int arraivaltime, int burstTime, int priority) {
        setSize(150, 150);
        setLayout(new FlowLayout());

        this.id = counter++;  // assign then increment counter
        this.state = "Not Arrived";  // Not Arraived, Arraived, Running, Interrupt, Finished
        this.updateProcessUI(this);
        this.arraivaltime = arraivaltime;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;

        lname.setText("P" + this.id);
        lstate.setText(state);
        add(lname);
        add(lstate);
    }

    public void setLstate(String lstate) {
        this.state=lstate;
        this.lstate.setText(lstate);
        this.updateProcessUI(this);
    }
    
    
    public void updateProcessUI(Process p) {
        switch (p.state) {
            case "Finished":
                p.setBackground(java.awt.Color.GREEN);
                break;
            case "Running":
                p.setBackground(java.awt.Color.YELLOW);
                break;
            case "Interrupt":
                p.setBackground(java.awt.Color.ORANGE);
                break;
            case "Arrived":
                p.setBackground(java.awt.Color.BLUE);
                break;
            case "Not Arrived":
                p.setBackground(java.awt.Color.RED);
                break;
            default:
                p.setBackground(java.awt.Color.LIGHT_GRAY);
        }
        p.setOpaque(true);
        p.lstate.setText(p.state);
    }
}
