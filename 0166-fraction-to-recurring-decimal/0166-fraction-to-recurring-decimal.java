class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
         if (numerator == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();

        res.append(((numerator > 0) ^ (denominator > 0)) ? "-":"");

        long num1 = Math.abs((long) numerator  );
        long num2 = Math.abs((long) denominator);

        long rem = num1 % num2 ;
            res.append(num1/num2);
        if(rem == 0){
            return res.toString();
        }
        res.append('.');

        HashMap<Long,Integer> hmap = new HashMap<>();
        hmap.put(rem , res.length());
        while(rem != 0 ){
            rem *= 10;
            res.append(rem / num2);
             rem = rem % num2;
            if(hmap.containsKey(rem)){
                int idx = hmap.get(rem);
                res.insert(idx,"(");
                res.append(")");
                break;
            }
            else{
            hmap.put(rem , res.length());
            }
        }


        return res.toString();
     }
}