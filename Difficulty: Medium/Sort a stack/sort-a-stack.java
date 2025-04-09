//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()){
            return s;
        }
        
       int temp = s.pop();
      
        
         sort(s);
         
         fn(temp , s);
        
        return s;
        
    }
    
    public void fn(int x , Stack<Integer> s ){
        if(s.isEmpty() || s.peek() < x){
            s.add(x);
            return ;
        }
        
        int y = s.peek();
        s.pop();
        fn(x,s);
        s.add(y);
        
        
        
    }
}