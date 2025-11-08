// [1,3,6,8,9] , x = 5
// Floor - 3
// Ceil - 6
// We had to check in the array. 

import java.util.*;
class Aniket
{
    public static void main(String args[])
    {
        int arr[] = [1,3,6,8,9];
        int target = 5;
        for(int i=0;i<4;i++)
        {
            if(arr[i-1]<target && arr[i]>target)
            {
                System.out.print("Floor: ",+(i-1));
                System.out.print("Ceil: ",+(i));
            }
        }
    }
}
// OPTIMIZED APPROACH - O(log n)
class Aniket {
    public static void main(String args[]) {
        int arr[] = {1, 3, 6, 8, 9};
        int target = 5;

        int floor = findFloor(arr, target);
        int ceil = findCeil(arr, target);

        System.out.println("Floor: " + (floor == -1 ? "None" : arr[floor]));
        System.out.println("Ceil: " + (ceil == -1 ? "None" : arr[ceil]));
    }

    // Find floor index
    static int findFloor(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int floorIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid; // target itself is floor
            else if (arr[mid] < target) {
                floorIndex = mid;  // possible floor
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return floorIndex;
    }

    // Find ceil index
    static int findCeil(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ceilIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid; // target itself is ceil
            else if (arr[mid] > target) {
                ceilIndex = mid;  // possible ceil
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ceilIndex;
    }
}

















