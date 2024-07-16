package Week5;

public class NbyN {

    public static int[][] nbyn(int N)
    {
        int[][] matrix = new int[N][N];

        for (int i=0; i<N ; i++)
        {
            for(int j=0; j<N; j++)
            {
                if(i!=j)matrix[i][j] = 0;
                else matrix[i][j] = i;
            }
        }
        return matrix;
    }

    public static void main(String[] args)
    {
        int[][] matrix = nbyn(10);
        for (int i=0; i< matrix.length ; i++)
        {
            for(int j=0; j< matrix.length; j++)
            {
                if(j== matrix.length-1) System.out.println(matrix[i][j]);
                else System.out.print(matrix[i][j]+" ");
            }
        }

    }
}
