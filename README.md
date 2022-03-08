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
