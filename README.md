
 ----------------------
| PS weekly assignment |
 ----------------------
## WEEK 1 BATCH 1  
link - https://github.com/mukeshbasira/simple-java-maven-app/tree/week6/JenkinsAssignment
- Build will be triggered on 12:51 AM everyday( 51 0 * * * (jenkins trigger))

## WEEK 2 BATCH 2
link - https://github.com/mukeshbasira/simple-java-maven-app/tree/week6/MongoDB_Assignment
![Alt text](MongoDB_Assignment/UML.png?raw=true "UML_Diagram_For_DB")

## WEEK 3 BATCH 1
link -  https://github.com/mukeshbasira/simple-java-maven-app/tree/week6/Prime_Name


Accept username from user and print prime equivalent of that
example -
 FADE -> d,2,7,b. (hexadecimal equivalent)

## WEEK 4 BATCH 1
link -  https://github.com/mukeshbasira/simple-java-maven-app/tree/week6/Synonym-Finder/src/Language

Write a java program to accept the string which will give the synonym of the given word, considering below scenario.

1. Initialise a static map with the data structure : Map<String, Set<String>>, which holds the given value

GoodMorning
                GoodMorning
                Shubhodaya
                Shubhohday
                Bonjour

GoodEvening
                good Evening
                Shubha sange
                susandhya
                Bonsoir

2. use scanner to accept the string from the end user, assuming if the user gives: GoodMorning, show the values associated for the same.

3. When the user gives GoodBye, which is not there in the Map, ask user if he/she want to add that to the list, when pressed "1", then ask for the synonym in the loop till user enters a empty string, and the given word and synonym to be updated in the map.



## WEEK 5 BATCH 1  
link - https://github.com/mukeshbasira/simple-java-maven-app/tree/week6/QuizApp

Write a java program, to build a quiz application with the below requirements

1. The user should be asked for the question in below format
 
1. who is president of india
a. Donald Trump
b. Ramnath Kovind
c. Narendra Modi
d. None

upon showing the question which is stored in the list (about 10 questions), the user should be allowed to ask the option. 

2. If the user selects correct option show next question failing which a message to be shown "Sorry wrong answer", with the next question.

3. if the user does not answer the question given within 10 seconds then the application to be exited with the message "TIMEOUT!!!"


Helper / Hint:

1. class definition
class Question {
                private String question;
                private String opt1, opt2, opt3, opt4;
                private String correctOpt;
}

2. user daemon threads to tracking
(didn't used threads as of now + Using  TimerTask )
    --- !! working on thread method ---







## WEEK 6 BATCH 1  
link - https://github.com/mukeshbasira/simple-java-maven-app/tree/week6/HTML_CSS-Project

Question: Consider an application to be developed for various size devices like desktop, tablet, mobile.  And the company wants to test with the POC (Proof Of Concept), below are the requirements.


1. Considering the application is loaded on desktop with size 786*600px the page should load the text with Arial, 36pt, Blue Color.
 2.  When the page is loaded with 300x350 px then the fonts to be Helvetica, 24pt,, and in Red Color.

3.  And when the screen size happens to be 100x100 then font Courier, 18pt, Purple color.





------------------------------------------------------------------------
