public class practice5_typecasting {
    public static void main(String[] args) {
        int intValue = 200;
        //빈칸에 long타입 변수 longValue를 선언하고 변수를 intValue를 이용해 초기화해보세요.

        long longValue = intValue; //크기가 작은 타입을 크기가 더 큰 타입으로 바꿀 떄는 컴파일러에 별도에 명령을 하지 않아도된다.

        System.out.println(longValue);
    }
}
