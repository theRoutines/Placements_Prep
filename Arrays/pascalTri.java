class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> list1 = new ArrayList<>();
            long val = 1;
            list1.add(1);

            for(int k=1;k<=i;k++)
            {
                val = val * (i-k+1)/k;
                list1.add((int)val);
            }
            list.add(list1);
        }
        return list;
    }
}