package com.visualizer.asci.visualizer.parser;

import com.visualizer.asci.visualizer.model.Table;
import java.io.File;
import java.util.Map;

public interface LiquibaseChangesetParser {

    Map<String, Table> parse(File inputFile, String tillTag);

    static LiquibaseChangesetParser xmlParser(LoggingFacade loggingFacade) {
        return new LiquibaseChangesetXMLParser(loggingFacade);
    }

}
