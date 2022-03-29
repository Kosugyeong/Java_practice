# Java_practice
자바를 공부하며 직접 푼 예제들입니다.



자바 자료형
1. 값형
 - 값이 변경되어도 공간의 크기는 변화가 없다. ex) int는 값이 변경돼도 공간의 크기는 계속 4byte)
2. 참조형(reference)
 - 값이 변경되면 공간의 크기가 변한다. -> String과 같이..
    
-> 면접에서 물어볼 때가 있다. 이 부분 꼭 기억하기!!!!

면접에서 - 인터페이스가 객체를 만들 수 없는 이유는? 라고 물으면 추상 멤버를 가지고 있기 때문에 실체화할 수 없다.고 대답하면 된다!


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
			 
			espresso[i] = new Espresso();// ********무조건 객체 생성해서 각 요소에 저장!!
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


<2022-3-28>
조원들과 각자 자신의 코드를 가지고 코드 리뷰하는 시간을 매일 1시간씩 가지는데, 코드 리뷰 시간을 갖을 때마다 모두 같은 코드인데도 표현하는 방식이 다르고, 선호하는 자신만의 표현방식이 있다는 것이 명확하게 보인다. 코드리뷰를 통해 내가 표현한 부분을 다른 조원들의 코드와 비교하며 다르게 생각해서 표현할 수 있다는 점을 깨달을 수 있어 생각을 더 넓게 할 수 있게 하는 활동이라고 생각된다. 또한 비용 절감을 위해 코드의 중복성은 최대한 줄이는 것이 좋다고 하였는데 오늘 코드리뷰한 부분의 조건문을 사용하는 부분에서 모두들 이 코드의 중복성을 어떻게 하면 줄일 수 있을까...라는 의견이 나왔다. 결론적으로 중복성을 줄여서 코드를 짠 조원분이 있었고 모두들 그 조원들 코드를 보며 와.. 이렇게 생각할수도 있구나.. 하고 감탄하였다. 나도 앞으로 코드의 가독성을 높이고, 중복성을 줄이기 위해 더더 연습해야겠다!

<2022-3-29>
Object 단점을 해결하기 위해 Generic을 도입했지만, 그렇다고 Generic만 사용하지 말고 Object도 사용해보고 Generic도 사용해보면서 개인적으로 어느것이 더 괜찮다고 느껴지는지 직접 느껴보고 생각해보기!!! 
