public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String solution="";


        if (strs.length>1) {
            for (int i = 0; i < strs[1].length(); i++) {
                try{
                    if(strs[1].charAt(i)==strs[0].charAt(i)){
                    solution+=strs[1].charAt(i);
                }
                else break;
                }
                catch (Exception ignored){break;}


            }

            for (int i = 2; i <strs.length ; i++) {
                if (!strs[i].startsWith(solution)){
                    solution=solution.substring(0,solution.length()-1);
                    i--;
                }
            }
        }
        else {
            if (strs.length==1){
                solution=strs[0];
            }
        }
        return solution;
    }
}
