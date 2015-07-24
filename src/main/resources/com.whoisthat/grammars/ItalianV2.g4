grammar Italian;

game
    : question '?'
    | SOLUTION  ( '!' | EOF )
    ;

question
    : haveQuestion | beQuestion | wearQuestion ;

haveQuestion
	: HAVE look
	;

beQuestion
    : BE person
    ;

wearQuestion
    : WEAR ACCESSORY
    ;

WORD
	: [\w\s]+
	;

ADJECTIVE
    : (['a'-'z'])+
    ;

SOLUTION
	: ['A'-'Z']? (['a'-'z'])+
	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines