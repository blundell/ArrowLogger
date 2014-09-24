ArrowLogger
===========

Do you have a library that needs some initial setup like an api key or credentials and without these the library won't work?
Now you can use ArrowLogger to highlight this to the developers that use your library.

ArrowLogger allows you to manicly shake your hands infront of your users face and be like "Helllooo you missed this!". 


A logger for printing things like:

```
2228-2228/com.blundell.demo D/ArrowLog﹕ ` \        /  \        /  \        /  \        /  \        /  \        /  \        /  \        /
2228-2228/com.blundell.demo D/ArrowLog﹕ `  \      /    \      /    \      /    \      /    \      /    \      /    \      /    \      /
2228-2228/com.blundell.demo D/ArrowLog﹕ `   \    /      \    /      \    /      \    /      \    /      \    /      \    /      \    /
2228-2228/com.blundell.demo D/ArrowLog﹕ `    \  /        \  /        \  /        \  /        \  /        \  /        \  /        \  /
2228-2228/com.blundell.demo D/ArrowLog﹕ `     \/          \/          \/          \/          \/          \/          \/          \/
2228-2228/com.blundell.demo D/ArrowLog﹕ `==================================================================================================
2228-2228/com.blundell.demo D/ArrowLog﹕ `                                    You forgot to set the library api key!!
2228-2228/com.blundell.demo D/ArrowLog﹕ `==================================================================================================
2228-2228/com.blundell.demo D/ArrowLog﹕ `     /\          /\          /\          /\          /\          /\          /\          /\
2228-2228/com.blundell.demo D/ArrowLog﹕ `    /  \        /  \        /  \        /  \        /  \        /  \        /  \        /  \
2228-2228/com.blundell.demo D/ArrowLog﹕ `   /    \      /    \      /    \      /    \      /    \      /    \      /    \      /    \
2228-2228/com.blundell.demo D/ArrowLog﹕ `  /      \    /      \    /      \    /      \    /      \    /      \    /      \    /      \
2228-2228/com.blundell.demo D/ArrowLog﹕ ` /        \  /        \  /        \  /        \  /        \  /        \  /        \  /        \
```

###Useage

```java
ArrowLog.log("You forgot to set the library api key!!");
```

or for more control

```java
               ProArrowLog.pal()
                        .level(Level.D)
                        .tag("ArrowLog")
                        .width(7)
                        .height(5)
                        .log("You forgot to set the library api key!!")
                        .now();

```

###Adding as dependency

````groovy
repositories {
    jcenter()
}
`````

````groovy
dependencies {
    compile 'com.blundell:arrow-logger:COMING-SOON'
}
````

####License
-------

    (c) Copyright 2014 Paul Blundell

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
