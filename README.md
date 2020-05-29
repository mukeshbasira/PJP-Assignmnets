
 ----------------------
| PS weekly assignment |
 ----------------------


## WEEK 5 BATCH 1  
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




------------------------------------------------------------------------
