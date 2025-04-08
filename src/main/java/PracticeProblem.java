public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int sum2D(int[][] int2d){
		int x=0;
		for(int i = 0; i < int2d.length;i++){
			for(int z=0;z<int2d[i].length;z++){
				x += int2d[i][z];
			}
		}
		return x;
	}

	public static int sumRow(int[][] int2d, int o){
		int x=0;
		for(int i=0;i<int2d[o].length;i++){
			x += int2d[o][i];
		}
		return x;
	}

	public static int sumColumn(int[][] int2d, int o){
		int x=0;
		for(int i=0;i<int2d.length;i++){
			x += int2d[i][o];
		}
		return x;
	}
}
