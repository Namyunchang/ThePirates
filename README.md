# ThePirates
1. http://localhost:8080/api/insertStore 실행시 개발 API A번 실행
2. http://localhost:8080/api/insertHoliday 실행시 개발 API B번 실행
3. http://localhost:8080/api/getStoreList 실행시 개발 API C번 실행
4. http://localhost:8080/api/getStoreDetail 실행시 개발 API D번 실행
5. http://localhost:8080/api/deleteStore 실행시 개발 API E번 실행


쿼리문 작성
CREATE TABLE STORES
(ID NUMBER PRIMARY KEY,
NAME VARCHAR2(30),
ONWER VARCHAR2(30),
DESCR VARCHAR2(500),
LEVEL2 NUMBER,
ADDRESS VARCHAR2(3000),
PHONE2 VARCHAR2(500),
HOLIDAYS VARCHAR2(300));

CREATE SEQUENCE ID_SEQ
START WITH 1
INCREMENT BY 1
NOCACHE;
