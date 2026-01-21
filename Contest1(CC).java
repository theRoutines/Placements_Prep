import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    HashMap<Integer,Integer> map = new HashMap<>();
		    int n1 = sc.nextInt();
		   
		    for(int j=0;j<n1;j++)
		    {
		        int num = sc.nextInt();
		        map.put(num, map.getOrDefault(num,0) + 1);
		    }
		    
		    
		    int maxFreq = Integer.MIN_VALUE;
		    int resultKey = Integer.MAX_VALUE;
		    
		    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
		        if(entry.getValue() > maxFreq){
		            maxFreq = entry.getValue();
		            resultKey = entry.getKey();
		        }
		        else if(entry.getValue() == maxFreq){
		            resultKey = Math.min(resultKey, entry.getKey());
		        }
		    }
		    System.out.println(resultKey);
		    
		    
		    
		}

	}
}




//LAYERED CAKE 
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int m=0;m<n;m++)
		{
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    
		    int[] A = new int[N];
		    int[] B = new int[M];
		    
		    for(int k1 = 0;k1<N; k1++)
		    {
		        A[k1] = sc.nextInt();
		    }
		    for(int k2 = 0;k2<M; k2++)
		    {
		        B[k2] = sc.nextInt();
		    }
		    
		    Arrays.sort(A);
		    Arrays.sort(B);
		    
		    long ans = 0;
		    int j = 0;
		    
		    for(int i = 0; i<N; i++)
		    {
		        while(j<M && B[j] < A[i]){
		            j++;
		        }
		        
		        ans += j;
		    }
		    System.out.println(ans);
		}

	}
}

