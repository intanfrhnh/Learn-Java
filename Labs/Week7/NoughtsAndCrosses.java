package Week7;

public class NoughtsAndCrosses {
    private static final int NONE = 0;
    private static final int NOUGHTS = 1;
    private static final int CROSSES = 2;

    private int whoWon = NONE;

    private int[][] board;

    public NoughtsAndCrosses(int[][] board){
        this.board = board;

        if (didPlayerWin(CROSSES)){
            whoWon = CROSSES;
        } else if (didPlayerWin(NOUGHTS)) {
            whoWon = NOUGHTS;
        }
    }
    private int getResultInCell(int cellNum){
        if(cellNum<0 || cellNum>8){
            return -1;
        }
        int row = cellNum/3;
        int column = cellNum%3;
        return board[row][column];
    }

    private boolean didPlayerWin(int playerNumber){
        int[][] winningLines = {{0,1,2},{3,4,5},{6,7,8},
                                {0,3,6},{1,4,7},{2,5,8},
                                {0,4,8},{2,4,6}};
        for(int winningLineIndex = 0; winningLineIndex < winningLines.length; winningLineIndex++){
            int[] wLine = winningLines[winningLineIndex];

            boolean b0 = getResultInCell(wLine[0]) == playerNumber;
            boolean b1 = getResultInCell(wLine[1]) == playerNumber;
            boolean b2 = getResultInCell(wLine[2]) == playerNumber;

            if(b0 && b1 && b2){
                return true;
            }
        }
        return false;
    }

    public boolean isDraw(){
        return whoWon() == NONE;
    }

    public int whoWon(){
        return whoWon;
    }

    public static void main(String[] args) {
        int[][] board = { { NONE, NONE, NOUGHTS },
                          { NONE, NONE, NOUGHTS },
                          { NONE, NONE, NOUGHTS }, };

        NoughtsAndCrosses nc = new NoughtsAndCrosses(board);
        System.out.println(nc.isDraw());
        System.out.println(nc.whoWon());
    }
}
