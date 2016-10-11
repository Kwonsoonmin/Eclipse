package Searching_BinarySearch;

import java.util.*;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Mynum;
		int[] array = {1,4,8,9,15,25,28,29,40,46};
		
		System.out.print("찾기 원하는 숫자(1~50)를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		Mynum = scan.nextInt();
		
		BinarySearch(array,Mynum);
	}
	
	public static void BinarySearch(int[] arr, int target){
		int first = 0;
		int last = arr.length-1;
		int middle = 0;
		boolean find = false;
		int count = 0;
		
		while(first <= last){
			middle = (first+last)/2;
			
			if(target == arr[middle]){
				find = true;
				PrintString(middle, count);
				break;
			}
			
			else{
				if(target < arr[middle]){
					last = middle - 1;
					count++;
				}
				
				else{
					first = middle+1;
					count++;
				}
			}
		}
		
		if(find == false){
			System.out.println("숫자를 찾지 못했습니다.");
		}
	}
	
	public static void PrintString(int index, int count){
		System.out.println("숫자를 찾았습니다. 배열의" + index + "번 위치에 존재합니다." );
		System.out.println("숫자를 찾기 위해  " + count + " 번 시도했습니다." );
	}
}
