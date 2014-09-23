ArrowLogger
===========


A logger for printing things like:

```
2228-2228/com.blundell.demo D/ArrowLog﹕ ` \        /  \        /  \        /  \        /  \        /  \        /  \        /  \        /
2228-2228/com.blundell.demo D/ArrowLog﹕ `  \      /    \      /    \      /    \      /    \      /    \      /    \      /    \      /
2228-2228/com.blundell.demo D/ArrowLog﹕ `   \    /      \    /      \    /      \    /      \    /      \    /      \    /      \    /
2228-2228/com.blundell.demo D/ArrowLog﹕ `    \  /        \  /        \  /        \  /        \  /        \  /        \  /        \  /
2228-2228/com.blundell.demo D/ArrowLog﹕ `     \/          \/          \/          \/          \/          \/          \/          \/
2228-2228/com.blundell.demo D/ArrowLog﹕ `==================================================================================================
2228-2228/com.blundell.demo D/ArrowLog﹕ `                                               Test
2228-2228/com.blundell.demo D/ArrowLog﹕ `==================================================================================================
2228-2228/com.blundell.demo D/ArrowLog﹕ `     /\          /\          /\          /\          /\          /\          /\          /\
2228-2228/com.blundell.demo D/ArrowLog﹕ `    /  \        /  \        /  \        /  \        /  \        /  \        /  \        /  \
2228-2228/com.blundell.demo D/ArrowLog﹕ `   /    \      /    \      /    \      /    \      /    \      /    \      /    \      /    \
2228-2228/com.blundell.demo D/ArrowLog﹕ `  /      \    /      \    /      \    /      \    /      \    /      \    /      \    /      \
2228-2228/com.blundell.demo D/ArrowLog﹕ ` /        \  /        \  /        \  /        \  /        \  /        \  /        \  /        \
```

###Useage

```java
ArrowLog.log("Test");
```

or for more control

```java
               ProArrowLog.pal()
                        .level(Level.D)
                        .tag("ArrowLog")
                        .width(7)
                        .height(5)
                        .log("Test")
                        .now();

```

Soon to be released to JCenter
