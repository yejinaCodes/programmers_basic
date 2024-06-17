public class practice11_logicalOperator {
    public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        // 아래 빈칸을 채워 코드를 완성하세요.
        if(age <= 19 || age >= 60) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }

    public static void main(String[]args) {
        practice11_logicalOperator exam = new practice11_logicalOperator();
        System.out.println(exam.isAgeDiscountable(25));
        exam.isAgeDiscountable(27);
    }

}
