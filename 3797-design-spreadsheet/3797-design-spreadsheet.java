class Spreadsheet {

    private int grid[][];

    public Spreadsheet(int rows) {
    grid = new int[rows][26];    
    }
    
    public void setCell(String cell, int value) {
        int indices[] = parseCellReference(cell);
        grid[indices[0]][indices[1]] = value;
    }
    
    public void resetCell(String cell) {
        int indices[] = parseCellReference(cell);
        grid[indices[0]][indices[1]] = 0 ;
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);
        String[] parts = formula.split("\\+");
        int sum = 0 ;
        for(String part : parts){
            sum += evaluatePart(part);
        }
        return sum ;
    }

    public int[] parseCellReference(String cell){
        int row = Integer.parseInt(cell.substring(1)) - 1;
        int col = cell.charAt(0) - 'A' ;
        return new int[]{row, col};
    }

    public int evaluatePart(String part){
        if(part.matches("[A-Z]\\d+")){
            int indices[] = parseCellReference(part);
            return grid[indices[0]][indices[1]] ;
        }else{
            return Integer.parseInt(part);
        }
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */