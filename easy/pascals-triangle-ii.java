// The first submission -> 2ms, 42.1mb
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>(1);
        row.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<Integer>(i + 1);
            newRow.add(1);
            for (int j = 1; j < i; j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1);

            row = newRow;
        }
        
        return row;
    }
}