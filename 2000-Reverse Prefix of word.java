class Solution {
    public String reversePrefix(String word, char ch) {
        int right=word.indexOf(ch);
        int left=0;
        char[] cha=word.toCharArray();

        while(left<right){
            char c=cha[right];
            cha[right]=cha[left];
            cha[left]=c;
            left++;
            right--;
        }

        return new String(cha);
    }
}
