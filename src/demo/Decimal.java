package demo;

public class Decimal {

	public static void main(String[] args) {
		int[] i= {-4,3,-9,0,4,1};
		int countNegetive=0,countZero=0,countPositive=0;
		for (int j = 0; j < i.length; j++) {
			if (i[j]>0) {
				countPositive++;
			} else if(i[j]<0) {
				countNegetive++;
			}else {
				countZero++;
			}
		}
		double size=i.length;
		System.out.format("%.6f",countNegetive/size);
		System.out.print(" ");
		System.out.format("%.6f",countPositive/size);
		System.out.print(" ");
		System.out.format("%.6f",countZero/size);
}
}
