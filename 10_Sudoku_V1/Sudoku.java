public class Sudoku {
    public static void zeilePruefen(int[][] sudokuIn, int zeileIn, int spalteIn, int eingegebenerWert) {
        for (int spalte = 0; spalte <= 8; spalte = spalte + 1) {
            if (sudokuIn[zeileIn][spalte] == eingegebenerWert) {
                System.out.print("Diese Zahl gibt es schon in dieser Zeile. Versuche es erneut.\n");
            }
        }
        for (int zeile = 0; zeile <= 8; zeile = zeile + 1) {
            if (sudokuIn[zeile][spalteIn] == eingegebenerWert) {
                System.out.print("Diese Zahl gibt es schon in dieser Spalte. Versuche es erneut.\n");
            }
        }


        int dividentz = zeileIn;
        int divisor = 3;
        int restz = dividentz % divisor;
        System.out.println(restz);
        int kastenFindenz = dividentz - restz;
        System.out.print(kastenFindenz);

        int dividents = spalteIn;
        int rests = dividents % divisor;
        int kastenFindens = dividents - rests;
        System.out.print(kastenFindens);

        System.out.println(eingegebenerWert);
        for (int r = kastenFindenz; r < kastenFindenz + 3; r = r + 1) {
            for (int i = kastenFindens; i < kastenFindens + 3; i = i + 1) {
                if (sudokuIn[r][i] == eingegebenerWert) {
                    System.out.print("Diese Zahl gibt es in diesem Kasten schon. Versuche es erneut.\n");
                }
            }
        }

    }


    public static void main(String[] args) {

        System.out.println("Welches Sudoku möchtest du überprüfen?");

//        int[][] Sudoku;
//        Sudoku = new int[9][9];

        int[][] Sudoku = {

                {2, 1, 9, 5, 4, 3, 6, 7, 8},
                {5, 4, 3, 8, 7, 6, 9, 1, 2},
                {8, 7, 6, 2, 1, 9, 3, 4, 5},
                {4, 3, 2, 7, 6, 5, 8, 9, 1},
                {7, 6, 5, 1, 9, 8, 2, 3, 4},
                {1, 9, 8, 4, 3, 2, 5, 6, 7},
                {3, 2, 1, 6, 5, 4, 7, 8, 9},
                {6, 5, 4, 9, 8, 7, 1, 2, 3},
                {9, 8, 7, 3, 2, 1, 4, 5, 6}
        };


/*        int[][] board = {
                {0, 0, 0, 6, 0, 0, 4, 0, 0},
                {7, 0, 0, 0, 0, 3, 6, 0, 0},
                {0, 0, 0, 0, 9, 1, 0, 8, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 5, 0, 1, 8, 0, 0, 0, 3},
                {0, 0, 0, 3, 0, 6, 0, 4, 5},
                {0, 4, 0, 2, 0, 0, 0, 6, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 1, 0, 0}
        };
*/

/*
        Sudoku[0][0]=2;
        Sudoku[1][0]=5;
        Sudoku[2][0]=8;
        Sudoku[3][0]=4;
        Sudoku[4][0]=7;
        Sudoku[5][0]=1;
        Sudoku[6][0]=3;
        Sudoku[7][0]=6;
        Sudoku[8][0]=9;

        Sudoku[0][1]=1;
        Sudoku[1][1]=4;
        Sudoku[2][1]=7;
        Sudoku[3][1]=3;
        Sudoku[4][1]=6;
        Sudoku[5][1]=9;
        Sudoku[6][1]=2;
        Sudoku[7][1]=5;
        Sudoku[8][1]=8;

        Sudoku[0][2]=9;
        Sudoku[1][2]=3;
        Sudoku[2][2]=6;
        Sudoku[3][2]=2;
        Sudoku[4][2]=5;
        Sudoku[5][2]=8;
        Sudoku[6][2]=1;
        Sudoku[7][2]=4;
        Sudoku[8][2]=7;

        Sudoku[0][3]=5;
        Sudoku[1][3]=8;
        Sudoku[2][3]=2;
        Sudoku[3][3]=7;
        Sudoku[4][3]=1;
        Sudoku[5][3]=4;
        Sudoku[6][3]=6;
        Sudoku[7][3]=9;
        Sudoku[8][3]=3;

        Sudoku[0][4]=4;
        Sudoku[1][4]=7;
        Sudoku[2][4]=1;
        Sudoku[3][4]=6;
        Sudoku[4][4]=9;
        Sudoku[5][4]=3;
        Sudoku[6][4]=5;
        Sudoku[7][4]=8;
        Sudoku[8][4]=2;

        Sudoku[0][5]=3;
        Sudoku[1][5]=6;
        Sudoku[2][5]=9;
        Sudoku[3][5]=5;
        Sudoku[4][5]=8;
        Sudoku[5][5]=2;
        Sudoku[6][5]=4;
        Sudoku[7][5]=7;
        Sudoku[8][5]=1;

        Sudoku[0][6]=6;
        Sudoku[1][6]=9;
        Sudoku[2][6]=3;
        Sudoku[3][6]=8;
        Sudoku[4][6]=2;
        Sudoku[5][6]=5;
        Sudoku[6][6]=7;
        Sudoku[7][6]=1;
        Sudoku[8][6]=4;

        Sudoku[0][7]=7;
        Sudoku[1][7]=1;
        Sudoku[2][7]=4;
        Sudoku[3][7]=9;
        Sudoku[4][7]=3;
        Sudoku[5][7]=6;
        Sudoku[6][7]=8;
        Sudoku[7][7]=2;
        Sudoku[8][7]=5;

        Sudoku[0][8]=8;
        Sudoku[1][8]=2;
        Sudoku[2][8]=5;
        Sudoku[3][8]=1;
        Sudoku[4][8]=4;
        Sudoku[5][8]=7;
        Sudoku[6][8]=9;
        Sudoku[7][8]=3;
        Sudoku[8][8]=6;
        */

        for (int r = 0; r < 8; r = r + 1) {
            System.out.print("| ");
            for (int i = 0; i < 8; i = i + 1) {
                System.out.print(Sudoku[r][i]);
                System.out.print(" | ");


            }
            System.out.print("\n");
        }

        zeilePruefen(Sudoku, 8, 6, 7);//prüft zeile1 und spalte 1 nach einer zweiten 7

    }
}

