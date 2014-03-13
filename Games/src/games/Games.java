//this is  an app that generates numbers and stores them in array as the face of 
//a die and the randomly visits the lovations of the array keepping track of the
//number of times it visits the array insices
package games;

//import the class Random.
import java.util.Random;

public class Games {

    
    public static void main(String[] args) 
    {
        int[]Freq=new int[7];
        //create an object of the class as in Scanner.
      Random old=new Random();
      int x1=0;
      int x2=0;
      int x3=0;
      int x4=0;
      int x5=0;
      int x6=0;
      int face;
      for(int x=1;x<=21;x++)
      {
          //It select a random number from 0 to 6 and assign it to face.
          //to input datat from keyboad,the () in nextInt is empty.but in random,it contain the number that it is to chose randomly.
         face= 1+old.nextInt(6);
         //Array freq is used hear as a counter.Counting the occurance of the random variables
         //if an occurance is eg 2,the array location 2 will be increamented.And so on.
         //It highly replace he switch method.
     // You could still use '++Freq[1+old.nextInt(6)] ;'
         ++Freq[face];
      
         
          System.out.printf("%d",face);
         if(x % 5==0)
         {
             System.out.println();
           
         }
         
         
         
         
      /*   switch(face)
         {
             case 1:
                 ++x1;
                 break;
             case 2:
                 ++x2;
                 break;
             case 3:
                 ++x3;
                 break;
             case 4:
                 ++x;
                 break;
             case 5:
                 ++x5;
                 break;
             case 6:
                 ++x6;
                 break;
                
           }
       
         */
      }
      System.out.print("\nFACE\tFREQUENT\n");
      for(int x=1;x<7;++x)
          //hear,just the array name and it location will give the number if time that location was visited.
      System.out.printf("%d\t %d\n",x,Freq[x]);
     // System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",x1,x2,x3,x4,x5,x6);
    }
}
