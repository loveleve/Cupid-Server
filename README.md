# Team Intro.

---

안녕하세요. 백엔드 4명과 데브옵스 1명으로 이루어진 Team.Cupid 입니다. Java와 React를 활용하여 매칭 프로그램 개발을 목표로 하고 있으며 다양한 기술과 코드 디자인을 통해 프로덕트 고도화를 꾸준히 해나갈 예정입니다.

- 리드 : 아이시보
- 데브옵스 : GOLF
- 백엔드
    - 준서
    - 어피치
    - 튜브
    

# Project Intro.

---

채팅 기반 남녀 매칭 프로그램 서비스 `Meetup` 입니다. `koreancupid` 를 벤치마킹하여 개발하였습니다. Meetup의 핵심 기능은 **채팅과 회원 프로필** 입니다. 기능은 대략 다음과 같습니다. 

- 회원 프로필 생성
- 채팅
- 회원 프로필 조회

사용자는 프로필 사진을 올리고 본인에 대한 소개를 작성하여 매력을 상대방에게 어필하고 대화할 수 있습니다. 



# Project Main Point. (PMP)

---

다음과 같은 기술적 문제 또는 비즈니스 상황을 해결해보고자 합니다.

- 채팅 서버는 매우 많은 부하가 일어나는 서비스입니다. 또한 실시간성이 매우 중요합니다. 적은 리소스로 많은 트래픽을 처리하고 이벤트 기반의 프로그램을 만들어볼 예정입니다.
- 회원 프로필 조회는 가장 호출이 많이 될 거로 예상됩니다. 또한 많은 부하가 application 뿐만 아니라 DataBase에도 많은 I/O가 발생하여 많은 요청량에 대비하여야합니다.
- 회원 프로필에 생성을 어떻게 구현할건지 고민합니다.
    - 프로필에서 여러 가지 취향이나 음주 등 많은 질문들을 받아서 저장합니다. 그에 따라 많은 검색 조건이 생겨나는데 이를 효과적으로 구현하여야합니다.
    - 프로필 생성 후 대화 신청은 실시간 푸시 알림입니다. 이를 어떻게 구현할지 고민합니다.
    - 동시성에 대해 고민합니다.
- 클린 코드와 레이어드 아키텍처를 이용하여 협업에 용이하고 유지보수에 좋은 품질의 코드를 양산해 나갑니다.

# Tech Stack

---

- Back-end : Spring boot 2.7.6 + Java 11 + MarianaDB + JPA + Security + JWT
- devops : AWS + Docker + Jenkins
- front-end : react



# Git Flow

---

## GitFlow란?

GitFlow 전략을 사용하여 브랜치를 관리합니다.코드리뷰 : PR을 통해 Merge전 코드리뷰를 진행하여 사전에 발생할 수 있는 문제를 방지함과 동시에 함께 고민하고 개발을 진행합니다.

- Master : 제품으로 출시될 소스를 저장하는 브랜치입니다.
- Develop : 개발이 완료된 부분만 Merge합니다.
- Feature : 기능을 개발하는 브랜치 입니다.
- Hotfixs : Master 브랜치에서 발생한 버그를 수정하는 브랜치입니다.
    
    ![https://user-images.githubusercontent.com/59078557/211580433-6fd943c3-405e-4bb8-b95e-f522fe631278.png](https://user-images.githubusercontent.com/59078557/211580433-6fd943c3-405e-4bb8-b95e-f522fe631278.png)
    

## 작업방식

1. 메인 저장소를 fork 해온다.
2. fork 한 Repository를 clone 한다.
3. git remote add upstream <메인 저장소 주소>를 통해 upstream 설정을 한다.
4. git fetch를 통해 최신 코드를 받아온다
5. upstream/develop 브랜치에서 feature 브랜치를 생성한다.
6. 작업 완료된 fearure 브랜치를 origin 브랜치로 push 한다.
7. 해당 브랜치를 upstream으로 PR을 올린다.
8. 코드 리뷰 진행 후 Merge를 진행한다.



# 배포 파이프라인

---

![https://user-images.githubusercontent.com/77387861/212693158-8b1e4d21-e58f-47cc-87b1-e7bfd16211b9.png](https://user-images.githubusercontent.com/77387861/212693158-8b1e4d21-e58f-47cc-87b1-e7bfd16211b9.png)
