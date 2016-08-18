/*
 * 输入是一个字符串数组，一个int数组，输入的字符串数组是另外一个字符串数组通过
 * int数组变换得到的，int数组的值代表的是原来这位置上的字符串经过变换后的坐标， 
 * 然后输出是求变换之前的字符串数组，要求用线性时间，o(1)额外空间 
 * 打个比方，比如一个字符串数组是"cat", "rabbit","dog", "mouse"，int数组给的2,0
 * ,3,1，意思是string数组第0个词是cat，它本来的位置是在哪呢，我们要看int数组， 
 * int数组的0在index 1上，所以说cat之前应该是1号位的，同理rabbit在string数组的1 
 * 号位，而index数组3号位的值是1，说明rabbit这个词之前应该在3号位上的，依次类推 
 * ，所以变换前的字符串数组应该是 dog, cat, mouse, rabbit 
 *
 * 再打个比方，如果输入是Cat mouse dog rabbit和2,0,1,3，输出也会是dog, cat,
 * mouse, rabbit 
 * 再打个比方，如果输入是Cat mouse dog rabbit, tiger, lion和2,0,1,3,5,4，输出会
 * 是dog, cat ,moutse, rabbit, lion, tiger 
 * 这个题感觉从变换前的数组求变换后的数组很好做，假设string数组是S，int数组是A
 * ， 直接一位一位循环遍历，当A[i] != i 时候把A[i] 与 A[A[i]]以及S[i] 与S[A[i]] 
 * 一直调换就可以了
 * 但这个题是要从变换后的数组求变换前的数组，做了半天也没做出个好的解法，估计跪 了
 */
public class G1 {
	public static void main(String[] args) {
		System.out.println("hello g1");
	}
}
