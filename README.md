
# 1.Alphabet Position Sum

## Description
Given a number `s` and `s` lowercase alphabet characters, convert each character to its alphabetical position  
(`a = 1, b = 2, ..., z = 26`) and print the sum of all positions.

## Input Format
- Integer `s` — number of characters
- `s` lowercase characters

## Output Format
- Integer representing the sum of alphabetical positions

## Code
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
            int val = (int) alphaNum[i] - 96;
            total += val;
        }

        System.out.println(total);
    }
}
```
## Sample Input
5

a b c d e
## Sample Output
15

## Constraints
- Characters must be lowercase (`a` to `z`)
