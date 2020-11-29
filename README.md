### Spring-boot / Mybatis / Mariadb 연동 초기세팅

1. 개발환경

   > Project : Maven
   >
   > Spring Boot : 2.3.4
   >
   > Java Version : 8
   >
   > Dependencies : Spring Web / Spring Boot DevTools / MyBatis Framework / JDBC API / Spring Data JDBC / Mariadb JDBC

2. DB구성

   > test / member 테이블
   >
   > int ID / string name

3. 구성방식

   * config : SqlSessionFactory 방식 
   * domain : UserDomain( 유저 데이터 타입)
   * mapper : UserMapper (쿼리)
   * dao : 클래스 UserDao 로 데이터 연동(sqlSessionTemplate 사용)
   * service
     * UserService : 기본 인터페이스
     * UserServiceImpl : 구현  클래스
   * controller: 간단히 RestController로 조회
     * localhost:8080/users
     * localhost:8080/one?id=1

4. 연동기능

   1.  모든 회원 조회
   2.  id 값 일치한 회원 조회

