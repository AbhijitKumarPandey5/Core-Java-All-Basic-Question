
public class DuplicatNumber {
public static void main(String[] args) {
	int arr[] = {45,87,34,23,54,45};
	System.out.println("Duplicate number");
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
		}
	}
}
}
