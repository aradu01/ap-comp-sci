# binary search; sort by selecting the next-smallest element

## binary search through an `OrderedArrayList_String`
Implement the standard

```
int index( String findMe)
```

except ignore the possibility that the list can have repeated values.

## construct an `OrderedArrayList_String` from an `ArrayList`
pseudocode:

``` 
for the number of items in the unordered input
    *reigning champ:* find smallest remaining key value
        add its value to the end of data
        null out its position in the unordered input
```

Sadly, this crushes the unordered input that the user-programmer
passed to the constructor. Please accept this deficiency 
in the name of incremental learning; we will fix it.

