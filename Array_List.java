package assignments;
import java.util.Scanner;

public class Array_List {
	int arr[];
	int size;
	final int default_size = 10;
	
	Array_List(){
		this.arr = new int[default_size];
		this.size = 0;
	}
	
	public void insert(int a) {
		
		if (size == arr.length) {
			int newArr[] = new int[arr.length*2];
			for(int i = 0; i< size; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[size] = a;
		size++;
		
	}
	
	public int get(int index) {
		
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Array Index Out Of Bounds");
		}
		return arr[index];
		
	}
	
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(" | " +arr[i] + " | ");
		}
		System.out.println();
	}
	
	public void reverse() {
		for (int i = size; i >= 0; i--) {
			System.out.print(" | " +arr[i] + " | ");
		}
		System.out.println();
	}
	
	public int getSize() {
		return size;
	}
	
	public void delete(int index) {
		System.out.println( arr[index] +" has been deleted");
		for(int i = index; i < size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		display();
	}
	
	public void sort() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		display();
		System.out.println();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Array_List al = new Array_List();
		al.insert(60);
		al.insert(10);
		al.insert(50);
		al.insert(20);
		al.insert(5);
		al.insert(16);
		System.out.println("Array Elements Inserted successfully");
		
		System.out.println("Enter The Index you want to search: ");
		int n = sc.nextInt();
		System.out.println(" | "+al.get(n)+ " | ");
		
		System.out.println("\nDisplaying the ArrayList :");
		al.display();
		
		System.out.println("\nReversed ArrayList :");
		al.reverse();
		
		System.out.println("\nSorted ArrayList :");
		al.sort();
		
		System.out.println("Size of The ArrayList : " + al.getSize());
	}
}
