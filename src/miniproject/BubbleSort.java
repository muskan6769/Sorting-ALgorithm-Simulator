package miniproject;

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.ArrayList;
        import java.util.concurrent.TimeUnit;

        import static java.lang.Thread.sleep;

public class BubbleSort extends Sort {
    private Timer timer;
    private final int DELAY = 20;
    private int flag=0;

    BubbleSort(ArrayList<Integer> numbers, ArrayList<JButton> buttons) {
        super(new ArrayList<>(numbers),new ArrayList<>( buttons));

    }
    public void sort2(){
        ArrayList<Integer>arr=new ArrayList<>(getNumarray());
        //arr=getNumarray();
        for(int i=0;i<arr.size()-1;i++){
            for(int j=0;j<arr.size()-i-1;j++){
                if(arr.get(j)>arr.get(j+1)){
                    int temp=arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
    }
    public void sort()  {
        JButton B1 = null, B2 = null;
        int sI=0,sJ=0;

        for(int i=0;i<getNumarray().size()-1;i++){
            for(int j=0;j<getNumarray().size()-i-1;j++){
                if(this.getNumarray().get(j)>this.getNumarray().get(j+1)){
                    swap(this.getButtonArr().get(j), this.getButtonArr().get(j+1));
                    JButton bb = this.getButtonArr().get(j);
                    this.getButtonArr().set(j, this.getButtonArr().get(j+1));
                    this.getButtonArr().set(j+1, bb);

                    int a = this.getNumarray().get(j);
                    this.getNumarray().set(j, this.getNumarray().get(j+1));
                    this.getNumarray().set(j+1, a);
                    flag=1;
                    sI=i;
                    sJ=j;
                    break;

                }

            }
            if(flag==1)break;
        }

        timer = new Timer(DELAY, new BSListener(sI,sJ));
        timer.start();



    }

    Timer getBSTimer(){
        return this.timer;
    }
    private class BSListener implements ActionListener {

        private JButton B1;
        private JButton B2;
        private int k=1,m=0;

        BSListener(int i,int j){
            if(j==getNumarray().size()-i-2){
                m=i+1;
                k=0;
            }
            else{
                m=i;
                k=j+1;
            }
        }
        public void actionPerformed(ActionEvent event) {

            if (getTimer() != null && getTimerUp() != null && getTimerDn() != null) {
                if (!getTimer().isRunning() && !getTimerUp().isRunning() && !getTimerDn().isRunning()) {

                    for (int i = 0; i < getNumarray().size()-1; i++) {

                        for (int j = k; j < getNumarray().size()-i-1; j++) {

                            if (getNumarray().get(j) > getNumarray().get(j+1)) {

                                for (JButton jb : getButtonArr()) {
                                    if (Integer.parseInt(jb.getText()) == getNumarray().get(j)) {
                                        B1 = jb;
                                    }
                                    if (Integer.parseInt(jb.getText()) == getNumarray().get(j+1)) {
                                        B2 = jb;
                                    }
                                }


                                JButton b = getButtonArr().get(j);
                                getButtonArr().set(j, getButtonArr().get(j+1));
                                getButtonArr().set(j+1, b);


                                int aa = getNumarray().get(j);
                                getNumarray().set(j, getNumarray().get(j+1));
                                getNumarray().set(j+1, aa);

                                swap(B1, B2);

                                // System.out.println(B1.getText() + " " + B2.getText());
                                //  System.out.println(k + " " + m);
                                // timer.stop();
                            }

                            /*if (k == getNumarray().size() - 1) {
                                m++;
                                k = m;
                            } else {

                                k++;
                            }*/


                            if (m == getNumarray().size() - 1) {
                                timer.stop();
                            }
                            if (getTimer().isRunning() || getTimerUp().isRunning() || getTimerDn().isRunning()) break;
                        }

                        if (getTimer().isRunning() || getTimerUp().isRunning() || getTimerDn().isRunning()) break;
                        k=0;
                    }
                }


            }
        }
    }
}