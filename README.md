[ 4주차 과제 ]

1. 공공데이터포털에서 XML 파일 파싱
   - StringBuffer로 ServiceKey와 검색 년도 설정
   - url을 connect
   - Element root = getRootElement();
   - root 밑의 body 밑의 items 밑의 item 가져오기
   - list에 데이터 저장

2. DB에서 데이터 list 불러오기
   - DTO에 불러올 데이터 이름 선언
   - Mapper에서 resultType을 DTO의 주소로 설정 (com.su.settingWeb_boot.dto.StatisticDto)
   - DTO 리스트에 select 호출

3. 휴일 제외 로그인 수 출력
   - item list에 저장된 데이터(= 휴일)와 db에서 불러온 데이터를 비교
   - 같은 값이면 db 데이터 list에서 삭제
   - db 데이터 list의 size를 출력

[ 3주차 과제 ]

1. Access denied for user 'root'@'localhost' (using password: NO)
   - MySQL 접속 -> alter user 'root'@'localhost' identified with mysql_native_password by MYPASSWORD;

2. White Label Error Page
   - 실행할 클래스가 PROJECTNAMEApplication.java 파일 밑에 있어야 됨
   - 패키지 이름이 잘못되어 오류 발생

3. 다중 파라미터
   - 부서별 월별 로그인 수 검색 시 2개의 파라미터 필요
   - Mapper.xml에서 parameterType = hashmap으로 두고 
   - ServiceImpl에서 HashMap에 두 개의 String 저장한 뒤 map을 select문으로 전달

4. 휴일 제외 로그인 수 검색 구현 아직
   - 4주차에 제출 예정
