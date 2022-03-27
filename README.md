# Java_practice
자바를 공부하며 직접 푼 예제들입니다.



자바 자료형
1. 값형
 - 값이 변경되어도 공간의 크기는 변화가 없다. ex) int는 값이 변경돼도 공간의 크기는 계속 4byte)
2. 참조형(reference)
 - 값이 변경되면 공간의 크기가 변한다. -> String과 같이..
    
-> 면접에서 물어볼 때가 있다. 이 부분 꼭 기억하기!!!!    

그리고 클래스, if문 뭐 이런걸 사용할 때 쓰면서 느꼈던 편리한점과 같은 나의 생각들 정리를 해놔서 나중에 면접 때 이런 이론 물어보면 ' 프로젝트에서 사용하였고 ~게 사용하여서 ~게 느끼게 되었습다'와 같이 면접에서 내 경험과 덧붙여서 얘기해놔야함.


<2022-3-25>
메모(일기)....
오늘 클래스를 배웠는데 나는 왜이렇게 헷갈리지...???!?!? 과제를 풀고 있는데 클래스에서 다른 클래스에 있는 변수에 값을 넣고 그걸 가져오게 하는것을 해결 못하겠다. 컴파일하면 죄다 컴파일 오류메시지 떠서 너무 슬프다,,,,, 자꾸 java.lang.NullPointerException 이 메시지가 뜨는데 ㅠㅠㅠㅠㅠ 요즘 매일매일 과제하느라 코딩을 하니까 뭘 해도 자꾸 알고리즘 생각만 난다. 심지어 자다가도 if... 이러면서 모든 상황을 코딩식으로 생각하게 되었다,,,, ㅠㅠ 

<2022-3-27>
클래스의 static 관련 문제 두 개를 풀었다. 그 중 첫번째 문제는 어려움 없이 풀었는데 두번째 문제에서 어려움을 겪었다.
첫번째로는 Coffee클래스의 총판매액이라는 변수의 값을 다른 클래스에서 출력하는 것이였다. 그래서 Coffee 클래스의 setter와 getter를 생성해 setter 부분에 단가와 총 량을 곱한 값을 저장하게 만들었는데 

	public static void setBeanTotalPrice(int beanTotalPrice) { 
		Coffee.beanTotalPrice = bean * beanUnitPrice;
	}
 
 위와 같이 했더니 출력할 때 제대로 된 값이 안나오고 계속 0으로 나왔다. 
 
 	public static int getBeanTotalPrice() {
		return bean * beanUnitPrice;
	}
 그래서 위와 같이 결국에 getter 부분 return에 식을 넣으니 계산된 값이 제대로 나왔다. ---> 이유가 무엇일까!!!!!!!!!!
 
 
 - 두번째로 내가 겪었던 어려움은 Barista 클래스안에 있는 메소드 처리에서였다.
 	public Espresso[] makeEspressoes(int bean, int count) {

		Espresso[] espresso = new Espresso[count];

		for (int i = 0; i < count; i++) {

			espresso[i].setBean(bean);
			Coffee.setBean(Coffee.getBean() + bean);
			Coffee.setEspresso(Coffee.getEspresso() + 1);



		}
		return espresso;
	}
 컴파일을 하면  espresso[i].setBean(bean) 이 부분에서 java.lang.NullPointerException 이 오류가 떴다. 분명 null 값이여서 espresso[i] 에 접근조차 못하는 것 같은데 도무지 해결을 어떻게 해야할지 몰라 한참을 헤맸다ㅠㅠ 조건문으로 if(espresso[i]!=null)과 같이 처리를 해봤더니 아예 이 값이 null이니까 코드가 건너뛰고 실행이 안되길래 이 코드는 아닌것 같고 여러가지 시도를 해보다가 반복문 안에 객체 생성해서 참조 변수에 넣어주는 코드를 넣어봤다 그랬더니 코드가 실행이 되는것이였다!!!!!!! 진짜 해결이 됐을 때 느껴지는 뿌듯함은 정말 기분이 좋다... 이건 경험해보면 해볼수록 더더 뿌듯하게 느껴진다. 
 결론을 내자면, 다른 클래스의 객체를 배열로 여러개 생성해서 setter에 접근해 값을 넣으려면 또 다른 객체를 생성해 참조 변수에 담아준 뒤 그 값을 클래스 객체 배열에 넣어줘야 한다. 이렇게 하지않으면 nullPoiter 오류가 뜨니 조심하고 꼭 기억하기!
 
 <고친 코드>
  	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] espresso = new Espresso[count];

		for (int i = 0; i < count; i++) {
			Espresso e = new Espresso(); // ********이거 생성안해줘서 계속 널 포인터 오류 났었다.... 무조건 객체 생성해서 참조 변수에 저장해주기
			espresso[i] = e;// ********* 저장한 참조변수를 클래스 배열에 저장해주기
			espresso[i].setBean(bean);
			Coffee.setBean(Coffee.getBean() + bean);
			Coffee.setEspresso(Coffee.getEspresso() + 1);



		}
		return espresso;
	}
 
 
 느낀점 : 이번 과제를 하며 클래스를 사용해보고 static 변수도 사용해봤는데 클래스는 어렵지만 코드를 짤 때 클래스로 나눔으로써 가독성도 더 높고 편리한 것 같다. 그리고 공용 변수와 같이 여러 클래스에서도 함께 사용하는 변수를 static으로 지정해놓고 공통변수로 같이 사용하면 된다는 사용법 또한 알게 되었다. 
 
*** static -> 정적 변수 -> 클래스 변수 -> 공용 변수
1. 하나의 클래스로부터 만들어진 모든 객체가 공통으로 가지는 데이터를 저장하는 변수
2. 모든 객체의 공통된 특성(****)
