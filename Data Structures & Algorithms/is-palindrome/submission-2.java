class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, last = s.length()-1;

        while(start < last) {

            while(start < last && !isValidCharacter(s.charAt(start))) start++;
            while(start < last && !isValidCharacter(s.charAt(last))) last--;

            if(Character.toLowerCase(s.charAt(start)) !=                                   Character.toLowerCase(s.charAt(last))){
                return false;
            } else {
                start++;
                last--;
            }
        }

        return true;
    }

    private boolean isValidCharacter(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
