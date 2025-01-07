class Solution {
    public List<String> stringMatching(String[] words) {
       List<String> a=new ArrayList<>();
       for(int i=0;i<words.length;i++){
        for(int j=0;j<words.length;j++){
            if(i!=j&&words[i].contains(words[j])){
               if(!a.contains(words[j])){
                a.add(words[j]);
               }
            }
        }
       }
       return a;
       
        
    }
}