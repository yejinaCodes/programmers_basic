public class practice12_logicalOperator2 {
    public boolean isAgeTwenties(int age) {
        boolean isTwenties = false;
        //아래 빈칸을 채워 코드를 완성하세요.
        if(age >19 && age < 30) {
            isTwenties = true;
        }
        else {
            isTwenties = false;
        }
        return isTwenties;
    }

    public static void main(String[] args) {
        practice12_logicalOperator2 exam = new practice12_logicalOperator2();
        System.out.println(exam.isAgeTwenties(19));
        exam.isAgeTwenties(25);
    }

}
