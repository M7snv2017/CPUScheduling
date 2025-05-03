import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Process extends JPanel {
    
    public static int counter = 0;
    int id;  

    private String state;
    
    int arraivaltime;
    public int burstTime;
    
    public int remainingTime;//how much time left
    public int time2Die=-1;//the time of finish of the process
    public boolean isExist=true;
    JLabel lname = new JLabel();
    private JLabel lstate = new JLabel();
        
    
    public Process(int arraivaltime, int burstTime) {
        setSize(150, 150);
        setLayout(new FlowLayout());

        this.id = ++counter;  // assign then increment counter
        
        
        
        this.arraivaltime = arraivaltime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        
        if(this.arraivaltime>0)
        {
            this.state = "Not Arrived";
        }else{
            this.state = "Arrived";
        }
        this.updateProcessUI(this);
        lname.setText("P" + this.id);
        lstate.setText(state);
        add(lname);
        add(lstate);
    }

    
    //to control the process state then change process color
    public void setLstate(String lstate,int time) {
        time++;
        if (this.state.equals("Finished")) return; // prevent re-setting if already finished
        this.state = lstate;
        if (lstate.equals("Finished")) {
            if (time2Die == -1) time2Die = time;
            this.lstate.setText(lstate + " at time " + time2Die);
            System.out.println(this.lstate.getText());
        } else {
            this.lstate.setText(lstate);
        }
        this.updateProcessUI(this);
    }


    public String getLstate() {
        return state;
    }
    
    
    
    //to change process color
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
    }

    @Override
    public String toString() {
        return "id=" + id + ", state=" + state + "\n arraivaltime=" + arraivaltime + ", burstTime=" + burstTime + "\n remainingTime=" + remainingTime + ", time2Die=" + time2Die + "\n";
    }
    
    
}
