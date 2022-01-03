package com.visualizer.asci.visualizer.service;

import com.visualizer.asci.visualizer.model.Table;
import com.visualizer.asci.visualizer.parser.LiquibaseChangesetXMLParser;
import com.visualizer.asci.visualizer.parser.LoggingFacade;
import org.springframework.stereotype.Service;
import java.io.File;
import java.util.Map;

@Service
public class VisualizerService {

    public Table getSchemaTable(String tableName){

        Map<String, Table> parsedTables = new LiquibaseChangesetXMLParser().parse(new File("C:\\Users\\Thota Narendra\\WorkDetails\\Intellij-Projects\\visualizer\\src\\main\\resources\\simpleChangeSet.xml"),null);
        return  parsedTables.get(tableName);
    }
    public Map<String, Table> getSchemaTables(){

        Map<String, Table> parsedTables = new LiquibaseChangesetXMLParser().parse(new File("C:\\Users\\Thota Narendra\\WorkDetails\\Intellij-Projects\\visualizer\\src\\main\\resources\\simpleChangeSet.xml"),null);
        return  parsedTables;
    }

    public Map<String, Table>  ChangeLog_TillTag_1_X_FINAL() {

        Map<String, Table> parsedTables = new LiquibaseChangesetXMLParser(new LoggingFacade() {
            @Override
            public void logIgnoredElement(String element) {

            }

            @Override
            public void logUnsupportedElement(String element) {
                System.out.println("Unsupported element '" + element + "' detected");
            }

            @Override
            public void logParsingError(File inputFile, Exception cause) {

            }
        }).parse(new File("C:\\Users\\Thota Narendra\\WorkDetails\\Intellij-Projects\\visualizer\\src\\main\\resources\\db\\db.changelog-master.xml"), "1.X.FINAL");
        return  parsedTables;
    }
}
