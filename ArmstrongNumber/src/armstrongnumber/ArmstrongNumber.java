/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongnumber;

import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ArmstrongNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int sum=0;
            int counter=0;
             int mod=1;
             int quo=0;          
             int ans,arm;
             List list=new ArrayList();
       for(int i=0; i<60000; i++){
           ans=i;
           arm=i;
             while(i!=0){
           mod=i%10;
           quo=i/10;
           i=quo;
           
           counter++;
           }
             i=ans;
           while(ans!=0){
           mod=ans%10;
           quo=ans/10;
           ans=quo;
           
           sum+=(int) pow(mod,counter);
           }
           
           if(arm==sum){
           list.add(arm);
           }
            sum=0; 
          counter=0;
      

      
        }
       System.out.println("this is the list of armstrong numbers from 0 to 60000");
       System.out.println(list);
}
}