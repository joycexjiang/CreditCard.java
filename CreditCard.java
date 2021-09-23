/** 
 * Programming Exercise Problem 2: Credit Card Problem
 * @author: Joyce Jiang
 * uni: jj3115
 * Date: February 15, 2021
 */

public class CreditCard{
     //initiatizing variables
     private int ErrorCode; //changes to int between 0-6 if condition fails test
     private boolean validity;
     private String number;
     
     private int first;
     private int second;
     private int third;
     private int fourth;
     private int fifth;
     private int sixth;
     private int seventh;
     private int eighth;
     private int ninth;
     private int tenth;
     private int eleventh;
     private int twelfth;
     
     //constructor: accepts card number with /dashes/ as string
     //initialize instance variables
     public CreditCard(String creditCardNumber){
          number=creditCardNumber;
          validity=false;
          ErrorCode=0;
         // 4064-5830
          first=Integer.parseInt(number.substring(0,1));
          second=Integer.parseInt(number.substring(1,2));
          third=Integer.parseInt(number.substring(2,3));
          fourth=Integer.parseInt(number.substring(3,4));
          fifth=Integer.parseInt(number.substring(5,6));
          sixth=Integer.parseInt(number.substring(6,7));
          seventh=Integer.parseInt(number.substring(7,8));
          eighth=Integer.parseInt(number.substring(8,9));
          ninth=Integer.parseInt(number.substring(10,11));
          tenth=Integer.parseInt(number.substring(11,12));
          eleventh=Integer.parseInt(number.substring(12,13));
          twelfth=Integer.parseInt(number.substring(13,14));
         //
     }
     
     
     //helper mutator methods to check conditions
     private void condition1(){
          if (first==4){
               validity=true;
          }else{
               ErrorCode=1;
          }
     }
     
     private void condition2(){
          //if fifth + 1 == fourth, then its true
          int addOne=fifth+1;
          if (addOne==fourth){
               validity=true;
          }else{
               validity=false;
               ErrorCode=2;
          }
     }
    
     private void condition3(){
          //if first * fifth * ninth digits = 24, true
          int product=first*fifth*ninth;
          if (product==24){
               validity=true;
          }else{
               validity=false;
               ErrorCode=3;
          } 
     }
     
     private void condition4(){
          //12 digits
          //if sum=first+second+... 
          //sum%4 == 0;
          int sumAll=first+second+third+fourth+fifth+sixth+seventh+eighth+ninth+tenth+eleventh+twelfth;
          if (sumAll%4==0){
               validity=true;
          }else{
               validity=false;
               ErrorCode=4;
          }
     }
     
     private void condition5(){
          int sumofFirstFour=first+second+third+fourth;
          int sumofLastFour=ninth+tenth+eleventh+twelfth;
          int change=sumofLastFour-1;
          if (change==sumofFirstFour){
               validity=true;
          }else{
               validity=false;
               ErrorCode=5;
          }
     }

     private void condition6(){
          // addTwo = opposute of parse and treat it as two digit number
          // seventh and eighth ^ same thing
          //their sum must be 100
          int firstTwo=Integer.parseInt(number.substring(0,2));
          int lastTwo=Integer.parseInt(number.substring(7,9));
          if (firstTwo+lastTwo==100){
               validity=true;
          }else{
               validity=false;
               ErrorCode=6;
          }
     }
     
     //check() stores the info (t/f valid) in an variable validity
     public void check(){
          condition1(); //if true goes to second; while loop?
          if (validity == true){
               condition2();
               if (validity==true)
                    condition3();
                    if (validity==true)
                         condition3();
                         if (validity==true)
                              condition4();
                              if (validity==true)
                                   condition5();
                                   if (validity==true)
                                        condition6();
                                        
          }
     }
     
     
     //accessor methods
     public boolean isValid(){
          return validity;
     }
     
     public int getErrorCode(){
          return ErrorCode;
     }
}
