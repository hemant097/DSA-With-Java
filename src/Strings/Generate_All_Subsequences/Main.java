//Enter code here
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class Main {
    static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				if(st.hasMoreTokens()){
					str = st.nextToken("\n");
				}
				else{
					str = br.readLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	} 
    public static void generateSubs(String arr,int N,String curr,int index){
    
    if(curr.length()>0){
        System.out.println(curr);
    }
    
    if(index== N){
        return;
    }
    
    for(int i=index;i<N;i++){
        curr+=arr.charAt(i);
        
        generateSubs(arr,N,curr,i+1);
        curr = curr.substring(0,curr.length()-1);
        //System.out.println(curr+"-"+i);
    }
   
// return;
}
    public static void main(String[] args) throws IOException {
    
   /* FastReader s = new FastReader();
	int n = s.nextInt();
    String str = s.nextLine();
*/

String str = "abcd";
    
    generateSubs(str,n,"",0);
    
   }
}
