import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        String temp = "";
                        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }
        }
        
        if(!temp.equals("")){
            answer = temp;
        }
        return answer;
    }
}