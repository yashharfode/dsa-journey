# 🌸 Mary and Flowers

A Java solution for the **Mary and Flowers** problem from Unstop.

## 📌 Problem

Mary wants to collect exactly **two types of flowers** whose total quantity is equal to a given target `t`.

The flower quantities are given in a **non-decreasing sorted array**. We need to find the **indices of two flowers** whose values add up to `t`.

If multiple pairs are possible, we need to return the **first occurrence**.

The indices are **zero-based**, and the first index must be smaller than the second.

### Example

```text
Input:
7 5
1 2 2 4 5 7 10

Output:
0 3
```

Explanation:

```text
arr[0] + arr[3]
= 1 + 4
= 5
```

So the answer is:

```text
0 3
```

---

## 💡 Approach

Since the array is already **sorted**, we can use **Binary Search**.

For every index `i`:

1. Keep `arr[i]` as the first flower.
2. Calculate the value we need:

   ```text
   required = t - arr[i]
   ```
3. Perform binary search in the remaining part of the array (`i + 1` to `n - 1`).
4. If the required value is found, return the two indices.

This avoids checking every possible pair manually.

---

## 🔍 Algorithm

```text
for each index i:
    search for (t - arr[i]) using binary search
    only search after index i

    if found:
        return i and found index
```

---

## ⏱️ Complexity

* **Time Complexity:** `O(N log N)`

  * We perform a binary search for each element.

* **Space Complexity:** `O(1)`

  * No extra data structure is required.

---

## 🧪 Sample Test Cases

### Test Case 1

```text
Input:
7 5
1 2 2 4 5 7 10

Output:
0 3
```

### Test Case 2

```text
Input:
5 2
1 1 2 3 4

Output:
0 1
```

---

## 💻 Java Solution

```java
import java.util.*;

public class Main {

    public static void find_flower_indices(int n, int t, int[] arr, int[] result) {
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                int key = arr[i] + arr[mid];

                if (key == t) {
                    found = true;
                    result[0] = i;
                    result[1] = mid;
                    break;
                }

                if (key < t) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            if (found) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = new int[2];

        find_flower_indices(n, t, arr, result);

        System.out.println(result[0] + " " + result[1]);
    }
}
```

---

## 🏆 Submission

* **Platform:** Unstop
* **Language:** Java 8
* **Result:** All Test Cases Passed ✅
* **Score:** 83/100

---

## 📚 Key Learning

This problem helped me practice:

* Arrays
* Nested loops
* Binary Search
* Working with sorted arrays
* Index-based problem solving
* Time complexity optimization

> **Key idea:** When an array is sorted, look for opportunities to replace a linear search with binary search.
