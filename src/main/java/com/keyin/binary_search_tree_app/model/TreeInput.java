package com.keyin.binary_search_tree_app.model;

import jakarta.persistence.*;

@Entity
public class TreeInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String inputNumbers;
    @Lob
    private String treeStructure;

    // Default constructor
    public TreeInput() {
    }

    // Parameterized constructor
    public TreeInput(String inputNumbers, String treeStructure) {
        this.inputNumbers = inputNumbers;
        this.treeStructure = treeStructure;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInputNumbers() {
        return inputNumbers;
    }

    public void setInputNumbers(String inputNumbers) {
        this.inputNumbers = inputNumbers;
    }

    public String getTreeStructure() {
        return treeStructure;
    }

    public void setTreeStructure(String treeStructure) {
        this.treeStructure = treeStructure;
    }

    @Override
    public String toString() {
        return "TreeInput{" +
                "id=" + id +
                ", inputNumbers='" + inputNumbers + '\'' +
                ", treeStructure='" + treeStructure + '\'' +
                '}';
    }
}

