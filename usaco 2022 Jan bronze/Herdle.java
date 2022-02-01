import java.util.*;
import java.util.Scanner;
public class Herdle {
    public static void main(String args[]){
        int g= 0, y= 0;
        char[][] array1 = new char[10000][10000];
        char[][] array2 = new char[10000][10000];
        Scanner console = new Scanner(System.in);
        for(int i=0;i<3;i++){String in = console.nextLine();
      for(int j=0;j<3;j++){
                array1[i][j] = in.charAt(j);
            }
        }
        for(int i=0;i<3;i++){
            String in = console.nextLine();
            for(int j=0;j<3;j++){
                array2[i][j] = in.charAt(j);
            }
        }
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                if(array1[i][j]!= array2[i][j]){
                    g+= 0;
                }
                else{
                    g+=1;
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Boolean test2 = true;
                char test1 = array2[i][j];
                for(int n=0;n<3;n++){
                    if(test2==false){break;}
                    else{
                        for(int m=0;m<3;m++){
                            if(test1==array1[n][m]){ 
                                test2=false;
                                array1[n][m]='X';
                                y++;
                                break;
                            }
                        }

                    }
                   
                }
            }
        }
        System.out.println(g);
        System.out.println(y-g);
    }
}