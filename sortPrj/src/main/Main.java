package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		//bubble sort
		int[] arr = new int[] {10,8,3,5,1};
		
//		System.out.println("정렬 전 : " + Arrays.toString(arr));
//		bubbleSort(arr);
//		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
	}
	
	public static void bubbleSort(int[] arr) {
		//숫자 2개씩 비교(앞부터)(인접한 2개요소)(i번째, i+1번째)
		//만약에 자리가 이상하면(i번째>i+1번째) 둘이 자리 바꿈
		//위 작업을 반복
		//0 ~ arr.length - 2
		
		for(int j = 0; j < arr.length-1; ++j) {
			for(int i = 0; i < arr.length-1-j; ++i) {
				if(arr[i] > arr[i+1]) {
					//자리 바꿈
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr) {
		
		//한바퀴 돌면서 제일 작은거 찾기 (몇번 인덱스에 있는지)
		//맨 앞에다가 넣기
		for(int n = 0; n < arr.length-1; ++n) {
			int minIdx = n;
			for(int i = n; i < arr.length; ++i) {
				if(arr[minIdx] > arr[i]) {
					//minIdx 갱신
					minIdx = i;
				}
			}
			
			//맨앞에 넣기
			int temp = arr[minIdx];
			arr[minIdx] = arr[n];
			arr[n] = temp;
		}
	}

	
	
	
	
	
}




















