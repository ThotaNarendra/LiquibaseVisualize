package com.visualizer.asci.visualizer.controller;

import com.visualizer.asci.visualizer.model.Table;
import com.visualizer.asci.visualizer.service.VisualizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VisualizerController {

    @Autowired
    private VisualizerService visualizerService;

    @GetMapping("/getSchemaTables")
    Map<String, Table> getSchemaTables(){

        return visualizerService.getSchemaTables();
    }
    @GetMapping("/getSchemaTable/{tableName}")
    Table getSchemaTable(@PathVariable String tableName){

        return visualizerService.getSchemaTable(tableName);
    }
    @GetMapping("/getAllChangeSets")
    Map<String, Table>  getSchemaTable(){

        return visualizerService.ChangeLog_TillTag_1_X_FINAL();
    }
}
