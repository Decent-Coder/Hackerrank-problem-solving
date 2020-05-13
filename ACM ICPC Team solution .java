import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {

            int s=topic.length;
            //int mks=0,mt=0;
            int t[]={0,0};
                for(int i=0;i<s;i++)
                {
                    for(int j=i+1;j<s;j++)
                    {
                        int n=num(topic[i],topic[j]);
                        if(n>t[0])
                        {
                            t[0]=n;
                            t[1]=0;
                        }
                        if(n==t[0])
                        {
                            t[1]++;
                        }
                    }
                }

            return t;

    }   
    private static int  num(String s1,String s2)
    {   
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1'||s2.charAt(i)=='1')
                c++;
        }
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
