public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.err.println("---학생10명 성적데이타를 저장하기위한 배열객체생성 초기화---");
		int[] noArray= {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray={"KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "PIM", "MIN", "AIM", "LIM"};
		int[] korArray= { 12, 45, 34, 66, 98, 93, 82, 61, 72, 88 };
		int[] engArray= {32, 46, 64, 96, 58, 98, 62, 81, 32, 99};
		int[] mathArray= { 93, 89, 88, 46, 54, 23, 90, 85, 73, 34};
		int[] totArray= { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[] avgArray= {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		char[] gradeArray= {'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F'};
		int[] rankArray= {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	/*
	 * 총점,평균,평점계산
	 */
	for (int i = 0; i < rankArray.length; i++) {
		totArray[i]=korArray[i]+engArray[i]+mathArray[i];
		avgArray[i]=totArray[i]/3.0;
		
		if(avgArray[i]>=90) {
			gradeArray[i]='A';
		}else if(avgArray[i]>=80) {
			gradeArray[i]='B';
		}else if(avgArray[i]>=70) {
			gradeArray[i]='C';
		}else if(avgArray[i]>=60) {
			gradeArray[i]='D';
		}else {
			gradeArray[i]='F';
		}
		
	}	
	/*
	 * 총점으로 석차계산
	 */
	/*
	 * 1번학생(index-->0)석차계산
	 */
	for(int j=0;j<totArray.length;j++) {
		if(totArray[0]< totArray[j]) {
			rankArray[0]++;
		}
	}
	/*
	 * 1번학생(index-->0)석차계산
	 *//*
	 * 1번학생(index-->0)석차계산
	 *//*
	 * 1번학생(index-->0)석차계산
	 *//*
	 * 1번학생(index-->0)석차계산
	 *//*
	 * 1번학생(index-->0)석차계산
	 *//*
	 * 1번학생(index-->0)석차계산
	 *//*
	 * 1번학생(index-->0)석차계산
	 *//*
	 * 1번학생(index-->0)석차계산
	 */
	System.out.println("--------------");
	System.out.printf("--------------학생 성적출력-------------------\n");
	System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
	System.out.printf("-----------------------------------------------%n");
	for(int i=0;i<noArray.length;i++) {
		System.out.printf("%3d %4s  %d   %d   %d   %d   %.0f   %c   %d \n",noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
	}
	}
}
