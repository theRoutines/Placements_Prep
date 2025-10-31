class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long val = 1;
        list.add(1);

        for(int k=1;k<= rowIndex;k++)
        {
            val = val * (rowIndex -k +1 ) / k;
            list.add((int)val);
        }
        return list;

    }
}
