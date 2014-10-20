package com.hichao.elasticsearch.plugin;

import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.AbstractPlugin;

import com.hichao.elasticsearch.index.SimpleSimilarityProvider;

public class SimpleSimilarityPlugin extends AbstractPlugin {
    public String name() {  
        return "similarity-simple";  
    }  

    public String description() {
        return "Simple similarity plugin";
    }

    public void onModule(SimilarityModule module){
        module.addSimilarity("simple", SimpleSimilarityProvider.class);
    }
}
