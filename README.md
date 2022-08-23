# Compare Version

## Question
Util - 'compare versions'

Implement a utility (in Go, Python, or Java). Feel free to use a framework, if desired.

Compare two version numbers version1 and version2.

  If version1 > version2 return 1
  If version1 < version2 return -1
  otherwise return 0

You may assume that the version strings are non-empty and contain only digits and the 'dot' character. The 'dot' character does not represent a
decimal point and is used to separate number sequences. For instance '2.5' is not "two and a half" or "half way to version three", it is the fifth
second-level revision of the second first-level revision.

Here is an example of version numbers ordering: 0.1 < 1.1 < 1.2 < 1.2.9.9.9.9 < 1.3 < 1.3.4 < 1.10


## Description 
This code, compare two version strings in format X.X.X... and return the following results

  - 0 when the versions are identical or similar
  - 1 when first version is greater than the second one
  - -1 when the second version is greater than the first one
  
## How to compile
 From the root folder, run the following command.
 
```javac -d classes src/compareversion/ahsun/com/App.java src/compareversion/ahsun/com/VersionComparer.java```

## How to run
  From the root folder, run the following command.
  
```java -cp classes compareversion.ahsun.com.App```

## How to test
From the rool folder, run the following commands.

```javac -cp lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar;. src/compareversion/ahsun/com/tests/VersionComparerTests.java src/compareversion/ahsun/com/VersionComparer.java src/compareversion/ahsun/com/App.java -d classes```

```java -jar lib/junit-platform-console-standalone-1.9.0.jar -cp classes --scan-classpath```

## Screenshot
<img width="594" alt="image" src="https://user-images.githubusercontent.com/26001761/186183712-751ed22e-009a-495c-9370-224757e3d062.png">
