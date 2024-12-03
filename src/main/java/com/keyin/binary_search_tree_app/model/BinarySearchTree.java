package com.keyin.binary_search_tree_app.model;

public class BinarySearchTree {
    private TreeNode root;

    // Constructor
    public BinarySearchTree() {
        this.root = null;
    }

    // Insert a value into the binary search tree
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    // Recursive helper method for insertion
    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.getValue()) {
            node.setLeft(insertRecursive(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insertRecursive(node.getRight(), value));
        }
        return node;
    }

    // Getter for the root of the tree
    public TreeNode getRoot() {
        return root;
    }

    // Serialize the tree to a JSON-like string
    public String toJson(TreeNode node) {
        if (node == null) {
            return "null";
        }
        return String.format("{\"value\": %d, \"left\": %s, \"right\": %s}",
                node.getValue(), toJson(node.getLeft()), toJson(node.getRight()));
    }

    // Convert the entire tree to JSON starting from the root
    public String toJson() {
        return toJson(root);
    }

    // Utility method to check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // In-order traversal of the tree
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    // In-order traversal starting from the root
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    // Height of the tree
    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Height of the tree starting from the root
    public int getHeight() {
        return getHeight(root);
    }
}

