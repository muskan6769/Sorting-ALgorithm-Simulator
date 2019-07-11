/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author komal
 */
public class SimpleMergeSort{
    
      public static void main(String args[]){
         int a[]={3,6,1,4,7,0,10};
//          mergeSort m=new mergeSort(7,a,);
//          m.BreakInHalves(0, 6);
//          m.print();
          
          for(int i=0;i<a.length;i++){
              
          }
//          QuickSort q=new QuickSort(7,a);
//          q.quicky(0, 6);
//          q.print();
          
      }    
}

//class mergeSort {
//    
//    private int array[];
//    private JButton jb[];
//    private Timer timerL=null;
//    private Timer timerR=null;
//    
//    mergeSort(int n,int a[],JButton j[]){
//        this.array=new int[n];
//        jb=new JButton[n];
//        this.array=a.clone();
//        jb=j.clone();
//    }
//    
//    void BreakInHalves(int L,int R){
//       
//        int m,i;
//        if(L<R)
//        {
//            m=L+(R-L)/2;
//            for(i=L;i<m;i++){
//            timerL=new Timer(20,new partitionMovementLeft(jb[i]));
//            timerL.start();
//            }
//            BreakInHalves(L,m);
//            for(i=m+1;i<R;i++){
//            timerR=new Timer(20,new partitionMovementRight(jb[i]));
//            timerR.start();
//            }
//            BreakInHalves(m+1,R);
//            Merge(L,m,R);
//        }
//    }
//    
//    void Merge(int l,int M,int r){
//        int LeftHalf=M-l+1;
//        int RightHalf=r-M;
//        
//        int LArray[]=new int[LeftHalf];
//        int RArray[]=new int[RightHalf];
//        
//        for(int i=l;i<LeftHalf+l;i++){
//            LArray[i-l]=array[i];
//        }
//        for(int i=M+1;i<RightHalf+M+1;i++){
//            RArray[i-M-1]=array[i];
//        }
//        
//        
//        int x=0,y=0,merged=l;
//        
//        while(x<LeftHalf && y<RightHalf){
//            if(LArray[x]<RArray[y]){
//                array[merged]=LArray[x];
//                x++;
//            }
//            else{
//                array[merged]=RArray[y];
//                y++;
//            }
//            merged++;
//        }
//        
//        while(x<LeftHalf)
//        {
//            array[merged]=LArray[x];
//            x++;
//            merged++;
//        }
//        
//        while(y<RightHalf)
//        {
//            array[merged]=RArray[y];
//            y++;
//            merged++;
//        }
//        
//    }
//    
//    void print(){
//        for(int a:array)
//           System.out.println(a);
//    }
//    
//    
//}
//
//class partitionMovementLeft implements ActionListener{
//
//    JButton button=null;
//    private Timer timerLeft=null,timerDown=null;
//    
//    partitionMovementLeft(JButton b){
//        this.button=b;
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        
//        int x=button.getLocation().x-10;
//        int y=button.getLocation().y+15;
//        timerLeft=new Timer(20,new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                button.setLocation(button.getLocation().x-1,button.getLocation().y);
//                
//                if(button.getLocation().x==x){
//                    timerLeft.stop();
//                    timerDown.start();
//                }
//               
//            }
//            
//            
//            
//        });
//        
//        timerDown=new Timer(20,new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                button.setLocation(button.getLocation().x,button.getLocation().y+1);
//                if(button.getLocation().y==y){
//                    timerDown.stop();
//                }
//               
//            }
//            
//        });
//        
//        timerLeft.start();
//    }
//    
//}
//
//class partitionMovementRight implements ActionListener{
//
//    JButton button=null;
//    private Timer timerRight=null,timerDown=null;
//    
//    partitionMovementRight(JButton b){
//        this.button=b;
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        
//        int x=button.getLocation().x+10;
//        int y=button.getLocation().y-15;
//        timerRight=new Timer(20,new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                button.setLocation(button.getLocation().x+1,button.getLocation().y);
//                
//                if(button.getLocation().x==x){
//                    timerRight.stop();
//                    timerDown.start();
//                }
//               
//            }
//            
//            
//            
//        });
//        
//        timerDown=new Timer(20,new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                button.setLocation(button.getLocation().x,button.getLocation().y-1);
//                if(button.getLocation().y==y){
//                    timerDown.stop();
//                }
//               
//            }
//            
//        });
//        
//        timerRight.start();
//    }
//    
//}