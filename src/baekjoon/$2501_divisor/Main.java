package baekjoon.$2501_divisor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        new Main().solve();
    }

    /*
    public void solve(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
            }
            //k번째 약수이면 i 출력
            if (k == 0) {
                System.out.print(i);
                return;
            }
        }
        //k번째 약수가 없으면 0 출력
        System.out.print(0);
    }
     */
    public void solve() {
        Scanner sc = new Scanner(System.in);
        //System.out.print("N 을 입력하세요 : ");
        int N = sc.nextInt();
        //System.out.print("K 를 입력하세요 : ");
        int K = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=1; i<=N; i++){
            if(N % i == 0 ) {
                al.add(i);
            }
            //System.out.println(al.toString());

        }
        if(al.size() >= K){
            System.out.println(al.get(K-1));
        }else{
            System.out.println(0);
        }

        //System.out.println(al.toString());

    }
}
