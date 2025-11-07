//LOWER BOUND - IS THE ELEMENT WHICH IS JUST EXCEEDDE THE TARGET
// [1,2,4,7,9] TARGET = 5, THEN LOWER BOUND INDEX IS :- 3 

// BRUTE FORCE APPROACH - o(N)
public static int lowerBound(int []arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                // lower bound found:
                return i;
            }
        }
        return n;
    }

//OPOTIMIZED APPROACH 
public static int lowerBound(int[] arr, int n, int x){
  int left = 0; int right = n-1;
  int ans = n;

  while(left<=right){
    int mid = left + (right-left)/2;
    if(arr[mid]>=x){
      ans = mid;
      right = mid-1;
    }
    if(arr[mid]<x){
      left =  mid+1;
    }
  }
  return ans;
}
  
