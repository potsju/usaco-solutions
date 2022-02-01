import java.util.*;
import java.util.Scanner;
public class drought{
 public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int iterations =console.nextInt();
        long[] output = new long[iterations];
        for(int n=0;n<iterations;n++){
            long count = 0,  amt = 0, smallest = Long.MAX_VALUE;
            int arraysize = console.nextInt(); long[] array1 = new long[arraysize]; Boolean end = false; int m = 0;
            while(m < arraysize){
                array1[m]=console.nextLong();
                if(array1[m] < smallest){ smallest = array1[m]; }
                if((m!=arraysize-1)&&(m%2==0) &&(m!=0)){
              if(0>(array1[m]-amt)){ end = true;}
                    else{ count = count +amt; array1[m] = array1[m]-amt;
                             if(array1[m] < smallest){   smallest=array1[m];  }
                    }
                }
                if(m!=arraysize-1&& (m%2==1)){
                    if((array1[m] < array1[m-1])){ end=true; }
                    else{
                        amt=(array1[m]-array1[m-1]);  count = count + amt;   array1[m]=array1[m]-amt;
                        if(array1[m] < smallest){
                            smallest=array1[m];
                        }
                    }
                }
                if(m==arraysize-1&& m %2== 0&&m!=0){
                    array1[m]-=amt;
                    if(0>array1[m]){ end=true; }
                    count = count + amt;
                    if(array1[m] < smallest){ smallest=array1[m];     }
                    if(smallest != array1[m]){ end=true; }
                }
                if((m==arraysize-1) && (m%2==1)){
                    if(array1[m-1]!=array1[m]){  end=true;   }
                }
                m++;
            }
            
            if(end==true){  output[n] = output[n]-1; continue;
            }
            else if(end == false){   int k =0;
         while(k < arraysize){   count+=(array1[k]-smallest); k++;
                } 
                output[n]=count;
            }
        }
        int o =0;
        while(o< iterations){  System.out.println(output[o]); o++;
        }
        
    }    
}