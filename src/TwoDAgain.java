public class TwoDAgain {
    public static void main(String[] args) {
        int[][] twoD=new int[4][];
        twoD[0]=new int[1];//в 0 ой строке 1 столбец
        twoD[1] =new int[2];//в 1 ой строке 2 столбца (массив лесенка)
        twoD[2]=new int[3];
        twoD[3]=new int[4];
          int i, j, k=0;
        for(i=0;i < 4;i++)
          for(j=0;j<i+1;j++){
              twoD[i][j]=k;
              k++;
          }
        for (i=0; i < 4 ;i++) {
            for (j = 0; j < i + 1; j++)
            System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}