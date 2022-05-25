# Identifer Program

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Program made for learning mutation test

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Specs

 IDE: Eclipse 22.05
 OS: Windows 10
 Plugins ultilized: EclEmma, Junit and Pit Test
 
 -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 # Where do I have to put the files?
 
  Ientifier.java: Must to be in src/main/java
  IdentifierTestCase.java: Must to be in src/test/java
  junit-4.11.jar: Must to be in Project path, so the way is Alt+Enter -> Java Build Path -> Libraries -> Add External jar's
  hamcrest-core-1.3.jar: Must to be in Project path, so the way is Alt+Enter -> Java Build Path -> Libraries -> Add External jar's
  
  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  # Observations
  
  The IDE utilized was Eclipse 'cause he runs with the three plugins, others i don't know others IDE's for use them, for exampe, in JetBrains don't run.
  
  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  # About Pit Mutation Test
  
  If you run PIT MUTATION TEST or Junit coverage in the way that the program is, you will realize that 1 branch don't is covered at all, beacuse this software is optimized 
  badly, so, to solve it, chace the line  "if ( valid_id && (s.length() >= 1) && (s.length() <= 6))" to   "if ((s.length() >= 1) && valid_id && (s.length() <= 6))", and then 
  all the line will be covered. Finally, if you want to solve the majority of mutations as possible, access Window -> Preferences -> Pitest -> Mutators -> All Mutators.
  
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
