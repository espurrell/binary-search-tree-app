package com.keyin.binary_search_tree_app.model;

public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    // Constructor
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value
    public void setValue(int value) {
        this.value = value;
    }

    // Getter for left child
    public TreeNode getLeft() {
        return left;
    }

    // Setter for left child
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    // Getter for right child
    public TreeNode getRight() {
        return right;
    }

    // Setter for right child
    public void setRight(TreeNode right) {
        this.right = right;
    }

    // Utility method to check if the node is a leaf
    public boolean isLeaf() {
        return left == null && right == null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + (left != null ? left.value : "null") +
                ", right=" + (right != null ? right.value : "null") +
                '}';
    }
}
