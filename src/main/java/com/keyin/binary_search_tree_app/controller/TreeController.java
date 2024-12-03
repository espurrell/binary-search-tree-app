package com.keyin.binary_search_tree_app.controller;

import com.keyin.binary_search_tree_app.service.TreeService;
import com.keyin.binary_search_tree_app.model.TreeInput;
import com.keyin.binary_search_tree_app.repository.TreeInputRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;



import java.util.Map;
import java.util.List;

@Controller
public class TreeController {
    private final TreeService treeService;

    public TreeController(TreeService treeService) {
        this.treeService = treeService;

    }

    @GetMapping("/enter-numbers")
    public String enterNumbers() {
        return "numbers";
    }

    @PostMapping("/process-numbers")
    @ResponseBody
    public String processNumbers(@RequestParam String numbers) {
        return treeService.processNumbers(numbers);
    }

    @GetMapping("/previous-trees")
    public String showPreviousTrees(Map<String, Object> model) {
        model.put("trees", treeService.getAllTrees());
        return "previous";
    }


}
