# Spring 프로젝트

## 파일 정보

java 파일
- DataLoader.java: 초기 데이터 삽입 테스트용 클래스
- Store.java: MongoDB Document 클래스
- StoreController.java: REST Controller 클래스
- StoreDTO.java: DTO 클래스
- StoreRepository.java: MongoDB와 상호작용하기 위한 레포지토리 클래스
- StoreService.java: 서비스 클래스
- WebConfig.java: CORS 설정
- UmbrellaController.java: 우산 개수 등록, 수정 Controller
- UmbrellaService.java: 우산 서비스 클래스
- UmbrellaBorrowReturnController.java: 우산 대여/반납 Controller
- UmbrellaBorrowReturnService: 우산 대여/반납 서비스 클래스

resources 파일
- application.yaml: MongoDB Atlas 정보 설정

## DB 정보

MongoDB 필드
- id(식별정보), name(가게이름), address(주소), umbrellaCount(우산 개수)
