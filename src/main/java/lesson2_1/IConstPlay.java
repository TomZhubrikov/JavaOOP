package lesson2_1;

public class IConstPlay implements iConst {
    public static void main(String[] args) {
        int nums[] = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            if (i == MAX) {
                System.out.println(ERROR);
            } else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }

        }
    }
}
