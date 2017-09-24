Dagger 2 Example Application
============================

An example modular application built with Dagger 2 for the purpose of my blog post. It shows some
useful design patterns.

Building and running
--------------------

The branch `jigsaw-edition` contains a variant of the original example that makes use of JDK 9
module system. To build it, you need:

 - JDK 9
 - Gradle 4.2

When you load the project into the IDE for the first time, it will complain about a missing
class in `app-sample` subproject. This is intended, because Dagger 2 is about code generation.
You must build the project in order to generate the missing class.

Building:

```
$ gradle :build
```

License
-------

The example is available as a public domain.

Author: Tomasz Jędrzejewski ([www.zyxist.com](https://www.zyxist.com/))
