package CTCI;

import java.util.ArrayList;

public class RotateMatrix {
    public static class Matrix{

        private class MatrixOutOfBoundsException extends Exception { }
        private class MatrixInvalidParameterException extends Exception { }
        private boolean isRotated;
        private int mRowSize;
        private int mColumnSize;
        private int[][] mArray;

        private boolean checkNegative(int firstVar,int secondVar){
            return ( firstVar < 0 || secondVar < 0);
        }

        public Matrix(int row,int column) throws MatrixInvalidParameterException {
            if(checkNegative(row,column)){
                throw new MatrixInvalidParameterException();
            }
            mRowSize = row;
            mColumnSize = column;
            mArray = new int[row][column];
            isRotated = false;
        }

        public int getSize() {
            return mRowSize*mColumnSize;
        }

        public void setVar(int lRow,int lColumn,int value) throws MatrixOutOfBoundsException, MatrixInvalidParameterException {
            int row = lRow -1;
            int column = lColumn -1;
            if(checkNegative(row,column)){
                throw new MatrixInvalidParameterException();
            }
            if(column >= mColumnSize || row >= mRowSize){
                throw new MatrixOutOfBoundsException();
            }
            if(isRotated){
                mArray[column][row] = value;
            }
            else{
                mArray[row][column] = value;
            }
        }

        public int getVar(int lRow,int lColumn) throws MatrixOutOfBoundsException, MatrixInvalidParameterException {
            int row = lRow -1;
            int column = lColumn -1;
            if(checkNegative(row,column)){
                throw new MatrixInvalidParameterException();

            }
            if(column >= mColumnSize || row >= mRowSize){
                throw new MatrixOutOfBoundsException();
            }
            if(isRotated){
                return mArray[column][row];
            }
            else{
                return mArray[row][column];
            }
        }
        public Matrix inverse(){
            isRotated = !isRotated;
            int rowSize = mRowSize;
            mRowSize = mColumnSize;
            mColumnSize = rowSize;

            return this;
        }

        private ArrayList<Integer> newCoordinates(int x,int y){
//            ArrayList<Integer> coord = new ArrayList<>();
//            if( ( x > mRowSize/2) &&( y > mColumnSize/2)){
//                coord.add(mRowSize - x);
//                coord.add(y);
//                return coord;
//            } else if(( x > mRowSize/2) &&( y < mColumnSize/2)){
//                coord.add(mRowSize - x);
//                coord.add(y);
//                return coord;
//            }
//            else if(( x < mRowSize/2) &&( y > mColumnSize/2)){
//                coord.add(x);
//                coord.add(mColumnSize - y);
//                return coord;
//            }
//            else{
//                coord.add(mRowSize - x);
//                coord.add(y);
//                return coord;
//            }
            return null;
        }

        public Matrix rotateBy90Degrees() throws MatrixOutOfBoundsException, MatrixInvalidParameterException {
            //TODO
            return null;
        }

        @Override
        public String toString(){
            String lMatrixString = "The Current Matrix is: \n";
            lMatrixString += "------------------------------------------- \n";
            for(int i = 0; i < mRowSize;i ++){
                lMatrixString += "( ";
                for(int j = 0; j< mColumnSize; j++){
                    try {
                            lMatrixString += getVar(i+1,j+1) + ", ";
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
                lMatrixString = lMatrixString.substring(0, lMatrixString.length() - 2);
                lMatrixString += " )\n";
            }
            lMatrixString += "------------------------------------------- \n";
            return lMatrixString;
        }
    }

    public static void main(String[] args) {
        try {
            Matrix m = new Matrix(2,5);
            m.setVar(2,3,5);

            System.out.println(m.rotateBy90Degrees());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
