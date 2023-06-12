-generate Lexer

-generate Parser
  >antlr4 LTL_grammar/StlDraftParser.g4
  
-compile:
  >javac StlDraft*.java
  
- in order to run the property and draw the parse tree:
	
	>grun StlDraft stl_input -gui ptSTLproperty.txt
	 OR
	
	java org.antlr.v4.runtime.misc.TestRig StlDraft stl_input -gui ptSTLproperty.txt