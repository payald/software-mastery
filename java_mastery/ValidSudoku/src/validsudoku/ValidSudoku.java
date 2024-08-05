/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validsudoku;

import static java.lang.Character.isDigit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Leetcode 36 Valid Sudoku
 * @author payal
 */
public class ValidSudoku {
    static class RowCol{
        int col;
        int row;
        public RowCol(int x,int y){
            row=x;col=y;
        }
        
        //hashcode and equals added for hashmap
        @Override
        public int hashCode() {
            int hash = 3;
            hash = 97 * hash + this.col;
            hash = 97 * hash + this.row;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final RowCol other = (RowCol) obj;
            if (this.col != other.col) {
                return false;
            }
            return this.row == other.row;
        }

        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] board={{'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}};
        char[][] board1={{'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board)?"true":"false");
        System.out.println(isValidSudokuNeetCode(board1)?"true":"false");
    }
    
    private static boolean isValidRowsAndColumns(char[][] board,int rowStart,int rowSize,int colStart, int colSize){
        
        for(int row=rowStart;row<rowSize;row++){
            //check if all rows are unique
            Set<Character> numSet=new HashSet<>();
            for(int col=colStart;col<colSize;col++){
                char entry=board[row][col];
                if (isDigit(entry)){
                    if (numSet.contains(entry)){
                        return false;
                    }
                    numSet.add(entry);
                }
            }
        }
        
        for(int col=colStart;col<colSize;col++){
            //check if all columns are unique
            Set<Character> numSet=new HashSet<>();
            for(int row=rowStart;row<rowSize;row++){
                char entry=board[row][col];
                if (isDigit(entry)){
                    if (numSet.contains(entry)){
                        return false;
                    }
                    numSet.add(entry);
                }
            }
        }
        
        return true;
    }
    private static boolean isValidSudoku(char[][] board){
        
        int colSize=board.length;
        int rowSize=board[0].length;
        
        if (!isValidRowsAndColumns(board, 0, rowSize, 0, colSize)){
            return false;
        }        
        //check all the nine sub-boxes
        for(int row=1;row<=3;row++){           
            int rowstart=3*row;
            for(int col=1;col<=3;col++){
                int colstart=3*col;
                if (!isValidRowsAndColumns(board, rowstart, rowSize, colstart, colSize)){
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean isValidSudokuNeetCode(char[][] board){
        
        int colSize=board.length;
        int rowSize=board[0].length;
        List<Set<Character>> rows=new ArrayList<>(Collections.nCopies(rowSize, null));
        List<Set<Character>> cols=new ArrayList<>(Collections.nCopies(colSize, null));
        Map<Integer,Map<Integer,Set<Character>>> subSets=new HashMap<>();//map of row of map of col
        for(int row=0;row<rowSize;row++){            
            for(int col=0;col<colSize;col++){
                char entry=board[row][col];
                Set<Character> rowSet=rows.get(row);
                Set<Character> colSet=cols.get(col);
                if (rowSet==null){
                    rowSet=new HashSet<>();
                    rows.set(row, rowSet);
                }
                if (colSet==null){
                    colSet=new HashSet<>();
                    cols.set(col, colSet);
                }
                Map<Integer, Set<Character>> mapOfCols = subSets.get(row);
                if (mapOfCols==null){
                    mapOfCols=new HashMap<>();
                    Set<Character> charset= new HashSet<>();
                    mapOfCols.put(col, charset);
                    subSets.put(row, mapOfCols);
                }
                if (isDigit(entry)){
                    if (rowSet.contains(entry) || colSet.contains(entry)){
                        return false;
                    }
                    rowSet.add(entry);
                    rows.set(row, rowSet);
                    colSet.add(entry);
                    cols.set(col, colSet);
                    Set<Character> charset=subSets.get(row).get(col);
                    if (charset==null){
                        charset= new HashSet<>();
                    }
                    charset.add(entry);
                    subSets.get(row/3).put(col/3, charset);
                }
            }
        }
        
        return true;
    }
    
}
