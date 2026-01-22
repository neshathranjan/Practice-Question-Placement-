# Java Practice Problems

## Navigation
- [1.Alphabet Position Sum](#qn1)
- [2.Reverse Words in a Sentence](#qn2)
- [3.Binary to Decimal Conversion (N-bit)](#qn3)
- [4.Find Index of Second Occurrence of a Character](#qn4)
---

<a id="qn1"></a>
## 1. Alphabet Position Sum

### Description
Given a number `s` and `s` lowercase alphabet characters, convert each character to its alphabetical position  
(`a = 1, b = 2, ..., z = 26`) and print the sum of all positions.

### Input Format
- Integer `s` — number of characters  
- `s` lowercase characters

### Output Format
- Integer representing the sum of alphabetical positions

### Code
```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        char[] alphaNum = new char[s];

        for (int i = 0; i < s; i++) {
            alphaNum[i] = in.next().charAt(0);
        }

        int total = 0;
        for (int i = 0; i < s; i++) {
            int val = alphaNum[i] - 96; // 'a' = 97 in ASCII
            total += val;
        }

        System.out.println(total);
    }
}
````

### Sample Input

```
5
a b c d e
```

### Sample Output

```
15
```

### Constraints

* Characters must be lowercase (`a` to `z`)

[⬆ Back to Navigation](#navigation)

---

<a id="qn2"></a>

## 2. Reverse Words in a Sentence

### Description

Given a sentence, reverse the order of its words and print the result.

### Input Format

* A single line string containing words separated by spaces

### Output Format

* The sentence with words in reverse order

### Code

```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String[] part = s1.split(" ");

        for (int i = part.length - 1; i >= 0; i--) {
            System.out.print(part[i] + " ");
        }
    }
}
```

### Sample Input

```
Java is powerful
```

### Sample Output

```
powerful is Java
```

[⬆ Back to Navigation](#navigation)

<a id="qn3"></a>
# 3.Binary to Decimal Conversion (N-bit)

## Description

This program converts a **binary number of variable length (N bits)** into its **decimal equivalent**.

* First, it reads an integer `n` representing the number of binary digits.
* Then it reads `n` binary values (`0` or `1`).
* Finally, it converts the binary number into decimal and prints the result.

---

## Input Format

* Integer `n` — number of bits
* `n` integers (`0` or `1`) separated by spaces

---

## Output Format

* A single integer representing the decimal value of the binary number

---

## Code-1

```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        int n = in.nextInt();
        int[] arr = new int[n];
        int power = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i]!=0 || arr[i]!=1) return;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                result += Math.pow(2, power);
                power++;
            } else {
                power++;
            }
        }

        System.out.println(result);
    }
}
```

# Optimized Code
```
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		char ch=sc.next().charAt(0);
		int first=word.indexOf(ch);
		int second = word.indexOf(ch, first+1);
		System.out.println(second);

	}
}
```
---

## Working Explanation

### Step 1: Read Input

* The program reads `n`, the number of bits.
* An integer array of size `n` is created.
* Each element is expected to be `0` or `1`.

---

## More Examples

### Input

```
4
1 1 1 1
```

### Output

```
15
```

---

### Input

```
3
0 0 1
```

### Output

```
1
```

---

## Constraints

* `1 ≤ n`
* Each element must be `0` or `1`

### Option 2: No Array at All (FAANG-style)

```java
for (int i = 0; i < n; i++) {
    int bit = in.nextInt();
    if (bit != 0 && bit != 1) {
        System.out.println("Invalid input");
        return;
    }
    result = (result << 1) | bit;
}
```
[⬆ Back to Navigation](#navigation)

---
## 4. Find Index of Second Occurrence of a Character

<a id="qn4"></a>

### Description

Given a string and a character, find the **index of the second occurrence** of the given character in the string.

* If the character occurs **at least two times**, print the index of the second occurrence.
* Otherwise, print `-1`.

---

### Input Format

* A string
* A single character

---

### Output Format

* Integer representing the index of the second occurrence
* `-1` if the character occurs fewer than two times

---

### Code

```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char ch = in.next().charAt(0);
        int count = 0;
        int result = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                result = i;
            }

            if (count == 2) {
                System.out.println(result);
                break;
            }
        }

        if (count != 2) {
            System.out.println(-1);
        }
    }
}
```

---

### Sample Input

```
programming
g
```

---

### Sample Output

```
10
```

---

### Explanation

The character `'g'` appears at indices **3** and **10**.
The index of the **second occurrence** is **10**, which is printed.

---

### Constraints

* String length ≥ 1
* Input character must be a single character

---
[⬆ Back to Navigation](#navigation)
