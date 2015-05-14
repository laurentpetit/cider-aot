# cider-aot-issue

minimalistic project demonstrating `cider-nrepl` issue with AOT compilation.

# usage

```
cider-aot % lein run
Started nREPL server - nrepl://127.0.0.1:49338
^C
cider-aot % lein clean
cider-aot % lein uberjar
Compiling cider-aot
Created /Users/laurentpetit/tmp/cider-aot/target/cider-aot-0.1.0-SNAPSHOT-standalone.jar
cider-aot % java -cp target/cider-aot-0.1.0-SNAPSHOT-standalone.jar clojure.main -m cider-aot
Started nREPL server - nrepl://127.0.0.1:49340
^C
cider-aot % java -jar target/cider-aot-0.1.0-SNAPSHOT-standalone.jar
^C
cider-aot % 
```

- `lein run` works
- Uberjar doesn't work

