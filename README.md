ArrowLogger
===========


A logger for printing things like:

```java
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

`ArrowLog.log("Test");`

or for more control

```java
               ProArrowLog
                        .pal()
                        .level(Level.E)
                        .tag("ArrowLog")
                        .width(7)
                        .height(5)
                        .log("Test")
                        .now();

```

Soon to be released to JCenter
