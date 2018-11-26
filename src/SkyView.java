public class SkyView {
    private double[][] view;
    int numCols, numRows;
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        this.numRows = numRows;
        this.numCols = numCols;
        double[][]view = new double [numRows][numCols];
        int idx = 0;
        for(int x =0; x<numRows;x++)
        {
            if(x%2 != 0) {
                for (int i = numCols - 1; i >= 0; 1--)
                {
                    view[x][i] = scanned[idx];
                    idx++
                }
            }
            else
            {
                for(int i=0;i<numCols;i++)
                {
                    view[x][i] = scanned[idx];
                    idx++;
                }
            }
        }
        public double getAverage(int startRow;int endRow; int startCol; int endCol)
        {
            int count = 0;
            int sum = 0;
            for(int x = startRow;x<endRow;x++)
            {
                for(int i = startCol; i<endCol;i++)
                {
                    sum += view[x][i];
                    count++;
                }
            }
            return(sum/count);
        }
    }
}
