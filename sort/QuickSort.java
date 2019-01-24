
/**
 * 快速排序
 *
 * @author weixing
 * @date 2019/1/24 10:21
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        quickSort(a, a.length);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    /**
     * 快速排序，a是数组，n表示数组的大小
     *
     * @param a
     * @param n
     * @return
     * @author weixing
     * @date 2019/1/24 13:53
     */
    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n - 1);
    }

    /**
     * 快速排序递归函数，p,r为下标
     *
     * @param a
     * @param p
     * @param r
     * @author weixing
     * @date 2019/1/24 13:54
     */
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        // 获取分区点
        int q = partition(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

        System.out.println("i=" + i);
        return i;
    }
}
