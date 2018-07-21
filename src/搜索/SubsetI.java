package 搜索;
/**
 * Given a set of distinct integers, S, return all possible subsets.
 * For example, If S = [1,2,3], a solution is: [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 *
 */
/**
Subset这道题的条件比较直观，就是每当我们添加了一个元素，都是一个新的子集。
那么我们怎么保证不会出现重复集合呢。我们引入一个int pos用来记录此子集的起点在哪，比如当pos = 1的时候就是从第二个元素往后循环添加元素（0 base）,
每次当此层用了第i个元素，那么下一层需要传入下一个元素的位置i+1 除此之外，当循环结束要返回上一层dfs的时候我们需要把这一层刚添加元素删去。
*/
public class SubsetI {
	
}
