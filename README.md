
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
            int val = (int) alphaNum[i] - 96; //96 means 'a'-1 in ASCII Value.
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

# 2.Reverse Words in a Sentence

## Description
Given a sentence, reverse the order of its words and print the result.

## Input Format
- A single line string containing words separated by spaces

## Output Format
- The sentence with words in reverse order

## Code
```java
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String[] part = s1.split(" ");
        int s = part.length - 1;

        for (int i = s; i >= 0; i--) {
            System.out.print(part[i] + " ");
        }
    }
}
```
# Sample Input
Java is powerful

# Sample Output
powerful is Java
