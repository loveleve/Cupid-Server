# REST API 명세

- 로그인
    - path : /auth
    - Method : post
    - Success Status : 2xx
    - fail status : 4xx error, 5xx error
- 로그아웃
    - path : /auth
    - Method : delete
    - Success Status : 2xx
    - fail status : 4xx error, 5xx error
- 회원가입
    - path : /users
    - Method : Post
    - Success Status : 2xx
    - fail status : 4xx error, 5xx error
- 회원탈퇴
    - path : /users
    - Method : delete
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error
- 회원정보변경
    - path : /users
    - Method : put
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error
- 회원 전체 보기
    - path : /users
    - Method : get
    - Succes Status : 2xx
    - fail Status : 4xx error, 5xx error
- 회원 조건 검색
    - path : /users/condition?
    - Method : get
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error
- 찜
    - path :/followers/{username}
    - Method : post
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error
- 신고
    - path : /restricts/{username}
    - Method : post
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error

------------------------------------------------------------------------------

# 브랜치 전략 (GitFlow 방식)

## GitFlow란?
GitFlow 전략을 사용하여 브랜치를 관리합니다.  
코드리뷰 : PR을 통해 Merge전 코드리뷰를 진행하여 사전에 발생할 수 있는 문제를 방지함과 동시에 함께 고민하고 개발을 진행합니다.

+ Master : 제품으로 출시될 소스를 저장하는 브랜치입니다. 
+ Develop : 개발이 완료된 부분만 Merge합니다.
+ Feature : 기능을 개발하는 브랜치 입니다.
+ Hotfixs : Master 브랜치에서 발생한 버그를 수정하는 브랜치입니다.
![image](https://user-images.githubusercontent.com/59078557/211580433-6fd943c3-405e-4bb8-b95e-f522fe631278.png)

## 작업방식 (큐피드에서 선정한 )
1. 메인 저장소를 fork 해온다.
2. fork 한 Repository를 clone 한다.
3. git remote add upstream <메인 저장소 주소>를 통해 upstream 설정을 한다.
4. git fetch를 통해 최신 코드를 받아온다
5. upstream/develop 브랜치에서 feature 브랜치를 생성한다.
6. 작업 완료된 fearure 브랜치를 origin 브랜치로 push 한다.
7. 해당 브랜치를 upstream으로 PR을 올린다.
8. 코드 리뷰 진행 후 Merge를 진행한다.

------------------------------------------------------------------------------

# 배포 파이프라인

![스크린샷 2023-01-16 오후 10 47 09](https://user-images.githubusercontent.com/77387861/212693158-8b1e4d21-e58f-47cc-87b1-e7bfd16211b9.png)
