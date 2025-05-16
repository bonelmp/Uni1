package exercise1;

public class MatrixMultMain {
	public static void main(String[] args) {
		int [] A = {9,1,-3};
		int [] B = {7,-1,1};
		
		int result = MatrixProduct(A, B);
		System.out.println(result);
		
	}
	
	public static int MatrixProduct (int [] A, int [] B) {
		int row = A.length;
		DotProductThread[] threads = new DotProductThread[row];
		
		
		for (int i = 0; i < row; i++) {
			threads[i] = new DotProductThread(A[i], B[i]);
			threads[i].start();
		}
		
		int dot = 0;
		for(int i = 0; i  < row; i++) {
			try {
				threads[i].join();
				dot += threads[i].dot;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return dot;
		// run wäre hier die bessere Wahl. Es handelt sich hier nicht um eine komplexe Anweisung weswegeb ein Thread nicht nötig wäre. Es ist nicht notwendig, dass ein Programm parallel läuft.
		
	}
}

class DotProductThread extends Thread {
	int v1, v2, dot;

	public DotProductThread(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public void run() {
		dot = dot + v1 * v2;
	}

}
