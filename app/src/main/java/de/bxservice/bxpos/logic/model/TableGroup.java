package de.bxservice.bxpos.logic.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego Ruiz on 13/11/15.
 */
public class TableGroup {

    String value;
    String name;
    List<Table> tables = new ArrayList<Table>();

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}