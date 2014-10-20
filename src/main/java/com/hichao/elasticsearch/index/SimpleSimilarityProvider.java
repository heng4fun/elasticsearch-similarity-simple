package com.hichao.elasticsearch.index;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;


public class SimpleSimilarityProvider extends AbstractSimilarityProvider {

    private final SimpleSimilarity similarity;

    @Inject
    public SimpleSimilarityProvider( @Assisted String name, @Assisted Settings settings) {
        super(name);
        this.similarity = new SimpleSimilarity();
    }

    public SimpleSimilarity get() {
        return similarity;
    }
}