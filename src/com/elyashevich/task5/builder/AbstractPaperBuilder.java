package com.elyashevich.task5.builder;


import com.elyashevich.task5.entity.PaperEdition;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class AbstractPaperBuilder {
    protected Set<PaperEdition> paperEditions;
    public AbstractPaperBuilder() {
        paperEditions = new LinkedHashSet<>();
    }
    public AbstractPaperBuilder(Set<PaperEdition> paperEditions) {
        this.paperEditions = paperEditions;
    }
    public Set<PaperEdition> getPapers() {
        return Collections.unmodifiableSet(paperEditions);
    }
    public abstract void buildSetPaperEdition(String fileName);
}
