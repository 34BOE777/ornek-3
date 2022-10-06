package com.company;

public class Main {
    //sıfır matrisi birim matrise çeviren kod 

    public static void main(String[] args) {
	int a[][]  =new int[3][3];
    for(int i=0;i<3;i++){
        {
            for(int j=0;j<3;j++){
                if(i==j){
                    a[i][j]=1;
                }
                else a[i][j]=0;
            }
        }
    }
        for(int i=0;i<3;i++) {
            {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }

    }
}
