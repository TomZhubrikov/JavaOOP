package lesson4_3;

public class MethodDemo {
    static <T extends Comparable <T>, V extends T> boolean array(T[] x, V[] y) {
        if (x.length != y.length) return false;
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 3, 4, 5};
        Integer nums4[] = {1, 2, 3, 4, 5, 6};

        if (array(nums, nums2)) {
            System.out.println("nums <=> nums2");
        }

        if (array(nums, nums2)) {
            System.out.println("nums <=> nums3");
        }

        if (array(nums, nums2)) {
            System.out.println("nums <=> nums4");
        }

        Double nums5[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        if (array(nums5, nums5)) {
            System.out.println("nums <=> nums4");
        }
    }
}
