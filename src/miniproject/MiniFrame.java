package miniproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MiniFrame extends javax.swing.JFrame {

    public MiniFrame() {

        initComponents();
        Numbers=new ArrayList<Integer>();
        NumbersButtons=new ArrayList<JButton>();
        NumbersButtons2=new ArrayList<JButton>();
        NumbersButtons3=new ArrayList<JButton>();

        jButton10.setBackground(Color.DARK_GRAY);
        jButton11.setBackground(Color.DARK_GRAY);
        jButton12.setBackground(Color.DARK_GRAY);
        jButton13.setBackground(Color.DARK_GRAY);
        NumbersButtons3.add(jButton10);
        NumbersButtons3.add(jButton11);
        NumbersButtons3.add(jButton12);
        NumbersButtons3.add(jButton13);
        
        
        System.out.println();


        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                long begin;
                long end;
                long timetaken;

                Sort ss = new SelectionSort(Numbers, NumbersButtons);
                Sort bs = new BubbleSort(Numbers, NumbersButtons2);
                Sort ms = new MergeSort(Numbers, NumbersButtons3);
                Next obj = new Next("Selection", ss);
                Thread t = new Thread(obj);
                begin = System.nanoTime();
                ((SelectionSort) ss).sort2();
                end = System.nanoTime();
                timetaken = end - begin;
                System.out.println(timetaken);
                //ss.sort();
                System.out.println(timetaken);

                Timer timer2=null;
                timer2=new Timer(20,new MainListener((SelectionSort )ss,(BubbleSort)bs,(MergeSort)ms,timer2,jPanel1,jPanel2,jPanel3,jPanel4,Window));
                timer2.start();

               /* try {
                    t.sleep(1000000);
                   t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                    System.out.println("hi");
                    N1.setText(String.valueOf(Numbers.get(0)));
                    N2.setText(String.valueOf(Numbers.get(1)));
                    N3.setText(String.valueOf(Numbers.get(2)));
                    N4.setText(String.valueOf(Numbers.get(3)));
                    Sort bs = new BubbleSort(Numbers, NumbersButtons);
                    begin = System.nanoTime();
                    ((BubbleSort) bs).sort2();
                    end = System.nanoTime();
                    timetaken = end - begin;
                    System.out.println(timetaken);
                    bs.sort();
                */}


        });
    
    }
    
    void changePanel(JPanel panel){
        getContentPane().removeAll();
        getContentPane().add(panel);
        getContentPane().doLayout();
        update(getGraphics());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButton22 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel6.setText("ENTER SIZE OF ARRAY");

        jLabel7.setText("ENTER THE ELEMENTS");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(4, null, null, 8));

        jButton22.setText("GENERATE ARRAY");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, "card2");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELECTION SORT SIMULATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, "card3");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUBBLE SORT SIMULATION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, "card4");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MERGE SORT SIMULATION");

        jButton10.setText("57");

        jButton11.setText("13");

        jButton12.setText("42");

        jButton13.setText("10");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10)
                        .addComponent(jButton11)
                        .addComponent(jButton12)
                        .addComponent(jButton13))
                    .addContainerGap(174, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, "card5");

        jButton14.setText("57");

        jButton15.setText("13");

        jButton16.setText("42");

        jButton17.setText("10");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUICK SORT SIMULATION");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, "card6");

        jButton18.setText("57");

        jButton19.setText("13");

        jButton20.setText("42");

        jButton21.setText("10");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INSERTION SORT SIMULATON");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, "card7");

        jButton1.setText("START SIMULATION");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jButton1)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, "card8");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        int i=50,j=200;
        int size=Integer.parseInt(jSpinner1.getValue().toString());
        String[] numbers=jTextField2.getText().split(" ");
        for(String n:numbers){
            JButton jb=new JButton(n);
            JButton jb1=new JButton(n);

            jb.setBounds(i, j, 80, 20);
            jPanel2.add(jb);
            NumbersButtons.add(jb);
            jb1.setBounds(i, j, 80, 20);
            jPanel3.add(jb1);
            NumbersButtons2.add(jb1);
            Numbers.add(Integer.parseInt(n));
            i+=110;
        }
        
        changePanel(jPanel7);
    }//GEN-LAST:event_jButton22ActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MiniFrame M=new MiniFrame();
                M.setVisible(true);
                M.setMinirame(M);
            }
        });
    }
    

    void setMinirame(MiniFrame m){
        this.Window=m;
    }

    private MiniFrame Window;
    private ArrayList<Integer> Numbers;
    private ArrayList<JButton> NumbersButtons;
    private ArrayList<JButton> NumbersButtons2;
    private ArrayList<JButton> NumbersButtons3;
    private final int DELAY = 5;
    private Timer timer;
    private int Inx1,Inx2;
    private int complete=0;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

class MainListener implements ActionListener{

    private SelectionSort SS;
    private BubbleSort BS;
    private MergeSort MS;
    private Timer t=null;
    int f=0,f1=0,f2=0;
    private JPanel p1;
    private JPanel panel1,panel2,panel3;
    private MiniFrame W;

    MainListener(SelectionSort ss,BubbleSort bs,MergeSort ms,Timer T,JPanel p,JPanel p2,JPanel p3,JPanel p4,MiniFrame w){
        this.SS=ss;
        this.BS=bs;
        this.MS=ms;
        this.t=T;
        this.p1=p;
        this.panel1=p2;
        this.panel2=p3;
        this.panel3=p4;
        this.W=w;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(f==0 && f1==0&&f2==0) {

             W.changePanel(panel1);
             SS.sort();
             f = 1;
//            W.changePanel(panel3);
//            System.out.println("Hello");
//            MS.BreakInHalves(0, 3);
//            f=1;
        }
        else if(f==1 && f1==0 && f2==0 && !SS.getSSTimer().isRunning()){
           

            W.changePanel(panel2);
            System.out.println("Hello");
            BS.sort();
            f1=1;
        }
         else if(f==1 && f1==1 && f2==0 && !SS.getSSTimer().isRunning()&&!BS.getBSTimer().isRunning()){
           

            W.changePanel(panel3);
            System.out.println("Hello");
            MS.BreakInHalves(0, 2);
            f2=1;
        }
        else if (!SS.getSSTimer().isRunning()&& !BS.getBSTimer().isRunning()) {
            if(t!=null)
                t.stop();
        }

//        else if (!MS.getMSTimer().isRunning()) {
//            if(t!=null)
//                t.stop();
//        }

    }
}