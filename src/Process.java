
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

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
    JLabel W= new JLabel();
    JLabel T= new JLabel();
    JLabel R= new JLabel();
    
    
    int waitingTime=0;
    int responseTime=-1;
    int turnaroundTime=0;
    
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
        
        
        
        Timer clickTimer = new Timer(250, null); // 250ms delay
        clickTimer.setRepeats(false); // Run only once

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    // Delay single-click action
                    clickTimer.stop();
                    clickTimer.setInitialDelay(250);
                    clickTimer.addActionListener(evt -> {
                        
                    });
                    clickTimer.start();
                } else if (e.getClickCount() == 2) {
                    // Cancel single-click if it's a double-click
                    clickTimer.stop();
                    System.out.println("Process P" + id + " double-clicked");
                    // Double-click logic here
                }
            }
        });
    }

    
    //to control the process state then change process color
    public void setLstate(String lstate,int time) {
        time++;
        if (this.state.equals("Finished")) return; // prevent re-setting if already finished
        
        this.state = lstate;
        
        if (lstate.equals("Finished")) 
        {
            if (time2Die == -1) time2Die = time;
            
            this.lstate.setText(lstate + " at time " + time2Die);
            
            turnaroundTime=time-arraivaltime;
            
            System.out.println(this.lstate.getText());
            
            edit();
            W.setText("WaitingTime: "+waitingTime);
            T.setText("TurnaroundTime: "+turnaroundTime);
            R.setText("ResponseTime: "+responseTime);
            this.add(W);
            this.add(T);
            this.add(R);
        } 
        else 
        {
            this.lstate.setText(lstate);
        }
        this.updateProcessUI(this);
        
        if(state!="Finished" && state!="Not Arrived" && state=="Running" && responseTime==-1)
        {
            
            time--;
            responseTime=time-arraivaltime;
//            System.out.println(responseTime+"="+time+" - "+arraivaltime);
            
        }


    }
    public void setLstate(int time, String lstate) {
        



        
        this.state = lstate;
        this.lstate.setText(lstate);
        this.updateProcessUI(this);

        if(state!="Finished" && state!="Not Arrived" && state=="Running" && responseTime==-1)
        {
            
            time--;
            responseTime=time-arraivaltime;
//            System.out.println(responseTime+"="+time+" - "+arraivaltime);
            
        }
        }
    public String getLstate() {
        return state;
    }
    
    
    
    //to change process color
    public void updateProcessUI(Process p) {
        String col="";
        switch (p.state) {
            case "Finished":
                p.setBackground(java.awt.Color.GREEN);
                col="green";
                break;
            case "Running":
                remov();
                p.setBackground(java.awt.Color.YELLOW);
                col="yellow";
                break;
            case "Interrupted":
                remov();
                p.setBackground(java.awt.Color.ORANGE);
                col="orange";
                break;
            case "Arrived":
                remov();
                p.setBackground(java.awt.Color.BLUE);
                col="blue";
                break;
            case "Not Arrived":
                remov();
                p.setBackground(java.awt.Color.RED);
                col="red";
                break;
            default:
                p.setBackground(java.awt.Color.LIGHT_GRAY);
        }
        p.setOpaque(true);
    }

    void remov(){
        this.remove(W);
        this.remove(R);
        this.remove(T);
        this.revalidate();
        this.repaint();
    }
    void edit(){
        
        waitingTime = time2Die-(arraivaltime+burstTime);
//        System.out.println(id+"- "+waitingTime+" = "+time2Die+" - "+arraivaltime+" + "+burstTime);
    }
    @Override
    public String toString() {
        return "id=" + id + ", state=" + state + "\n arraivaltime=" + arraivaltime + ", burstTime=" + burstTime + "\n remainingTime=" + remainingTime + ", time2Die=" + time2Die + "\n";
    }
    
    
}