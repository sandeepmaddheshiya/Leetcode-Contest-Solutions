

public class Check_If__Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="",s2="";
        for(int i=0;i<word1.length;i++){
            s1+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            s2+=word2[i];
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}