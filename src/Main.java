
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        timerbtn = new javax.swing.JButton();
        algori = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        arr = new javax.swing.JTextField();
        brst = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CPU Scheduling");
        setMaximumSize(new java.awt.Dimension(912, 538));
        setMinimumSize(new java.awt.Dimension(912, 538));
        setResizable(false);
        setSize(new java.awt.Dimension(912, 538));

        time.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        time.setText("Time: ");

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(475, 207));
        jPanel2.setMinimumSize(new java.awt.Dimension(475, 207));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        jButton2.setText("+");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("-");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        timerbtn.setText("   ▶️");
        timerbtn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        timerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerbtnActionPerformed(evt);
            }
        });

        algori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "SRT" }));
        algori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algoriActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Choose Algorithm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(timerbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(algori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timerbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(algori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Add Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Arraival Time");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Burst Time");

        jButton4.setText("Delete All Process");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(brst, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(brst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //public variables
    int tim=0;
    Timer timer;
    int finishedProcess=0;
    List<Process> Totalprocess = new ArrayList<>();

    boolean play=false;
    
    public Main() {
        initComponents();
//        jPanel2.setLayout(new FlowLayout());
        jPanel2.setSize(476, 208);
//        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));
        jPanel2.setLayout(new java.awt.GridLayout(8, 4, 10, 10));
        time.setText("Time: "+tim);
        
        timerbtn.setSize(10,10);
        
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increasingTime();
            }
        });

    }
    
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetTime();
        if(arr.getText().trim().isEmpty() || brst.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "All fields must be filled.");
        }
        else if(Process.counter<33)
        {
            Process p=new Process(Integer.parseInt( arr.getText()), Integer.parseInt(brst.getText()));
            Totalprocess.add(p);
            jPanel2.add(p);
            jPanel2.revalidate();
            jPanel2.repaint();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        increasingTime();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        decreasingTime();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void timerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerbtnActionPerformed
        play=!play;
        tim=timeParse();
        if(play){
            timer.start();
            timerbtn.setText("  ️ ⏸️️");
        }else{
            timer.stop();
            timerbtn.setText("   ▶️");
        }
    }//GEN-LAST:event_timerbtnActionPerformed

    private void algoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algoriActionPerformed
        resetTime();
    }//GEN-LAST:event_algoriActionPerformed

    
    
    
    
    //functions
    void resetTime() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        tim = 0;
        finishedProcess = 0;
        time.setText("Time: 0");
        play = false;
        timerbtn.setText("   ▶️");

        Process.counter = 0;
        jPanel2.removeAll(); // clear UI

        for (int i = 0; i < Totalprocess.size(); i++) {
            Process old = Totalprocess.get(i);
            Process fresh = new Process(old.arraivaltime, old.burstTime);
            Totalprocess.set(i, fresh);
            jPanel2.add(fresh);
            System.out.println(fresh);
        }

        jPanel2.revalidate();
        jPanel2.repaint();
    }

    


    int timeParse(){
        String fullText = time.getText();  // Example: "Time: 5"
        String numberPart = fullText.substring(6);  // Skips "Time: " (6 characters)
        return Integer.parseInt(numberPart);
    }
    
    
    void decreasingTime() {
        if (tim <= 0) return;
        
        
        tim--;
        time.setText("Time: " + tim);

        finishedProcess = 0;

        for (Process p : Totalprocess) {
            if (p.arraivaltime <= tim) {
                p.setLstate("Arrived",tim);

                // Restore or recompute remainingTime manually
                int executedTime = tim - p.arraivaltime;
                if (executedTime >= p.burstTime) {
                    p.remainingTime = 0;
                } else {
                    p.remainingTime = p.burstTime - executedTime;
                    p.isExist=true;
                }
            } else {
                p.setLstate("Not Arrived",tim);
                p.remainingTime = p.burstTime;
            }
        }

        Checkstate(); // Just to update labels
    }

    void increasingTime(){

        Process p = Checkstate();
        
        if (finishedProcess == Process.counter) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "All processes finished!");
            play = false;
            timerbtn.setText("   ▶️");
            return;
        }
        if (p != null) 
        {   
            
            p.remainingTime--;
            
//            if (p.remainingTime == 0) {
//                finishedProcess++;
//                p.time2Die=tim;
//                Curprocess.remove(p);
//            }
            if (p.remainingTime == 0 && !p.getLstate().equals("Finished")) { 
                p.setLstate("Finished",tim);
                p.time2Die = tim;
                finishedProcess++;
                p.isExist=false;
            }
        }
        
        time.setText("Time: " + ++tim);
        colorize(p);
        
        //debug
//        System.out.println("Time: "+tim);
//        for (Process pr : Curprocess) {
//            System.out.println(pr);
//        }
    }
    

    Process Checkstate() {
        Process cp = null;
        switch(algori.getSelectedIndex()) {
            case 0: cp = getFCFS(); break;
            case 1: cp = getSJF(); break;
            case 2: cp = getSRT(); break;  // Now uses the corrected SRT
        }
        return colorize(cp);
    }
    Process colorize(Process cp){
    // Update process states
    for (Process p : Totalprocess) {
        if (p.time2Die != -1 && p.time2Die <= tim) {
            p.setLstate("Finished",tim);
        } 
        else if (p == cp) {
            p.setLstate("Running",tim);
        } 
        else if (p.arraivaltime > tim) {
            p.setLstate("Not Arrived",tim);
        } 
        else if (p.remainingTime != p.burstTime) {
            p.setLstate("Interrupted",tim);
        }
        else if (p.arraivaltime <= tim) {
            p.setLstate("Arrived",tim);
        }
    }
    
    return cp;
}
    
    //algorithms
    Process getFCFS(){
        Process pr=null;
        int i=0;
        for (Process p : Totalprocess)
        {
            if(!p.isExist)
                continue;
            if(pr == null || pr.arraivaltime > p.arraivaltime)
            {
                pr=p;
            }
        }
        return pr;
    }
    
    Process getSJF() {
        Process shortest = null;

        // First check if there's a currently running process
        for (Process p : Totalprocess) {
            if (p.getLstate().equals("Running")) {
                // In non-preemptive SJF, we should let the running process continue
                return p;
            }
        }

        // If no process is running, find the shortest job that has arrived
        for (Process p : Totalprocess) {
            if (p.arraivaltime <= tim && 
                !p.getLstate().equals("Finished") && 
                (shortest == null || p.burstTime < shortest.burstTime)) {
                shortest = p;
            }
        }

        return shortest;
    }
 
    Process getSRT() {
        Process shortestRemaining = null;

        // Only consider processes that have arrived and aren't finished
        for (Process p : Totalprocess) {
            if (p.arraivaltime <= tim &&          // Process has arrived
                p.remainingTime > 0 &&            // Process isn't finished
                p.getLstate() != "Finished") {     // Additional state check

                if (shortestRemaining == null || 
                    p.remainingTime < shortestRemaining.remainingTime) {
                    shortestRemaining = p;
                }
            }
        }

        return shortestRemaining;
    }
    
    
    
    
    
    
    

    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> algori;
    private javax.swing.JTextField arr;
    private javax.swing.JTextField brst;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel time;
    private javax.swing.JButton timerbtn;
    // End of variables declaration//GEN-END:variables
}
