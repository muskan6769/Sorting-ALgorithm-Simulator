/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author komal
 */

class MergeSort extends Sort {
    
    private int array[];
    private ArrayList<JButton> jb;
    private Timer timerL=null;
    private Timer timerR=null;
    
    MergeSort(ArrayList<Integer> numbers,ArrayList<JButton> buttons){
                super((ArrayList<Integer>)numbers.clone(), (ArrayList<JButton>)buttons.clone());
                jb=(ArrayList<JButton>)buttons.clone();
                 System.out.println("Helllo");
                for(JButton j:jb){
                    System.out.println(j.getText());
                }

    }
    
    void BreakInHalves(int L,int R){
       
        int m,i;
        if(L<R)
        {
            m=L+(R-L)/2;
            for(i=L;i<m;i++){
//                if(timerL!=null)
//                    timerL.stop();
//            timerL=new Timer(20,new partitionMovementLeft(jb.get(i)));
//            timerL.start();
               if(jb.get(i).getBackground().equals(Color.DARK_GRAY))
                  jb.get(i).setBackground(Color.red);
               else if(jb.get(i).getBackground().equals(Color.red))
                  jb.get(i).setBackground(Color.blue);
               else if(jb.get(i).getBackground().equals(Color.blue))
                  jb.get(i).setBackground(Color.GREEN);
               else if(jb.get(i).getBackground().equals(Color.GREEN))
                  jb.get(i).setBackground(Color.CYAN);
               
               System.out.println("loooooo");
            }
            
            BreakInHalves(L,m);
            //for(i=m+1;i<R;i++){
//            timerR=new Timer(20,new partitionMovementRight(jb.get(i)));
//            timerR.start();
            //}
//               for(i=m+1;i<R;i++){
////                if(timerL!=null)
////                    timerL.stop();
////            timerL=new Timer(20,new partitionMovementLeft(jb.get(i)));
////            timerL.start();
//               if(jb.get(i).getBackground().equals(Color.DARK_GRAY))
//                  jb.get(i).setBackground(Color.red);
//               else if(jb.get(i).getBackground().equals(Color.red))
//                  jb.get(i).setBackground(Color.blue);
//               else if(jb.get(i).getBackground().equals(Color.blue))
//                  jb.get(i).setBackground(Color.GREEN);
//               else if(jb.get(i).getBackground().equals(Color.GREEN))
//                  jb.get(i).setBackground(Color.CYAN);
//               
//               
//            }
            BreakInHalves(m+1,R);
            //Merge(L,m,R);
        }
        
    }
    
    Timer getMSTimer(){
        return this.timerL;
    }
    
    void Merge(int l,int M,int r){
        int LeftHalf=M-l+1;
        int RightHalf=r-M;
        
        int LArray[]=new int[LeftHalf];
        int RArray[]=new int[RightHalf];
        
        for(int i=l;i<LeftHalf+l;i++){
            LArray[i-l]=array[i];
        }
        for(int i=M+1;i<RightHalf+M+1;i++){
            RArray[i-M-1]=array[i];
        }
        
        
        int x=0,y=0,merged=l;
        
        while(x<LeftHalf && y<RightHalf){
            if(LArray[x]<RArray[y]){
                array[merged]=LArray[x];
                x++;
            }
            else{
                array[merged]=RArray[y];
                y++;
            }
            merged++;
        }
        
        while(x<LeftHalf)
        {
            array[merged]=LArray[x];
            x++;
            merged++;
        }
        
        while(y<RightHalf)
        {
            array[merged]=RArray[y];
            y++;
            merged++;
        }
        
    }
    
    void print(){
        for(int a:array)
           System.out.println(a);
    }
    
    
}

class partitionMovementLeft implements ActionListener{

    JButton button=null;
    int x,y;
    private Timer timerLeft=null,timerDown=null;
    
    partitionMovementLeft(JButton b){
        this.button=b;
        x=button.getLocation().x-2;
        y=button.getLocation().y+2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
       
        timerLeft=new Timer(100,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setLocation(button.getLocation().x-1,button.getLocation().y);
                
                if(button.getLocation().x==x){
                    timerLeft.stop();
                    timerDown.start();
                }
               
            }
            
            
            
        });
        
        timerDown=new Timer(100,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setLocation(button.getLocation().x,button.getLocation().y+1);
                if(button.getLocation().y==y){
                    timerDown.stop();
                }
               
            }
            
        });
        
        timerLeft.start();
    }
    
}

class partitionMovementRight implements ActionListener{

    JButton button=null;
    private Timer timerRight=null,timerDown=null;
    
    partitionMovementRight(JButton b){
        this.button=b;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int x=button.getLocation().x+2;
        int y=button.getLocation().y-2;
        timerRight=new Timer(20,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setLocation(button.getLocation().x+1,button.getLocation().y);
                
                if(button.getLocation().x==x){
                    timerRight.stop();
                    timerDown.start();
                }
               
            }
            
            
            
        });
        
        timerDown=new Timer(20,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setLocation(button.getLocation().x,button.getLocation().y-1);
                if(button.getLocation().y==y){
                    timerDown.stop();
                }
               
            }
            
        });
        
        timerRight.start();
    }
    
}