import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_1966_프린터큐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int N = sc.nextInt();	// 문서의 개수
			int M = sc.nextInt();	// Queue에서 출력해야할 문서의 위치
			ArrayList <Integer> arr = new ArrayList<Integer>();
			int answer=0;
			// Queue 입력받기
			for(int i=0;i<N;i++) {
				arr.add(sc.nextInt());
			}
			
			while(true) {
				int prior = Collections.max(arr);
				int curr = arr.remove(0);
				
				if(M>=0) M-=1;
				else M+=arr.size();
				
				if(curr==prior) {
					answer+=1;
					if(M==-1) {System.out.println(answer); break;}
				}
				else {
					arr.add(curr);
				}
				
			}
			
		}
	}
}
