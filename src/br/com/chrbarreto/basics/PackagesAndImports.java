// comments in the top os ok.

package br.com.chrbarreto.basics; // If there is a package, it must be the first non comment line

// if there are imports, they must come after the package and before any member declaration
import javax.swing.*; // imports all the classes from javax.swing, and nothing in a lower level. not recursive
//import javax.*.* illegal. you cant have a wildcard in the middle of an import, just in the end. 

// classes with the same name.
// ex: java.util.date vs java.sql.date

import java.util.Date;
import java.sql.*;

// this won't compile, because there is a ambiguity:
//import java.util.Date;
//import java.sql.Date;

//this also won't compile if you try to use the Date class, otherwise it is okay.
//import java.util.*;
//import java.sql.*;

public class PackagesAndImports {

	public static void main(String[] args) {
		Date date = new Date(); // uses java.util.Date because, although java.sql also has a Date class, the compoler gives priority to the import that specifically named the class Date
		
	}

}
