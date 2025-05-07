
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
        jLabel4 = new javax.swing.JLabel();
        timerbtn1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        algori = new javax.swing.JComboBox<>();
        timerbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        avgr = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        arr = new javax.swing.JTextField();
        brst = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        avgw = new javax.swing.JLabel();
        avgt = new javax.swing.JLabel();

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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Choose Algorithm");

        timerbtn1.setText("🔄️");
        timerbtn1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        timerbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerbtn1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        algori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "SRT" }));
        algori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algoriActionPerformed(evt);
            }
        });

        timerbtn.setText("   ▶️");
        timerbtn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        timerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(timerbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(algori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(algori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timerbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jButton1.setText("Add Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        avgr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        avgr.setText("Avg Response Time:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Burst Time");

        jButton4.setText("Delete All Process");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Arraival Time");

        avgw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        avgw.setText("Avg Waiting Time:");

        avgt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        avgt.setText("Avg Turnaround Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel2)
                                        .addGap(56, 56, 56))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(45, 45, 45)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(brst, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arr, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avgt)
                            .addComponent(avgr)
                            .addComponent(avgw))
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(brst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avgw)
                        .addGap(8, 8, 8)
                        .addComponent(avgt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avgr)))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //public variables
    int tim=0;
    Timer timer;
    int finishedProcess=0;
    List<Process> Totalprocess = new ArrayList<>();
    
    Process running= null;
    boolean play=false;
    
    public Main() {
        initComponents();
        jPanel2.setSize(476, 208);
        jPanel2.setLayout(new java.awt.GridLayout(8, 4, 10, 10));
        time.setText("Time: "+tim);
        
        timerbtn.setSize(10,10);
        
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increasingTime();
            }
        });
        Process p=new Process(0, 10,this);
        Totalprocess.add(p);jPanel2.add(p);
        
        p=new Process(2, 4,this);
        Totalprocess.add(p);jPanel2.add(p);
        
        p=new Process(4, 8,this);
        Totalprocess.add(p);jPanel2.add(p);
        
        p=new Process(6, 2,this);
        Totalprocess.add(p);jPanel2.add(p);
        
        p=new Process(10, 12,this);
        Totalprocess.add(p);jPanel2.add(p);
        
        p=new Process(14, 6,this);
        Totalprocess.add(p);jPanel2.add(p);
        
        p=new Process(18, 2,this);
        Totalprocess.add(p);jPanel2.add(p);
        
        
        avgw.setVisible(false);
        avgt.setVisible(false);
        avgr.setVisible(false);
        
        
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetTime();
        if(arr.getText().trim().isEmpty() || brst.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "All fields must be filled.");
        }
        else if(Process.counter<33)
        {
            Process p=new Process( 
                    Integer.parseInt( arr.getText()),
                    Integer.parseInt(brst.getText()),this);
            Totalprocess.add(p);
            jPanel2.add(p);
            jPanel2.revalidate();
            jPanel2.repaint();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        increasingTime();
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Totalprocess.removeAll(Totalprocess);
        resetTime();
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void timerbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerbtn1ActionPerformed
        resetTime();
    }//GEN-LAST:event_timerbtn1ActionPerformed

    
    



//functions

    int timeParse(){
        String fullText = time.getText();  
        String numberPart = fullText.substring(6);  
        return Integer.parseInt(numberPart);
    }
    
    void resetTime() {
    if (timer != null && timer.isRunning()) {
        timer.stop();
    }
    avgw.setText("Avg Waiting Time:");
    avgt.setText("Avg Turnaround Time:");
    avgr.setText("Avg Response Time:");
    
    avgw.setVisible(false);
    avgt.setVisible(false);
    avgr.setVisible(false);
    
    tim = 0;
    finishedProcess = 0;
    time.setText("Time: 0");
    play = false;
    timerbtn.setText("   ▶️");
    running = null; 

    Process.counter = 0;
    jPanel2.removeAll(); 

    for (int i = 0; i < Totalprocess.size(); i++) {
        Process old = Totalprocess.get(i);
        Process fresh = new Process(old.arraivaltime, old.burstTime, this);
        Totalprocess.set(i, fresh);
        jPanel2.add(fresh);
    }

    jPanel2.revalidate();
    jPanel2.repaint();
}

    void increasingTime() {
        if (finishedProcess == Process.counter) {
            timer.stop();

            play = false;
            timerbtn.setText("   ▶️");

            JOptionPane.showMessageDialog(this, "All processes finished");

            return;
        }
        time.setText("Time: " + ++tim);
        Process p = updatingTime();
    }

    Process updatingTime() {
        
        
        System.out.println("Time: " + tim);
        Process p = Checkstate();

        colorize(p);

        if (p != null) 
        {   
            p.remainingTime--;
            if (p.remainingTime == 0 && !p.getLstate().equals("Finished")) { 
                p.setLstate("Finished",tim);
                p.time2Die = tim;
                finishedProcess++;
                p.isExist=false;
            }
        }
        
        if (finishedProcess == Process.counter) {
            findWTR();
        }
        return p;
    }

    void findWTR() {
        float w = 0, t = 0, r = 0, cont = 0;
        for (Process p : Totalprocess) {
            cont++;
            w += p.waitingTime;
            t += p.turnaroundTime;
            r += p.responseTime;
        }
        avgw.setText(avgw.getText() + " " + String.format("%.2f", w / cont));
        avgt.setText(avgt.getText() + " " + String.format("%.2f", t / cont));
        avgr.setText(avgr.getText() + " " + String.format("%.2f", r / cont));

        avgw.setVisible(true);
        avgt.setVisible(true);
        avgr.setVisible(true);

        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    Process Checkstate() {
        System.err.println("Without:");
        Process cp = null;
        switch (algori.getSelectedIndex()) {
            case 0: cp = getFCFS(); break;
            case 1: cp = getSJF(); break;
            case 2: cp = getSRT(); break;
        }
        return cp;
    }
    
    Process Checkstate(Process p) {
        Process cp = p;
        switch (algori.getSelectedIndex()) {
            case 0: {
                Process pr = getFCFS();
                if (pr != null)
                    cp = pr; 
                break;
            }
            case 1: {
                Process pr = getSJF(); 
                if (pr != null)
                    cp = pr;
                break;
            }
            case 2: {
                Process pr = getSRT(); 
                if (pr != null)
                    cp = pr;
                break;
            }
        }
        return cp;
    }

    void colorize(Process cp){
        // Update process states
        for (Process p : Totalprocess) {
            if (p.time2Die != -1 && p.time2Die <= tim) {
                p.setLstate("Finished",tim);
            } 
            else if (p == cp) {
                p.setLstate("Running",tim);
                running=p;
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

        for (Process p : Totalprocess) {
            if (p.getLstate().equals("Running")) {
                return p;
            }
        }

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

        for (Process p : Totalprocess) {
            if (p.arraivaltime <= tim && 
                p.remainingTime > 0 ) { 

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
    private javax.swing.JLabel avgr;
    private javax.swing.JLabel avgt;
    private javax.swing.JLabel avgw;
    private javax.swing.JTextField brst;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel time;
    private javax.swing.JButton timerbtn;
    private javax.swing.JButton timerbtn1;
    // End of variables declaration//GEN-END:variables
}
