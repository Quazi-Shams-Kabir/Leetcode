//https://leetcode.com/problems/maximum-population-year/

public class maxpopyear {
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int[] year = new int[101]; //year range given 1950 to 2050

        for (int[] log: logs){   //make year counting array from 1950 and add when birth sub when dead.
            year[log[0]-1950]++;
            year[log[1]-1950]--;
        }
        int maxnum=year[0];
        int ans=1950;
        for (int i = 1; i <year.length ; i++) {
            year[i]+=year[i-1];{
            if (year[i]>maxnum){
                maxnum=year[i];
                ans=i+1950;
            }
        }
    }
        return ans;
}
    }
