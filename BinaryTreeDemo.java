import java.util.*;


class BinaryTree<T> {
	public T val = null;
	public BinaryTree<T> left_subtree = null;
	public BinaryTree<T> right_subtree = null;

	public BinaryTree(List<T> values) {
		int n = values.size();

		if (n > 0) {
			this.val = values.get(n/2);
			this.left_subtree = new BinaryTree<T>(values.subList(0, n/2));
			this.right_subtree = new BinaryTree<T>(values.subList(n/2 + 1, n));
		}
	}
	
	// in-order traversal
	public List<T> traverseInOrder() {
		if (this.val == null) return new ArrayList<T>();

		List<T> left, right;

		if (this.left_subtree == null) left = new ArrayList<T>();
		else left = this.left_subtree.traverseInOrder();

		if (this.right_subtree == null) right = new ArrayList<T>();
		else right = this.right_subtree.traverseInOrder();

		List<T> merged_list = new ArrayList<T>();
		merged_list.addAll(left);
		merged_list.add(this.val);
		merged_list.addAll(right);

		return merged_list;
	}
}


public class BinaryTreeDemo {
	public static void main(String[] args) {
		BinaryTree<Integer> btree = new BinaryTree<Integer>(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9}));
		System.out.println(btree.traverseInOrder().toString());
	}
}
