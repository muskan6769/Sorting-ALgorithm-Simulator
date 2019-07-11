package miniproject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Sort {

    private final int DELAY = 20;
    private Timer timer,timerUp,timerDn;
    private int Inx1,Inx2;


    private ArrayList<Integer> Numarray;
    private ArrayList<JButton>ButtonArr;

    Sort(ArrayList<Integer> numbers,ArrayList<JButton> ButtonArr) {
        this.Numarray=new ArrayList<>(numbers);
        this.ButtonArr=new ArrayList<>(ButtonArr);

    }

    public ArrayList<Integer> getNumarray(){
        return Numarray;
    }

    public int swap(JButton N1,JButton N2) {

        int y=N1.getY();
        timerUp=new Timer(DELAY, new SortListenerUp(N1,N2));
        timerDn=new Timer(DELAY, new SortListenerDn(N1,N2));
        timer = new Timer(DELAY, new SortListener(N1,N2));

        Inx1=N1.getX();
        Inx2=N2.getX();
        timerUp.start();


        return 1;
    }

    public class SortListener implements ActionListener
    {
        //-----------------------------------------------------------------
// Updates the position of the image and possibly the direction
// of movement whenever the timer fires an action event.
//-----------------------------------------------------------------
        private JButton N1;
        private JButton N2;
        private int y;


        SortListener(JButton N1,JButton N2){
            this.N1=N1;
            this.N2=N2;

        }


        public void actionPerformed(ActionEvent event)
        {
            //System.out.println(N1.getX());


            int moveX=1;
            int movY=1;

            int x1=N1.getX();
            int x2=N2.getX();

            int y1=N1.getY();
            int y2=N2.getY();

            x1 += moveX;
            x2-=moveX;
;
            N1.setBounds(x1, y1 ,N1.getWidth(),N1.getHeight());
            N2.setBounds(x2, y2,N2.getWidth(),N2.getHeight());
          //  System.out.println(N1.getX());
            if(x1==Inx2 && x2==Inx1 ){
               // System.out.println("jsd");
                timer.stop();
                timerDn.start();
                //System.out.println(flag);
            }

        }

    }




    public class SortListenerUp implements ActionListener
    {

        private JButton N1;
        private JButton N2;
        private int k=0;

        SortListenerUp(JButton N1,JButton N2){
            this.N1=N1;
            this.N2=N2;
        }

        public void actionPerformed(ActionEvent event)
        {k++;
            //System.out.println(N1.getX());

            int moveX=1;
            int movY=1;

            int x1=N1.getX();
            int x2=N2.getX();
            int y1=N1.getY();
            int y2=N2.getY();
            y1=y1+ movY;
            y2=y2-movY;
          //  System.out.println(y1+"   "+y2);
            N1.setLocation(x1, y1);
            N2.setLocation(x2, y2);
            //  System.out.println(N1.getX());
            if(k==30){
                // System.out.println("jsd");
                timerUp.stop();
                timer.start();
                //System.out.println(flag);
            }

        }

    }



    public class SortListenerDn implements ActionListener
    {
        //-----------------------------------------------------------------
// Updates the position of the image and possibly the direction
// of movement whenever the timer fires an action event.
//-----------------------------------------------------------------
        private JButton N1;
        private JButton N2;
        private int k=0;

        SortListenerDn(JButton N1,JButton N2){
            this.N1=N1;
            this.N2=N2;

        }

        public void actionPerformed(ActionEvent event)
        {k++;
         //System.out.println(N1.getX());

            int moveX=1;
            int movY=1;

            int x1=N1.getX();
            int x2=N2.getX();
            int y1=N1.getY();
            int y2=N2.getY();
            y1-=movY;
            y2+=movY;
            ;
            N1.setBounds(x1, y1,N1.getWidth(),N1.getHeight());
            N2.setBounds(x2, y2,N2.getWidth(),N2.getHeight());
            //  System.out.println(N1.getX());
            if(k==30){
                // System.out.println("jsd");
                timerDn.stop();

                //System.out.println(flag);
            }

        }

    }
    public void sort(){}
    public ArrayList<JButton> getButtonArr(){
        return ButtonArr;
    }


    public Timer getTimer(){
        return timer;
    }
    public Timer getTimerUp(){
        return timerUp;
    }

    public Timer getTimerDn(){
        return timerDn;
    }
}
