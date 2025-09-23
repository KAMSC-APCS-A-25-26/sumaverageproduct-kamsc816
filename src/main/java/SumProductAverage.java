// NAME                     :       Sam Miller
// GROUP                    :       APCS-A
// LAST MODIFIED            :       9/9/25
// PROBLEM ID               :       Lewis 2.2-2.3 Arithmetic
// PROBLEM DESCRIPTION      :       Find the sum, product, and average of 3 numbers
// SOURCES I USED           :       AP CS Textbook
// PEOPLE I HELPED          :       None
// PEOPLE WHO HELPED ME     :       Mr. Houtrouw, Brady Winther-McGinnis
import java.util.Scanner;

public class SumProductAverage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double var1, var2, var3, numRuns;
        numRuns = sc.nextInt();
        for(int i=0; i<numRuns;i++)
        {
            var1 = sc.nextDouble();
            var2 = sc.nextDouble();
            var3 = sc.nextDouble();

            System.out.println("Your sum is " + (var1+var2+var3));
            System.out.println("Your product is " + (var1*var2*var3));
            System.out.println("Your average is " + ((var1+var2+var3)/3)+"\n");
        }
    }
}


/*
/Users/1093a247-f2e4-4afe-af78-e99969a655bc/Library/Java/JavaVirtualMachines/openjdk-24.0.2+12-54/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=50225 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/1093a247-f2e4-4afe-af78-e99969a655bc/Documents/Miller2.2_2.3/out/production/Miller2.2_2.3 Main
222.2 222.2 222.2
Your sum is 666.5999999999999
Your product is 1.0970645047999999E7
Your average is 222.19999999999996

3.14159 25.6 17
Your sum is 45.74159
Your product is 1367.219968
Your average is 15.247196666666667

100 0 55.5
Your sum is 155.5
Your product is 0.0
Your average is 51.833333333333336


Process finished with exit code 0
 */
