package CodelityTest;

public class MinMaxDivision {
	public	int	solution(int K,int M,int[]A) {
		int min =0;
		int max=0;
		for(int a:A){
			max +=a;
			min=Math.max(a,min);
			
		}
		
		int bestAnswer=max;
		while(min <=max) {
		int mid =(min +max)/2;  
		int blocks=checkBlocks(A,mid);
		if(blocks>K) {
			min=mid +1;
		}else {
			max=mid-1;
			if(mid<bestAnswer) {
				bestAnswer=mid;
				}
			}
		}
		return bestAnswer;		
	}
	private int checkBlocks(int[]A,int guess) {
		int blocks =1;
		int blockSum=0;
		
		for(int a:A) {
			blockSum +=a;
			if(blockSum >guess){
				blockSum=a;
				blocks++;
				
				
			}
		}
		return blocks;
	}
	

}
