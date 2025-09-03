class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> hmap = new HashMap<>();
        
        hmap.put( 'I' ,1) ;
        hmap.put( 'V' ,5) ;
        hmap.put( 'X' ,10) ;
        hmap.put( 'L' ,50) ;
        hmap.put( 'C' ,100) ;
        hmap.put( 'D' ,500) ;
        hmap.put( 'M' ,1000) ;

        int ans = 0 ;
        int n= s.length();
        int i = n-1;

        while(i>0){
            int v = hmap.get(s.charAt(i));
            int vb = hmap.get(s.charAt(i-1));
            if(v > vb){
                ans = ans + v - vb;
                i-=2;
               
            }else{
                ans = ans + v;
                i--;
            }
        }

        if(i==0)
        ans += hmap.get(s.charAt(0));

        return ans;
    }
}