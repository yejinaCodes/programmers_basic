public class practice10_conditional2 {
    public int conditionTest(int value){
        // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }else if(value % 4 == 0) {
            ret = 4;
        }// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.

        // 결과 체크를 위한 코드입니다.
        return ret;
    }

    //아래는 실행을 위한 코드입니다. 수정하지 마세요.
    public static void main(String[]args){
        practice10_conditional2 exam = new practice10_conditional2();
        //System.out.println(exam.conditionTest(6));
        //System.out.println(exam.conditionTest(8));
    }
}
