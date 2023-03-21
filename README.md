# Bloom Filter
Bloom filter: No means 'No', Yes means 'Maybe'.

## What is Bloom Filter?
Bloom Filter is a probabilistic data structure that is used to test whether an element belongs to a dataset or not. False positive matches are possible, but false negatives are not. Elements can be added to the set, but not removed (though this can be addressed with a counting filter).

## Trade-off
Bloom filters have a trade-off between space efficiency and accuracy: they can produce false positives, meaning that they can sometimes report that an element is in the set when it is not.