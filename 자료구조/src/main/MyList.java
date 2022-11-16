package main;

//베열 : 사이즈가 고정
//List : 사이즈가 동적으로 변함

//사실은 그냥 배열
//꽉차면 사이즈 2배로 늘림
public class MyList {

	private Object[] arr;
	private int emptyIdx;
	
	public MyList() {
		arr = new Object[1]; //편의상 1칸짜리로
		emptyIdx = 0;		 //편의상 0으로 설정
	}
	
	//add
	//비어있는 칸에다가 데이터 넣기
	//만약에 데이터 넣었는데, 빈칸이 없으면 -> 사이즈 2배로 늘리기
	public void add(Object data) {
		
		arr[emptyIdx] = data;
		
		//빈칸이 이제 없다면
		if(arr.length - 1 == emptyIdx) {
			//사이즈 두배
			doubling();
		}
		
		emptyIdx ++;
		
	}
	
	//remove
	public void remove(int idx) {
		
		if(idx<0) {
			System.out.println("음수는 허용하지 않습니다.");
			return;
			//또는 예외 던지기
		}
		
		for(int i = idx; i < emptyIdx - 1; i++) {
			arr[i] = arr[i+1];
		}
		
		emptyIdx --;
	}
	
	//get
	public Object get(int idx) {
		return arr[idx];
	}
	//size
	public int size() {
		return emptyIdx; //비어있는칸 == 값이 들어가있는곳 까지의 길이
	}
	
	//사이즈 2배로 늘리기
	private void doubling() {
		//길이를 2배로 늘린 새 배열
		Object[] newArr = new Object[arr.length * 2];
		
		//기존 데이터 복사
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		arr = newArr;
	}

	public void prinInfo() {

		for(int i = 0; i < emptyIdx; i++) {
			System.out.println(i +"번째 값 ::: "+arr[i]);
		}
		
	}
	
	
	
}

















