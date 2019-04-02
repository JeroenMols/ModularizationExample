# About
While there are quite some good Android sample projects available such as [Plaid](https://github.com/nickbutcher/plaid), [Bandhook](https://github.com/antoniolg/Bandhook-Kotlin) or [Sunflower](https://github.com/googlesamples/android-sunflower), there isn't one that only focusses on how to architect/configure a multi-module application.

This repository demonstrates a clearly defined, hierarchical three-layered architecure consisting of

- one App module
- several feature modules: login, dashboard and sharing
- several library modules: actions, ui-components

It shows how to split an app in logical vertical slices, how to handle in-feature and across feature navigation (using navigation components), how each module can be tested and how to organize dependencies and build.gradle files.

To learn more, have a look at the following posts:

- [Architecture description & benefits](https://jeroenmols.com/blog/2019/03/18/modularizationarchitecture/)
- [Walkthrough of sample code](https://jeroenmols.com/blog/2019/04/02/modularizationexample/)
