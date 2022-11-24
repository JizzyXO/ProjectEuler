public class TaskNumber3 {
    public static void taskNumber3(){
        int i =1;
        long num = 600851475143L;
        while (num != 0) {
            i++;
            if ((num % i)==0) {
                num = num / i;
                System.out.println(i);
            }
        }
    }
}
