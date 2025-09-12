class Solution {
    public String sortVowels(String s) {
       ArrayList<Character> arr = new ArrayList<>();
       ArrayList<Integer> arr2 = new ArrayList<>();
       for(int i = 0 ; i<s.length() ; i++){
        if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u' ||  s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' || s.charAt(i) == 'U'  ){
        arr.add(s.charAt(i));
        arr2.add(i);
        }
       }

       Collections.sort(arr);
       String t = "";
       int j = 0;
       for(int i = 0 ; i<s.length() ; i++){
        int idx = -1;
        if(arr2.size() != 0 && j < arr2.size()){
         idx = arr2.get(j);
        }
         if(i == idx){
            t += arr.get(j);
            j++;
         }
         else{
            t += s.charAt(i);
         }
       }

       return t ; 
    }
}