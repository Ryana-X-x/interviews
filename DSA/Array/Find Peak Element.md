- Peak element is the element which is the biggest in it's neighbors (left and right adjacent) 
- If there is only 1 neighbor like for arr[0] -> arr[1] or for arr[n - 1] -> arr[n - 2], then if they are greater than their only neighbor that still counts.

- **Brute force** would be to do linear search, simple but O(n) time
- **Optimized** could be using ==Binary Search== 

---
- The question only wants to return 1 peak element not all, so if the array is sorted then it would always have at least 1 at the end because then arr[n - 1] would be the biggest.
- So we can always continue to move in 1 direction lets say left -> right. if there is anomaly we will get that with mid and if not then the last element would be

---
