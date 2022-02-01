import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] victories = new String[10000];
        int times = console.nextInt();
        for(int i =0;i< times;i++){
            int rollone[] = new int[10000];    int rolltwo[] = new int[10000];   int rollthree[] = new int[10000];
            int victory = 0, defeat = 0;
     
            Boolean runtime = false;
            Boolean winnersandlosers = true;
            for(int j=0;j<4;j++){
                rollone[j]=console.nextInt();
            }
            for(int j=0;j<4;j++){
                rolltwo[j]=console.nextInt();
            }
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(rollone[j]>rolltwo[k]){
                        victory++;
                    }
                    if(rollone[j]<rolltwo[k]){
                        defeat++;
                    }
                }
            }

            if(victory<defeat){
                winnersandlosers = false;
            }
            else if(victory==defeat){
                victories[i]="no";
                continue;
            }

            for(int j=1;j<11;j++){
                if(runtime==true){
                    break;
                }
                for(int k=1;k<11;k++){
                    if(runtime==true){
                        break;
                    }
                    for(int l=1;l<11;l++){
                        if(runtime==true){
                            break;
                        }
                        for(int m=1;m<11;m++){
                            rollthree[0]=j;
                            rollthree[1]=k;
                            rollthree[2]=l;
                            rollthree[3]=m;
                            int victory1=0;
                            int defeat1=0;
                            int victory2=0;
                            int defeat2=0;
                            for(int n=0;n<4;n++){
                                for(int o=0;o<4;o++){
                            
                                    if(rollthree[n]>rollone[o]){
                                        victory1++;
                                    }
                                    if(rollthree[n]<rollone[o]){
                                        defeat1++;
                                    }
                                    if(rollthree[n]>rolltwo[o]){
                                        victory2++;
                                    }
                                    if(rollthree[n]<rolltwo[o]){
                                        defeat2++;
                                    }
                                }
                            }
                            if(victory1==defeat1||victory2==defeat2){
                                continue;
                            }
                            if(winnersandlosers){
                                if(victory1>defeat1&&victory2<defeat2){
                                    runtime=true;
                                }
                            }
                            else{
                                if(victory1<defeat1&&victory2>defeat2){
                                    runtime=true;
                                }
                            }
                            if(runtime==true){
                                victories[i]="yes";
                                break;
                            }
                        }
                    }
                }
            }
            if(runtime==false){
                victories[i]="no";
            }
        }
        for(int i=0;i<times;i++){
            System.out.println(victories[i]);
        }
    }
}