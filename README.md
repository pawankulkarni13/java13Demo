## Java13

Sept 2019 Release

Any Preview features which are developed for Developers can be used
using command line arg. These are developmental features and not into production. These can be removed in future release based on the feedback.
You can view the build.gradle file for more details. 


`--enable-preview`

This can be added in command line too. As below

`java --enable-preview --source 13 AppTest.java`

### Switch Expression
Since J12, switch expression new features are introduced.
As part of J13, we have a "yield" statement now.
https://openjdk.java.net/jeps/354

### Text Blocks
This is another Preview feature added.
This can be helpful when using a json like string in code.
`String TEXT_BLOCK_JSON = """
 {
     "firstName" : "Pawan",
     "lastName" : "Kulkarni"
 }
 """;`
 
String now has three new methods to manipulate text blocks:

stripIndent() – mimics the compiler to remove incidental white space
translateEscapes() – translates escape sequences such as “\\t” to “\t”
formatted() – works the same as String::format, but for text blocks

This is preview so might be removed in future releases.

### File System New Utility Methods
Three new methods have been added to java.nio.file.FileSystems to make it easier to use file system providers that treat the contents of a file as a file system.

newFileSystem(Path)
newFileSystem(Path, Map<String, ?>)
newFileSystem(Path, Map<String, ?>, ClassLoader)

### Other Features
#### Dynamic CDS Archives (JEP 350)
#### ZGC
