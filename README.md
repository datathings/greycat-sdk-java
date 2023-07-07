# Code generation
```bash
greycat codegen --target=java "${PWD}/src/main/java"
for lib in 'algebra';do
  greycat codegen --target=java --lib=${lib} "${PWD}/src/main/java"
done
```