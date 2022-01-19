package com.sasha.CRUDwithHbn.controller;


import com.sasha.CRUDwithHbn.model.Label;
import com.sasha.CRUDwithHbn.service.LabelService;

import java.util.List;

public class LabelController {
    LabelService labelService = new LabelService();

    public Label saveNewLabel(Label label) {
       return labelService.saveNewLabel(label);
    }

    public List<Label> getAll() {
        return labelService.getAll();
    }

    public Label updateLabel(Label label) {
       return labelService.update(label);
    }

    public void deleteById(Integer id) {
        labelService.deleteById(id);
    }

    public Label getById(Integer id) {
        return labelService.getById(id);
    }
}
