package Sorting_BubbleSort;

import java.util.*;

/* Sorting Algorithm - BubbleSort*/

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [5]; // 기본 배열
		int [] temp = new int [5]; // 임시 배열
		int [] array_up = new int[5]; // 오름차순 배열
		int [] array_down = new int[5]; // 내림차순 배열
		boolean same = false;
		
		for(int i = 0; i < 5; i++){
			Random r = new Random();
			int a = r.nextInt(20); // 랜덤한 숫자 배열 안에 채워넣기
			
			// 중복된 숫자가 들어가는 것을 막는 알고리즘
			for(int j = 0; j <=i; j++){
				if(array[j] == a)
				{
					i = i-1;
					same = true;
				}
			}
			
			if(same == false)
				array[i] = a;
			else
				same = false;
		}
		
		for(int i = 0; i < 5; i++)
		{
			array_down[i] = array[i];
			array_up[i] = array[i];
		}
		
		//오름차순
		int t = 0;
		for(int i = 0; i < 5-1; i++)
		{
			for(int j = 0; j < 5-1-i; j++)
			{
				if(array_up[j] > array_up[j+1]){
					t = array_up[j];
					array_up[j] = array_up[j+1];
					array_up[j+1] = t;
				}
			}
		}
		
		//내림차순
		int h = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5-1-i; j++)
			{
				if(array_down[j] < array_down[j+1]){
					h = array_down[j];
					array_down[j] = array_down[j+1];
					array_down[j+1] = h;
				}
			}
		}
		
		// 초기 배열 출력
		System.out.print("초기 배열: ");
		for(int i = 0; i < 5; i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
		// 오름차순 배열 출력
		System.out.print("오름차순 배열: ");
		for(int i = 0; i < 5; i++)
			System.out.print(array_up[i]+" ");
		
		System.out.println();
		// 내림차순 배열 출력
		System.out.print("내림차순 배열: ");
		for(int i = 0; i < 5; i++)
			System.out.print(array_down[i]+" ");
	}

}
