# 🌸 Mary and Flowers

## 📌 Problem Statement

One day, Mary wanted to give a present to her friend. She decided on a beautiful bouquet of flowers and began collecting them. She needed precisely 2 types of flowers, and the total number of flowers required was 't'. To gather these, she started picking from her garden, which contained 'N' types of flowers. Each type was arranged in a queue in non-decreasing order, such as 1, 3, 6, 15, and so forth.

Now, she seeks your help in determining the indexes of the flowers she should collect.

> **Note:** For every case, there will always be a pair of flowers whose sum equals 't'. If multiple pairs exist, select the first occurrence.

---

## 📥 Input Format

The first line contains integers `N` and `t` where, `N` is the total types of flowers and `t` is the total number of flowers needed.

The second line contains `n` integers `a1, a2, …, an` — elements of the `a` array.

---

## 📤 Output Format

Print the indexes of the two flowers that sum up to `t`.

The first index should be smaller than the second index. Both indexes should be zero-based.

---

## 📏 Constraints

* `2 <= N <= 10^4`
* `1 <= a[i] <= 10^3`
* `2 <= t <= 2 * 10^3`

---

## 🧪 Sample Testcase 0

### Input

```text
7 5
1 2 2 4 5 7 10
```

### Output

```text
0 3
```

### Explanation

The sum of flowers at index 0 and index 3 is `1 + 4 = 5`, which matches the required total number of flowers needed.

---

## 🧪 Sample Testcase 1

### Input

```text
5 2
1 1 2 3 4
```

### Output

```text
0 1
```

### Explanation

The sum of flowers at index 0 and index 1 is `1 + 1 = 2`, which matches the required total number of flowers needed.

---

# 💡 My Approach

The array is already sorted in **non-decreasing order**, so I used **Binary Search**.

* I take each element using the outer `for` loop.
* For every `arr[i]`, I search for the second element between `i + 1` and `n - 1`.
* I calculate the sum:

  ```text
  arr[i] + arr[mid]
  ```
* If the sum is equal to `t`, I store both indices.
* If the sum is smaller than `t`, I move `start` to the right.
* If the sum is greater than `t`, I move `end` to the left.
* Once the pair is found, I stop the search using the `found` variable.

Since the array is sorted, Binary Search helps reduce the time compared to checking every possible pair.

---

# 💻 Solution

```java
import java.util.*;

public class Main {
    public static void find_flower_indices(int n, int t, int[] arr, int[] result) {
        // Write your logic here.
        boolean found = false;
       
        for(int i = 0; i < n; i++){
        int start = i+1, end = n-1;
        while(start<= end){
            int mid = (start+end)/2;
            int key = arr[i] + arr[mid];
            if(key == t){
                found = true;
                result[0] = i;
                result[1] = mid;
                break;

            }
            if(key < t){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(found){
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

# ⏱️ Complexity

* **Time Complexity:** `O(N log N)`
* **Space Complexity:** `O(1)`

---

# 🏆 Submission Result

| Detail     | Result             |
| ---------- | ------------------ |
| Platform   | Unstop             |
| Problem    | Mary and Flowers   |
| Language   | Java 8             |
| Test Cases | **12/12 Passed** ✅ |
| Score      | **100/100** 🏆     |
| Approach   | Binary Search      |
| Solved     | **Independently**  |

---

## 📚 Key Learning

This problem helped me practice **Binary Search on a sorted array** and understand how a suitable searching technique can reduce the time complexity of finding a pair.
