# Razomy notation `.rn`

- data file
- free-text descriptions
- layering
- composition
- key-value pairs


### Sample

```rn
key
key default
root
    node leaf
key default
    child
        key child
key default
    child default
# comment
\# not comment
key # not comment
key \# not comment
key default \# not comment
key default \## not comment
key default
    # comment
    \# not comment
    child

layer
 property value

layer
 property2 value
```