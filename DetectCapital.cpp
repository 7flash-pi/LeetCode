class Solution {
public:
    bool detectCapitalUse(string word) {
        int i = 0;
        int len = word.length();
        
        // all capital letters
        if(isupper(word[0]) && isupper(word[1])) {
            for(i=2; i<len; i++) {
                if(islower(word[i])) {
                    return false;
                }
            }
        }else{ 
            // ignore the first letter
            // if there is any capital letter
            // in positions other than 0
            // return false
            for(i=1; i<len; i++) {
                if(isupper(word[i])) {
                    return false;
                }
            }
        }
        
        return true;
    }
};