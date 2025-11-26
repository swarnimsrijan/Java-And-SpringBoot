# File Class
- represent the path of a file or a directory in file system

## Create File Object
- you first create a File object by passing the file name or path as a string.
```aiignore
import java.io.File;  // Import the File class
File myObj = new File("filename.txt");  // Specify the filename
```
### File Class Constructors
- File(File parent, String child)
- File(String pathname)
- File(String parent, String child)
- File(URI uri)
### File Class Methods
- getName()
- getAbsolutePath()
- canRead()
- canWrite()
- exists()
- isDirectory()
- isFile()
- length()
- createNewFile()
- delete()
- list()
- mkdir()