What is this project?
======

This a simple demonstration of `git-flow` using `sbt-release` to release a component AND there is no dependency to `git-flow`.

So, in order you use it let's assume:
 
* in `master` your *version.sbt* contains `ThisBuild := "0.9`
* in `develop` your *version.sbt* contains `ThisBuild := "0.10-SNAPSHOT`

When type this within the `develop` branch

```
$ sbt 'release with-defaults'
```

Then:
* in `master` your *version.sbt* now contains `ThisBuild := "0.10`
* in `develop` your *version.sbt* now contains `ThisBuild := "0.11-SNAPSHOT`
* there is a tag `0.10` with the contents of `master`

And that's it
