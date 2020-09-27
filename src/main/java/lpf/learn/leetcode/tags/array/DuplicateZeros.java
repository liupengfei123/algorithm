package lpf.learn.leetcode.tags.array;

/** [1089]复写零
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 * 注意：请不要在超过该数组长度的位置写入元素。
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 *
 * 示例 1：
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 *
 * 示例 2：
 * 输入：[1,2,3]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,2,3]
 *
 * 提示：
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int[] newArr = new int[arr.length];

        int i = 0, j = 0, length = arr.length;
        while (j < length) {
            int temp = arr[i++];
            newArr[j++] = temp;
            if (temp == 0 && j < length) {
                newArr[j++] = temp;
            }
        }
        System.arraycopy(newArr, 0, arr, 0, length);
    }


    public void duplicateZeros2(int[] arr) {
        int i = 0;
        int zeroCount = 0;
        for (; i + zeroCount < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        int left = i - 1, right = left + zeroCount;
        while (left != right && left >= 0) {
            int temp = arr[left--];
            if (right < arr.length) {
                arr[right] = temp;
            }
            right--;
            if (temp == 0 && right < arr.length) {
                arr[right--] = temp;
            }
        }
    }
}
