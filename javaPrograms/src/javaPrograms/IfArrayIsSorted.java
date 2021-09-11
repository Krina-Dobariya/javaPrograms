package javaPrograms;

public class IfArrayIsSorted {

	public static void main(String[] args) {
		int array[] = {4,23,36,78,99,109};
		System.out.println(IfArraySorted(array));


	}
	public static boolean IfArraySorted(int[] array) {
		int arrayLength=array.length;
		for(int i=0;i<arrayLength-1;i++) {
			if(array[i]>array[i+1]) {
				return false;
			}
		}
		return true;
	}
}

