
public class array2d {
    public static void main(String[] args) {
        //int[][] val = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] val = new int[2][2];
        val[0][0]=1;
        val[0][1]=2;
        val[1][0]=3;
        val[1][1]=4;
        for (int i=0;i<val.length;i++){
            System.out.println();
            for (int j=0;j<val[i].length;j++){
                System.out.print(val[i][j]+" ");
            }
        }
    }
}