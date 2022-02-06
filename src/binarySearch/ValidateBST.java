package binarySearch;

import org.junit.Test;

public class ValidateBST {

	public static void main(String[] args) {
		    BST root = new ValidateBST.BST(10);
		    root.left = new ValidateBST.BST(5);
		    root.left.left = new ValidateBST.BST(2);
		    root.left.left.left = new ValidateBST.BST(1);
		    root.left.right = new ValidateBST.BST(5);
		    root.right = new ValidateBST.BST(15);
		    root.right.left = new ValidateBST.BST(13);
		    root.right.left.right = new ValidateBST.BST(14);
		    root.right.right = new ValidateBST.BST(22);

		    ValidateBST.validateBst(root);
		  }

	
	
	  public static boolean validateBst(BST tree) {
		    return validateBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
		  }
			
			public static boolean validateBST(BST tree, int min, int max){
				if(tree == null)return true;
				
				if(tree.value < min || tree.value >= max)return false;
				
				if(tree.left != null && !validateBST(tree.left, min, tree.value)) return false;
				if(tree.right != null && !validateBST(tree.right, tree.value, max)) return false;
				
				return true;
			}

		  static class BST {
		    public int value;
		    public BST left;
		    public BST right;

		    public BST(int value) {
		      this.value = value;
		    }
		  }

}
