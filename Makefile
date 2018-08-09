# Serves as an example Makefile for java

# define compiler and flag variable - easy to modify and update
JFLAGS=-g
JC=javac
JA=java

# (Optional) Clear defualt targets for building .class file from .Java.
.SUFFIXES: .java .class

# Target entry for compiling java files. '$*' gets the bashname for target
.java.class:
	$(JC) $(JFLAGS) $*.java

# TODO Macro containing all java source files
SRC=HelloWorld.java

# The default target entry
default: classes

# Target with all classes
# 	Suffixe exchange wthin marco - shortcut to list all .class files.
classes: $(SRC:.java=.class)

# Execute the compiled files
run:
	$(JA) $(SRC:.java=)

# Clean up the files
clean:
	rm -f *.class
