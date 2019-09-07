# algorithm-study
알고리즘 공부 정리 목적하에 작성합니다.  


## 01. selection sort (선택 정렬)    
* 특징
  * 가장 작은 값을 선택해 제일 앞으로 보내는 알고리즘
  * 가장 기초적인 정렬 방법입니다.
  * 시간 복잡도 = **O(N^2)**
    > ***cf. 원래는 N*(N+1)/2 수식이긴 하나 N값이 크다고 가정할땐 컴퓨터에선 '/2'와 '+1'와같은 값은 생략하기 때문입니다.**

* 공부 정리 자료 
  * Google Docs : (https://docs.google.com/document/d/1LGW2-1IFsg7CsCaoXsSi3wOSJ0s4BEG9DYT-St5vt3g/edit?usp=sharing)
  
* WEB IDE 실행 방법
  * codingground : [바로 Execute 실행하기](http://tpcg.io/nkZrOQ)
   
    
## 02. bubble sort (버블 정렬)
* 특징
  * 바로 옆에있는 값과 비교해 작은 값을 왼쪽으로 보내는 알고리즘
  * 정렬 방법 중 가장 비효율 적인 방법론입니다.
  * 시간 복잡도는 선택 정렬과 같이 **O(N^2)** 값이 지만, 값을 바꿔주는 연산이 선택정렬보다 잦게 일어나기에 가장 비효율적인 정렬 알고리즘입니다.
* 반대로 큰 값을 오른쪽으로 보낸다는 중점으로 진행해도 좋습니다.
   
   * 기존
   ```java
   for(int j=0;j<array.length;j++){
       for(int i=j;i<array.length-1;i++){
       }
   }
   ```
   * 다른 방안
   ``` java
   for(int j=0;j<array.length;j++){
       for(int i=0;i<array.length-(j+1);i++){
       }
   }
   ```
  
* 공부 정리 자료 
  * Google Docs : (https://docs.google.com/document/d/1raYIeelJPoXusFmTMoM6u6DLQg-i7OwmdGWgy8kVO-c/edit?usp=sharing)
  
* WEB IDE 실행 방법
  * codingground : [바로 Execute 실행하기](http://tpcg.io/COArRa)
