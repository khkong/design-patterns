# MVC pattern
MVC pattern은 모델 - 뷰 - 컨트롤러 패턴을 뜻한다. 응용프로그램의 개념을 분리하는데 사용한다.
 
### 상세설명
 - MVC pattern은 아래와 같이 3가지로 나뉠 수 있다.
   1. 컨트롤러 : 모델에 명령을 보냄으로써 모델의 상태를 변경할 수 있다.
   2. 모델 : 모델의 상태에 변화가 있을 때 컨트롤러와 뷰에 이를 통보한다. 이와 같은 통보를 통해서 뷰는 최신의 결과를 보여줄 수 있고, 컨트롤러는 모델의 변화에 따른 적용 가능한 명령을 추가, 제거, 수정할 수 있다. 어떤 MVC 구현에서는 통보 대신 뷰나 컨트롤러가 직접 모델의 상태를 읽어 오기도 한다.
   3. 뷰 : 사용자가 볼 결과물을 생성하기 위해 모델로부터 정보를 얻어온다.
   
   ![ex_screenshot](../../res/ex_mvc.png)
   
### 클래스 설명
 - EventSource.kt : Obserable object
 - Observer.kt : Obserber object
 - TsstObserver.kt : client
 
### 다이어그램
![ex_screenshot](../../res/observerpattern.jpeg)

### 주의사항
 - JDK9 부터 [3][Observalbe](https://docs.oracle.com/javase/9/docs/api/java/util/Observable.html), [4][Observer](https://docs.oracle.com/javase/9/docs/api/java/util/Observer.html)가 없어 짐.
 - 오라클은 기존 객체들을 대신해서 [5][Flow](https://docs.oracle.com/javase/9/docs/api/java/util/concurrent/Flow.html)를 사용하라고 한다. 
 - 오라클은 2018년 9월 이후 Java SE 8의 추가 업데이트를 게시하지 않는다고 공식 발표했다.
 
### 참조:
[1]https://en.wikipedia.org/wiki/Observer_pattern

[2]https://en.wikipedia.org/wiki/Callback_(computer_programming)

[3]https://docs.oracle.com/javase/9/docs/api/java/util/Observable.html

[4]https://docs.oracle.com/javase/9/docs/api/java/util/Observer.html

[5]https://docs.oracle.com/javase/9/docs/api/java/util/concurrent/Flow.html