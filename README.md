elasticsearch-similarity-simple
===============================

Simple implementation of elatisicsearch similarity.

Only use unique term number to calcualte similarity.

When update an exist index, first close the index, then use the following script to update:

curl -XPOST 'http://host:port/tweeter/' -d '
{
  "settings": {
    "similarity": {
      "index": {
        "type": "com.hichao.elasticsearch.index.SimpleSimilarityProvider"
      },
      "search": {
        "type": "com.hichao.elasticsearch.index.SimpleSimilarityProvider"
      }
    }
  }
}'

When create an new index, One can use settings as follows:

"index.similarity.search.type":"org.elasticsearcsh.infoso.plugin.similarity.InfosoSimilarityProvider"
"index.similarity.index.type":"org.elasticsearch.infoso.plugin.similarity.InfosoSimilarityProvider"
