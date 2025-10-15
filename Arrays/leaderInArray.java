//A LEADER IS THAT ELEMENT THAT HAS ALL THE RIGHT ELEMENT TO IT LESSER THAN IT.

//I USED BRUTE FORCE APPROACH - O(n^2) , O(n^2)

// THE OPTIMIZED APPROACH WOULD BE - O(n^1)



// BRUTE FORCE
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> lst = new ArrayList<>();
        int n = arr.length;
        int index = 0;int c = 0;
        for(int i=0;i<n;i++)
        {
            
            c=0;
            
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>=arr[j])                           //LEADER IS THAT ELEMENT WHICH IS GREATER THAN OR EQUAL TO ITS RIGHT ELEMENT
                {
                    continue;
                }
                else
                {
                    c++;
                }
            }
            if(c==0)
            {
                lst.add(arr[i]);
            }
        }
        return lst;
    }
}




//OPTIMIZED APPROACH
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> lst = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        lst.add(maxFromRight); // rightmost element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                lst.add(maxFromRight);
            }
        }

        // Reverse to maintain order from left to right
        Collections.reverse(lst);
        return lst;
    }
}

//BASICALLY THE CONCEPT IS TO START FROM RIGHT AND KEEP CHECKING FOR MAX ELEMENT AND REPLACE IT.
